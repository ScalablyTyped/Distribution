package typings.jalaaliJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jalaali-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def d2g(jdn: Double): GregorianDateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("d2g")(jdn.asInstanceOf[js.Any]).asInstanceOf[GregorianDateObject]
  
  inline def d2j(jdn: Double): JalaaliDateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("d2j")(jdn.asInstanceOf[js.Any]).asInstanceOf[JalaaliDateObject]
  
  inline def g2d(gy: Double, gm: Double, gd: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("g2d")(gy.asInstanceOf[js.Any], gm.asInstanceOf[js.Any], gd.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isLeapJalaaliYear(jy: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapJalaaliYear")(jy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidJalaaliDate(jy: Double, jm: Double, jd: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidJalaaliDate")(jy.asInstanceOf[js.Any], jm.asInstanceOf[js.Any], jd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def j2d(jy: Double, jm: Double, jd: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("j2d")(jy.asInstanceOf[js.Any], jm.asInstanceOf[js.Any], jd.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def jalCal(jy: Double): JalCalResult = ^.asInstanceOf[js.Dynamic].applyDynamic("jalCal")(jy.asInstanceOf[js.Any]).asInstanceOf[JalCalResult]
  
  inline def jalaaliMonthLength(jy: Double, jm: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jalaaliMonthLength")(jy.asInstanceOf[js.Any], jm.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toGregorian(jy: Double, jm: Double, jd: Double): GregorianDateObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toGregorian")(jy.asInstanceOf[js.Any], jm.asInstanceOf[js.Any], jd.asInstanceOf[js.Any])).asInstanceOf[GregorianDateObject]
  
  inline def toJalaali(date: js.Date): JalaaliDateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("toJalaali")(date.asInstanceOf[js.Any]).asInstanceOf[JalaaliDateObject]
  inline def toJalaali(gy: Double, gm: Double, gd: Double): JalaaliDateObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toJalaali")(gy.asInstanceOf[js.Any], gm.asInstanceOf[js.Any], gd.asInstanceOf[js.Any])).asInstanceOf[JalaaliDateObject]
  
  trait GregorianDateObject extends StObject {
    
    /** Gregorian day */
    var gd: Double
    
    /** Gregorian month */
    var gm: Double
    
    /** Gregorian year */
    var gy: Double
  }
  object GregorianDateObject {
    
    inline def apply(gd: Double, gm: Double, gy: Double): GregorianDateObject = {
      val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GregorianDateObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GregorianDateObject] (val x: Self) extends AnyVal {
      
      inline def setGd(value: Double): Self = StObject.set(x, "gd", value.asInstanceOf[js.Any])
      
      inline def setGm(value: Double): Self = StObject.set(x, "gm", value.asInstanceOf[js.Any])
      
      inline def setGy(value: Double): Self = StObject.set(x, "gy", value.asInstanceOf[js.Any])
    }
  }
  
  trait JalCalResult extends StObject {
    
    /** Gregorian year of the beginning of Jalaali year */
    var gy: Double
    
    /** Number of years since the last leap year (0 to 4) */
    var leap: Double
    
    /** The March day of Farvardin the 1st (1st day of jy) */
    var march: Double
  }
  object JalCalResult {
    
    inline def apply(gy: Double, leap: Double, march: Double): JalCalResult = {
      val __obj = js.Dynamic.literal(gy = gy.asInstanceOf[js.Any], leap = leap.asInstanceOf[js.Any], march = march.asInstanceOf[js.Any])
      __obj.asInstanceOf[JalCalResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JalCalResult] (val x: Self) extends AnyVal {
      
      inline def setGy(value: Double): Self = StObject.set(x, "gy", value.asInstanceOf[js.Any])
      
      inline def setLeap(value: Double): Self = StObject.set(x, "leap", value.asInstanceOf[js.Any])
      
      inline def setMarch(value: Double): Self = StObject.set(x, "march", value.asInstanceOf[js.Any])
    }
  }
  
  trait JalaaliDateObject extends StObject {
    
    /** Jalaali day */
    var jd: Double
    
    /** Jalaali month */
    var jm: Double
    
    /** Jalaali year */
    var jy: Double
  }
  object JalaaliDateObject {
    
    inline def apply(jd: Double, jm: Double, jy: Double): JalaaliDateObject = {
      val __obj = js.Dynamic.literal(jd = jd.asInstanceOf[js.Any], jm = jm.asInstanceOf[js.Any], jy = jy.asInstanceOf[js.Any])
      __obj.asInstanceOf[JalaaliDateObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JalaaliDateObject] (val x: Self) extends AnyVal {
      
      inline def setJd(value: Double): Self = StObject.set(x, "jd", value.asInstanceOf[js.Any])
      
      inline def setJm(value: Double): Self = StObject.set(x, "jm", value.asInstanceOf[js.Any])
      
      inline def setJy(value: Double): Self = StObject.set(x, "jy", value.asInstanceOf[js.Any])
    }
  }
}

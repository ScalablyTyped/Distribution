package typings.jalaaliJs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jalaali-js", "d2g")
  @js.native
  def d2g(jdn: Double): GregorianDateObject = js.native
  
  @JSImport("jalaali-js", "d2j")
  @js.native
  def d2j(jdn: Double): JalaaliDateObject = js.native
  
  @JSImport("jalaali-js", "g2d")
  @js.native
  def g2d(gy: Double, gm: Double, gd: Double): Double = js.native
  
  @JSImport("jalaali-js", "isLeapJalaaliYear")
  @js.native
  def isLeapJalaaliYear(jy: Double): Boolean = js.native
  
  @JSImport("jalaali-js", "isValidJalaaliDate")
  @js.native
  def isValidJalaaliDate(jy: Double, jm: Double, jd: Double): Boolean = js.native
  
  @JSImport("jalaali-js", "j2d")
  @js.native
  def j2d(jy: Double, jm: Double, jd: Double): Double = js.native
  
  @JSImport("jalaali-js", "jalCal")
  @js.native
  def jalCal(jy: Double): JalCalResult = js.native
  
  @JSImport("jalaali-js", "jalaaliMonthLength")
  @js.native
  def jalaaliMonthLength(jy: Double, jm: Double): Double = js.native
  
  @JSImport("jalaali-js", "toGregorian")
  @js.native
  def toGregorian(jy: Double, jm: Double, jd: Double): GregorianDateObject = js.native
  
  @JSImport("jalaali-js", "toJalaali")
  @js.native
  def toJalaali(date: Date): JalaaliDateObject = js.native
  @JSImport("jalaali-js", "toJalaali")
  @js.native
  def toJalaali(gy: Double, gm: Double, gd: Double): JalaaliDateObject = js.native
  
  @js.native
  trait GregorianDateObject extends StObject {
    
    /** Gregorian day */
    var gd: Double = js.native
    
    /** Gregorian month */
    var gm: Double = js.native
    
    /** Gregorian year */
    var gy: Double = js.native
  }
  object GregorianDateObject {
    
    @scala.inline
    def apply(gd: Double, gm: Double, gy: Double): GregorianDateObject = {
      val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GregorianDateObject]
    }
    
    @scala.inline
    implicit class GregorianDateObjectMutableBuilder[Self <: GregorianDateObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGd(value: Double): Self = StObject.set(x, "gd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGm(value: Double): Self = StObject.set(x, "gm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGy(value: Double): Self = StObject.set(x, "gy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JalCalResult extends StObject {
    
    /** Gregorian year of the beginning of Jalaali year */
    var gy: Double = js.native
    
    /** Number of years since the last leap year (0 to 4) */
    var leap: Double = js.native
    
    /** The March day of Farvardin the 1st (1st day of jy) */
    var march: Double = js.native
  }
  object JalCalResult {
    
    @scala.inline
    def apply(gy: Double, leap: Double, march: Double): JalCalResult = {
      val __obj = js.Dynamic.literal(gy = gy.asInstanceOf[js.Any], leap = leap.asInstanceOf[js.Any], march = march.asInstanceOf[js.Any])
      __obj.asInstanceOf[JalCalResult]
    }
    
    @scala.inline
    implicit class JalCalResultMutableBuilder[Self <: JalCalResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGy(value: Double): Self = StObject.set(x, "gy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeap(value: Double): Self = StObject.set(x, "leap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarch(value: Double): Self = StObject.set(x, "march", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JalaaliDateObject extends StObject {
    
    /** Jalaali day */
    var jd: Double = js.native
    
    /** Jalaali month */
    var jm: Double = js.native
    
    /** Jalaali year */
    var jy: Double = js.native
  }
  object JalaaliDateObject {
    
    @scala.inline
    def apply(jd: Double, jm: Double, jy: Double): JalaaliDateObject = {
      val __obj = js.Dynamic.literal(jd = jd.asInstanceOf[js.Any], jm = jm.asInstanceOf[js.Any], jy = jy.asInstanceOf[js.Any])
      __obj.asInstanceOf[JalaaliDateObject]
    }
    
    @scala.inline
    implicit class JalaaliDateObjectMutableBuilder[Self <: JalaaliDateObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJd(value: Double): Self = StObject.set(x, "jd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJm(value: Double): Self = StObject.set(x, "jm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJy(value: Double): Self = StObject.set(x, "jy", value.asInstanceOf[js.Any])
    }
  }
}

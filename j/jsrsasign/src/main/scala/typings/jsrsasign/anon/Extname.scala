package typings.jsrsasign.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extname extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: js.UndefOr[String] = js.undefined
  
  var num: StringDictionary[Double]
}
object Extname {
  
  inline def apply(num: StringDictionary[Double]): Extname = {
    val __obj = js.Dynamic.literal(num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extname] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
    
    inline def setNum(value: StringDictionary[Double]): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
  }
}

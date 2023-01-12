package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamesAbbr extends StObject {
  
  var names: js.Array[String]
  
  var namesAbbr: js.Array[String]
}
object NamesAbbr {
  
  inline def apply(names: js.Array[String], namesAbbr: js.Array[String]): NamesAbbr = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], namesAbbr = namesAbbr.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamesAbbr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamesAbbr] (val x: Self) extends AnyVal {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesAbbr(value: js.Array[String]): Self = StObject.set(x, "namesAbbr", value.asInstanceOf[js.Any])
    
    inline def setNamesAbbrVarargs(value: String*): Self = StObject.set(x, "namesAbbr", js.Array(value*))
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}

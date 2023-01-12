package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchEntryObject
  extends StObject
     with /* p */ StringDictionary[String | js.Array[String]] {
  
  var controls: js.Array[Control]
  
  var dn: String
}
object SearchEntryObject {
  
  inline def apply(controls: js.Array[Control], dn: String): SearchEntryObject = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntryObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchEntryObject] (val x: Self) extends AnyVal {
    
    inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setDn(value: String): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
  }
}

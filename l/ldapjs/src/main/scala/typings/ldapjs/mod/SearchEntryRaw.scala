package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchEntryRaw
  extends StObject
     with /* p */ StringDictionary[String | Buffer | js.Array[Buffer]] {
  
  var controls: js.Array[Control]
  
  var dn: String
}
object SearchEntryRaw {
  
  inline def apply(controls: js.Array[Control], dn: String): SearchEntryRaw = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntryRaw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchEntryRaw] (val x: Self) extends AnyVal {
    
    inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setDn(value: String): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
  }
}

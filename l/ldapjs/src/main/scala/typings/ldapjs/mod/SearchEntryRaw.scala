package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchEntryRaw
  extends /* p */ StringDictionary[String | Buffer | js.Array[Buffer]] {
  
  var controls: js.Array[Control] = js.native
  
  var dn: String = js.native
}
object SearchEntryRaw {
  
  @scala.inline
  def apply(controls: js.Array[Control], dn: String): SearchEntryRaw = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntryRaw]
  }
  
  @scala.inline
  implicit class SearchEntryRawMutableBuilder[Self <: SearchEntryRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
    
    @scala.inline
    def setDn(value: String): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
  }
}

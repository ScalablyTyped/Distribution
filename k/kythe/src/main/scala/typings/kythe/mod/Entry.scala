package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends StObject {
  
  var label: String = js.native
  
  var source: VName = js.native
}
object Entry {
  
  @scala.inline
  def apply(label: String, source: VName): Entry = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: VName): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

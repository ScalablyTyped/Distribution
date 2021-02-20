package typings.kdbxweb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editingStateDict extends /* uuid */ StringDictionary[editingState] {
  
  var meta: editingState = js.native
}
object editingStateDict {
  
  @scala.inline
  def apply(meta: editingState): editingStateDict = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[editingStateDict]
  }
  
  @scala.inline
  implicit class editingStateDictMutableBuilder[Self <: editingStateDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: editingState): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}

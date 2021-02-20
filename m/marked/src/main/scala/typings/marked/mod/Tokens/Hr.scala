package typings.marked.mod.Tokens

import typings.marked.markedStrings.hr
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hr extends Token {
  
  var raw: String = js.native
  
  var `type`: hr = js.native
}
object Hr {
  
  @scala.inline
  def apply(raw: String, `type`: hr): Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hr]
  }
  
  @scala.inline
  implicit class HrMutableBuilder[Self <: Hr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: hr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

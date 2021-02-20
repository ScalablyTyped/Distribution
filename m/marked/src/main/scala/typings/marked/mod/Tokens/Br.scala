package typings.marked.mod.Tokens

import typings.marked.markedStrings.br
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Br extends Token {
  
  var raw: String = js.native
  
  var `type`: br = js.native
}
object Br {
  
  @scala.inline
  def apply(raw: String, `type`: br): Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Br]
  }
  
  @scala.inline
  implicit class BrMutableBuilder[Self <: Br] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: br): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

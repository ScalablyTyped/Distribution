package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorParam extends js.Object {
  
  var code: Double = js.native
  
  var message: String = js.native
  
  var sourceError: js.Object | Null = js.native
  
  var `type`: error = js.native
}
object ErrorParam {
  
  @scala.inline
  def apply(code: Double, message: String, `type`: error): ErrorParam = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorParam]
  }
  
  @scala.inline
  implicit class ErrorParamOps[Self <: ErrorParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceError(value: js.Object): Self = this.set("sourceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceErrorNull: Self = this.set("sourceError", null)
  }
}

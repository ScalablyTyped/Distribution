package typings.jestTransform.enhanceUnexpectedTokenMessageMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorWithCodeFrame extends Error {
  
  var codeFrame: js.UndefOr[String] = js.native
}
object ErrorWithCodeFrame {
  
  @scala.inline
  def apply(message: String, name: String): ErrorWithCodeFrame = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithCodeFrame]
  }
  
  @scala.inline
  implicit class ErrorWithCodeFrameOps[Self <: ErrorWithCodeFrame] (val x: Self) extends AnyVal {
    
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
    def setCodeFrame(value: String): Self = this.set("codeFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeFrame: Self = this.set("codeFrame", js.undefined)
  }
}

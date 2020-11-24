package typings.jestResolve.moduleNotFoundErrorMod

import typings.jestTypes.configMod.Path
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleNotFoundError extends Error {
  
  var _originalMessage: js.Any = js.native
  
  def buildMessage(rootDir: Path): Unit = js.native
  
  var code: String = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var moduleName: js.UndefOr[String] = js.native
  
  var requireStack: js.UndefOr[js.Array[Path]] = js.native
  
  var siblingWithSimilarExtensionFound: js.UndefOr[Boolean] = js.native
}
object ModuleNotFoundError {
  
  @scala.inline
  def apply(_originalMessage: js.Any, buildMessage: Path => Unit, code: String, message: String, name: String): ModuleNotFoundError = {
    val __obj = js.Dynamic.literal(_originalMessage = _originalMessage.asInstanceOf[js.Any], buildMessage = js.Any.fromFunction1(buildMessage), code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleNotFoundError]
  }
  
  @scala.inline
  implicit class ModuleNotFoundErrorOps[Self <: ModuleNotFoundError] (val x: Self) extends AnyVal {
    
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
    def set_originalMessage(value: js.Any): Self = this.set("_originalMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildMessage(value: Path => Unit): Self = this.set("buildMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleName: Self = this.set("moduleName", js.undefined)
    
    @scala.inline
    def setRequireStackVarargs(value: Path*): Self = this.set("requireStack", js.Array(value :_*))
    
    @scala.inline
    def setRequireStack(value: js.Array[Path]): Self = this.set("requireStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireStack: Self = this.set("requireStack", js.undefined)
    
    @scala.inline
    def setSiblingWithSimilarExtensionFound(value: Boolean): Self = this.set("siblingWithSimilarExtensionFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiblingWithSimilarExtensionFound: Self = this.set("siblingWithSimilarExtensionFound", js.undefined)
  }
}

package typings.i18nextSprintfPostprocessor.anon

import typings.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.sprintf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostProcess extends js.Object {
  
  var postProcess: sprintf = js.native
  
  var sprintf: js.Array[String] = js.native
}
object PostProcess {
  
  @scala.inline
  def apply(postProcess: sprintf, sprintf: js.Array[String]): PostProcess = {
    val __obj = js.Dynamic.literal(postProcess = postProcess.asInstanceOf[js.Any], sprintf = sprintf.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcess]
  }
  
  @scala.inline
  implicit class PostProcessOps[Self <: PostProcess] (val x: Self) extends AnyVal {
    
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
    def setPostProcess(value: sprintf): Self = this.set("postProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprintfVarargs(value: String*): Self = this.set("sprintf", js.Array(value :_*))
    
    @scala.inline
    def setSprintf(value: js.Array[String]): Self = this.set("sprintf", value.asInstanceOf[js.Any])
  }
}

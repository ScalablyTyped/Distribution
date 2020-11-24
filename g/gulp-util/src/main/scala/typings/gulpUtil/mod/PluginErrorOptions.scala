package typings.gulpUtil.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginErrorOptions extends js.Object {
  
  var error: js.UndefOr[Error] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
  
  /**
    * Can be a string or an existing error.
    */
  var message: js.UndefOr[js.Any] = js.native
  
  /**
    * The module name of your plugin.
    */
  var name: js.UndefOr[String] = js.native
  
  var plugin: js.UndefOr[String] = js.native
  
  /**
    * Error properties will be included in err.toString(). Can be omitted by
    * setting this to false.
    */
  var showProperties: js.UndefOr[Boolean] = js.native
  
  /**
    * By default the stack will not be shown. Set this to true if you think the
    * stack is important for your error.
    */
  var showStack: js.UndefOr[Boolean] = js.native
  
  /**
    * You need to include the message along with this stack. If you pass an
    * error in as the message the stack will be pulled from that, otherwise one
    * will be created.
    */
  var stack: js.UndefOr[String] = js.native
}
object PluginErrorOptions {
  
  @scala.inline
  def apply(): PluginErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginErrorOptions]
  }
  
  @scala.inline
  implicit class PluginErrorOptionsOps[Self <: PluginErrorOptions] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setShowProperties(value: Boolean): Self = this.set("showProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowProperties: Self = this.set("showProperties", js.undefined)
    
    @scala.inline
    def setShowStack(value: Boolean): Self = this.set("showStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStack: Self = this.set("showStack", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}

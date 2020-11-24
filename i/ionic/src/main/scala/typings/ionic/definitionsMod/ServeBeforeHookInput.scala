package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.serveColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServeBeforeHookInput extends HookInput {
  
  val name: serveColonbefore = js.native
  
  val serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions = js.native
}
object ServeBeforeHookInput {
  
  @scala.inline
  def apply(name: serveColonbefore, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeBeforeHookInput]
  }
  
  @scala.inline
  implicit class ServeBeforeHookInputOps[Self <: ServeBeforeHookInput] (val x: Self) extends AnyVal {
    
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
    def setName(value: serveColonbefore): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServe(value: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): Self = this.set("serve", value.asInstanceOf[js.Any])
  }
}

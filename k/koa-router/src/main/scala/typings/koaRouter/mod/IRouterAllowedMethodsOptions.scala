package typings.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterAllowedMethodsOptions extends js.Object {
  
  /**
    * throw the returned value in place of the default MethodNotAllowed error
    */
  var methodNotAllowed: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * throw the returned value in place of the default NotImplemented error
    */
  var notImplemented: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * throw error instead of setting status and header
    */
  var `throw`: js.UndefOr[Boolean] = js.native
}
object IRouterAllowedMethodsOptions {
  
  @scala.inline
  def apply(): IRouterAllowedMethodsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouterAllowedMethodsOptions]
  }
  
  @scala.inline
  implicit class IRouterAllowedMethodsOptionsOps[Self <: IRouterAllowedMethodsOptions] (val x: Self) extends AnyVal {
    
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
    def setMethodNotAllowed(value: () => _): Self = this.set("methodNotAllowed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMethodNotAllowed: Self = this.set("methodNotAllowed", js.undefined)
    
    @scala.inline
    def setNotImplemented(value: () => _): Self = this.set("notImplemented", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotImplemented: Self = this.set("notImplemented", js.undefined)
    
    @scala.inline
    def setThrow(value: Boolean): Self = this.set("throw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrow: Self = this.set("throw", js.undefined)
  }
}

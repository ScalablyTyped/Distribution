package typings.logrocket.mod.LR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReduxMiddlewareOptions extends js.Object {
  
  /** Sanitizer function to scrub or ignore specific redux actions */
  var actionSanitizer: js.UndefOr[js.Function1[/* action */ Action, Null | Action]] = js.native
  
  /** Sanitizer function to scrub redux state */
  var stateSanitizer: js.UndefOr[js.Function1[/* state */ State, State]] = js.native
}
object IReduxMiddlewareOptions {
  
  @scala.inline
  def apply(): IReduxMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReduxMiddlewareOptions]
  }
  
  @scala.inline
  implicit class IReduxMiddlewareOptionsOps[Self <: IReduxMiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setActionSanitizer(value: /* action */ Action => Null | Action): Self = this.set("actionSanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionSanitizer: Self = this.set("actionSanitizer", js.undefined)
    
    @scala.inline
    def setStateSanitizer(value: /* state */ State => State): Self = this.set("stateSanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStateSanitizer: Self = this.set("stateSanitizer", js.undefined)
  }
}

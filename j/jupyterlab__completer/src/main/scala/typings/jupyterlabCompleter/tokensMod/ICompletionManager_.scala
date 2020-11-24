package typings.jupyterlabCompleter.tokensMod

import typings.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletable
import typings.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletableAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompletionManager_ extends js.Object {
  
  /**
    * Register a completable object with the completion manager.
    *
    * @returns A completable object whose attributes can be updated as necessary.
    */
  def register(completable: ICompletable): ICompletableAttributes = js.native
}
object ICompletionManager_ {
  
  @scala.inline
  def apply(register: ICompletable => ICompletableAttributes): ICompletionManager_ = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[ICompletionManager_]
  }
  
  @scala.inline
  implicit class ICompletionManager_Ops[Self <: ICompletionManager_] (val x: Self) extends AnyVal {
    
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
    def setRegister(value: ICompletable => ICompletableAttributes): Self = this.set("register", js.Any.fromFunction1(value))
  }
}

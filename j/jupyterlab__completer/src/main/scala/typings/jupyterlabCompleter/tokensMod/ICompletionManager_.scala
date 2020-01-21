package typings.jupyterlabCompleter.tokensMod

import typings.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletable
import typings.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletableAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompletionManager_ extends js.Object {
  /**
    * Register a completable object with the completion manager.
    *
    * @returns A completable object whose attributes can be updated as necessary.
    */
  def register(completable: ICompletable): ICompletableAttributes
}

object ICompletionManager_ {
  @scala.inline
  def apply(register: ICompletable => ICompletableAttributes): ICompletionManager_ = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[ICompletionManager_]
  }
}


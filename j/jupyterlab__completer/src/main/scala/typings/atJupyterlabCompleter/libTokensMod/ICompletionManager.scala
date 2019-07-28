package typings.atJupyterlabCompleter.libTokensMod

import typings.atJupyterlabCompleter.libTokensMod.ICompletionManagerNs.ICompletable
import typings.atJupyterlabCompleter.libTokensMod.ICompletionManagerNs.ICompletableAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompletionManager extends js.Object {
  /**
    * Register a completable object with the completion manager.
    *
    * @returns A completable object whose attributes can be updated as necessary.
    */
  def register(completable: ICompletable): ICompletableAttributes
}

object ICompletionManager {
  @scala.inline
  def apply(register: ICompletable => ICompletableAttributes): ICompletionManager = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[ICompletionManager]
  }
}


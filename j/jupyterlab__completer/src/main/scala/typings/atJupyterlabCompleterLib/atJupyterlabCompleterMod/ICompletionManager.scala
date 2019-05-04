package typings
package atJupyterlabCompleterLib.atJupyterlabCompleterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompletionManager extends js.Object {
  /**
    * Register a completable object with the completion manager.
    *
    * @returns A completable object whose attributes can be updated as necessary.
    */
  def register(completable: atJupyterlabCompleterLib.atJupyterlabCompleterMod.ICompletionManagerNs.ICompletable): atJupyterlabCompleterLib.atJupyterlabCompleterMod.ICompletionManagerNs.ICompletableAttributes
}

object ICompletionManager {
  @scala.inline
  def apply(
    register: atJupyterlabCompleterLib.atJupyterlabCompleterMod.ICompletionManagerNs.ICompletable => atJupyterlabCompleterLib.atJupyterlabCompleterMod.ICompletionManagerNs.ICompletableAttributes
  ): ICompletionManager = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[ICompletionManager]
  }
}


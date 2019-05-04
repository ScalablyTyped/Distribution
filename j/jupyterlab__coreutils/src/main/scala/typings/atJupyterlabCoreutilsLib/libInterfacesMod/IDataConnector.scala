package typings
package atJupyterlabCoreutilsLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataConnector[T, U, V] extends js.Object {
  /**
    * Retrieve an item from the data connector.
    *
    * @param id - The identifier used to retrieve an item.
    *
    * @returns A promise that bears a data payload if available.
    *
    * #### Notes
    * The promise returned by this method may be rejected if an error occurs in
    * retrieving the data. Nonexistence of an `id` will succeed with `undefined`.
    */
  def fetch(id: V): js.Promise[js.UndefOr[T]]
  /**
    * Remove a value using the data connector.
    *
    * @param id - The identifier for the data being removed.
    *
    * @returns A promise that is rejected if remove fails and succeeds otherwise.
    */
  def remove(id: V): js.Promise[scala.Unit]
  /**
    * Save a value using the data connector.
    *
    * @param id - The identifier for the data being saved.
    *
    * @param value - The data being saved.
    *
    * @returns A promise that is rejected if saving fails and succeeds otherwise.
    */
  def save(id: V, value: U): js.Promise[scala.Unit]
}

object IDataConnector {
  @scala.inline
  def apply[T, U, V](
    fetch: V => js.Promise[js.UndefOr[T]],
    remove: V => js.Promise[scala.Unit],
    save: (V, U) => js.Promise[scala.Unit]
  ): IDataConnector[T, U, V] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch), remove = js.Any.fromFunction1(remove), save = js.Any.fromFunction2(save))
  
    __obj.asInstanceOf[IDataConnector[T, U, V]]
  }
}


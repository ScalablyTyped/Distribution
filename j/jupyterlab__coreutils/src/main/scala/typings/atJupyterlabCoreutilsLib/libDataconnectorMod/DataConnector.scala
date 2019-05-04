package typings
package atJupyterlabCoreutilsLib.libDataconnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/dataconnector", "DataConnector")
@js.native
abstract class DataConnector[T, U, V] ()
  extends atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[T, U, V] {
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
  /* CompleteClass */
  override def fetch(id: V): js.Promise[js.UndefOr[T]] = js.native
  /**
    * Remove a value using the data connector.
    *
    * @param id - The identifier for the data being removed.
    *
    * @returns A promise that is rejected if remove fails and succeeds otherwise.
    */
  /* CompleteClass */
  override def remove(id: V): js.Promise[scala.Unit] = js.native
  /**
    * Save a value using the data connector.
    *
    * @param id - The identifier for the data being saved.
    *
    * @param value - The data being saved.
    *
    * @returns A promise that is rejected if saving fails and succeeds otherwise.
    */
  /* CompleteClass */
  override def save(id: V, value: U): js.Promise[scala.Unit] = js.native
}


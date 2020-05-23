package typings.jupyterlabStatedb.interfacesMod

import typings.jupyterlabStatedb.anon.Ids
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataConnector[T, U, V, W] extends js.Object {
  /**
    * Retrieve an item from the data connector.
    *
    * @param id - The identifier used to retrieve an item.
    *
    * @returns A promise that bears a data payload if available.
    *
    * #### Notes
    * The promise returned by this method may be rejected if an error occurs in
    * retrieving the data. Nonexistence of an `id` resolves with `undefined`.
    */
  def fetch(id: V): js.Promise[js.UndefOr[T]] = js.native
  /**
    * Retrieve the list of items available from the data connector.
    *
    * @param query - The optional query filter to apply to the connector request.
    *
    * @returns A promise that bears a list of `values` and an associated list of
    * fetch `ids`.
    *
    * #### Notes
    * The promise returned by this method may be rejected if an error occurs in
    * retrieving the data. The two lists will always be the same size. If there
    * is no data, this method will succeed with empty `ids` and `values`.
    */
  def list(): js.Promise[Ids[V, T]] = js.native
  def list(query: W): js.Promise[Ids[V, T]] = js.native
  /**
    * Remove a value using the data connector.
    *
    * @param id - The identifier for the data being removed.
    *
    * @returns A promise that is rejected if remove fails and succeeds otherwise.
    *
    * #### Notes
    * This promise may resolve with a back-end response or `undefined`.
    * Existence of resolved content in the promise is not prescribed and must be
    * tested for. For example, some back-ends may return a copy of the item of
    * type `T` being removed while others may return no content.
    */
  def remove(id: V): js.Promise[_] = js.native
  /**
    * Save a value using the data connector.
    *
    * @param id - The identifier for the data being saved.
    *
    * @param value - The data being saved.
    *
    * @returns A promise that is rejected if saving fails and succeeds otherwise.
    *
    * #### Notes
    * This promise may resolve with a back-end response or `undefined`.
    * Existence of resolved content in the promise is not prescribed and must be
    * tested for. For example, some back-ends may return a copy of the item of
    * type `T` being saved while others may return no content.
    */
  def save(id: V, value: U): js.Promise[_] = js.native
}


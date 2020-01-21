package typings.makerJs.MakerJs

import typings.makerJs.AnonOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.travel")
@js.native
object travel extends js.Object {
  /**
    * Travel along a route inside of a model to extract a specific node in its tree.
    *
    * @param modelContext Model to travel within.
    * @param routeKeyOrRoute String of a flattened route, or a string array of route segments.
    * @returns Model or Path object within the modelContext tree.
    */
  def apply(modelContext: IModel, routeKeyOrRoute: String): AnonOffset = js.native
  def apply(modelContext: IModel, routeKeyOrRoute: js.Array[String]): AnonOffset = js.native
}


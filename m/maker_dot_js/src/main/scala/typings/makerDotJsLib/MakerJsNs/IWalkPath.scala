package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path reference in a walk.
  */
trait IWalkPath
  extends IRefPathIdInModel
     with IRouteOffset {
  var pathContext: IPath
}

object IWalkPath {
  @scala.inline
  def apply(
    layer: java.lang.String,
    modelContext: IModel,
    offset: IPoint,
    pathContext: IPath,
    pathId: java.lang.String,
    route: js.Array[java.lang.String],
    routeKey: java.lang.String
  ): IWalkPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("modelContext")(modelContext)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("pathContext")(pathContext)
    __obj.updateDynamic("pathId")(pathId)
    __obj.updateDynamic("route")(route)
    __obj.updateDynamic("routeKey")(routeKey)
    __obj.asInstanceOf[IWalkPath]
  }
}


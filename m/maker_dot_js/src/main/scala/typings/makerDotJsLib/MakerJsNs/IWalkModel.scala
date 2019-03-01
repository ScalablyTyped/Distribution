package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model reference in a walk.
  */
trait IWalkModel
  extends IRefModelInModel
     with IRouteOffset

object IWalkModel {
  @scala.inline
  def apply(
    childId: java.lang.String,
    childModel: IModel,
    layer: java.lang.String,
    offset: IPoint,
    parentModel: IModel,
    route: js.Array[java.lang.String],
    routeKey: java.lang.String
  ): IWalkModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childId")(childId)
    __obj.updateDynamic("childModel")(childModel)
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("parentModel")(parentModel)
    __obj.updateDynamic("route")(route)
    __obj.updateDynamic("routeKey")(routeKey)
    __obj.asInstanceOf[IWalkModel]
  }
}


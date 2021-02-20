package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A model reference in a walk.
  */
@js.native
trait IWalkModel
  extends IRefModelInModel
     with IRouteOffset
object IWalkModel {
  
  @scala.inline
  def apply(
    childId: String,
    childModel: IModel,
    layer: String,
    offset: IPoint,
    parentModel: IModel,
    route: js.Array[String],
    routeKey: String
  ): IWalkModel = {
    val __obj = js.Dynamic.literal(childId = childId.asInstanceOf[js.Any], childModel = childModel.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentModel = parentModel.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWalkModel]
  }
}

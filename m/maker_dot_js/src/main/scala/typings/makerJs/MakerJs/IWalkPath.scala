package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path reference in a walk.
  */
@js.native
trait IWalkPath
  extends IRefPathIdInModel
     with IRouteOffset {
  var pathContext: IPath = js.native
}

object IWalkPath {
  @scala.inline
  def apply(
    layer: String,
    modelContext: IModel,
    offset: IPoint,
    pathContext: IPath,
    pathId: String,
    route: js.Array[String],
    routeKey: String
  ): IWalkPath = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], modelContext = modelContext.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pathContext = pathContext.asInstanceOf[js.Any], pathId = pathId.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWalkPath]
  }
  @scala.inline
  implicit class IWalkPathOps[Self <: IWalkPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathContext(value: IPath): Self = this.set("pathContext", value.asInstanceOf[js.Any])
  }
  
}


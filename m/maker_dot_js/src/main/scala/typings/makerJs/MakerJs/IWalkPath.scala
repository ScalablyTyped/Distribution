package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IWalkPathMutableBuilder[Self <: IWalkPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathContext(value: IPath): Self = StObject.set(x, "pathContext", value.asInstanceOf[js.Any])
  }
}

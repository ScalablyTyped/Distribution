package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OvalArc extends IModel {
  
  @JSName("models")
  var models_OvalArc: IModelMap = js.native
  
  @JSName("paths")
  var paths_OvalArc: IPathMap = js.native
}
object OvalArc {
  
  @scala.inline
  def apply(models: IModelMap, paths: IPathMap): OvalArc = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[OvalArc]
  }
  
  @scala.inline
  implicit class OvalArcMutableBuilder[Self <: OvalArc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}

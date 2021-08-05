package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OvalArc
  extends StObject
     with IModel {
  
  @JSName("models")
  var models_OvalArc: IModelMap
  
  @JSName("paths")
  var paths_OvalArc: IPathMap
}
object OvalArc {
  
  inline def apply(models: IModelMap, paths: IPathMap): OvalArc = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[OvalArc]
  }
  
  extension [Self <: OvalArc](x: Self) {
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}

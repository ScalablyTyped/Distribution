package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slot
  extends StObject
     with IModel {
  
  @JSName("models")
  var models_Slot: IModelMap
  
  @JSName("origin")
  var origin_Slot: IPoint
  
  @JSName("paths")
  var paths_Slot: IPathMap
}
object Slot {
  
  inline def apply(models: IModelMap, origin: IPoint, paths: IPathMap): Slot = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  
  extension [Self <: Slot](x: Self) {
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}

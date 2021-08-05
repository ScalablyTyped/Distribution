package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathBezierSeed
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BezierCurve
  extends StObject
     with IModel {
  
  var accuracy: Double
  
  @JSName("models")
  var models_BezierCurve: IModelMap
  
  @JSName("origin")
  var origin_BezierCurve: IPoint
  
  @JSName("paths")
  var paths_BezierCurve: IPathMap
  
  var seed: IPathBezierSeed
  
  @JSName("type")
  var type_BezierCurve: String
}
object BezierCurve {
  
  inline def apply(
    accuracy: Double,
    models: IModelMap,
    origin: IPoint,
    paths: IPathMap,
    seed: IPathBezierSeed,
    `type`: String
  ): BezierCurve = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurve]
  }
  
  extension [Self <: BezierCurve](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setSeed(value: IPathBezierSeed): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

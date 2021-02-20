package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathBezierSeed
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BezierCurve extends IModel {
  
  var accuracy: Double = js.native
  
  @JSName("models")
  var models_BezierCurve: IModelMap = js.native
  
  @JSName("origin")
  var origin_BezierCurve: IPoint = js.native
  
  @JSName("paths")
  var paths_BezierCurve: IPathMap = js.native
  
  var seed: IPathBezierSeed = js.native
  
  @JSName("type")
  var type_BezierCurve: String = js.native
}
object BezierCurve {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BezierCurveMutableBuilder[Self <: BezierCurve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeed(value: IPathBezierSeed): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

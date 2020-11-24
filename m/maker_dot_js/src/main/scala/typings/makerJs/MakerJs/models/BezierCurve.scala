package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathBezierSeed
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
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
  implicit class BezierCurveOps[Self <: BezierCurve] (val x: Self) extends AnyVal {
    
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModels(value: IModelMap): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: IPoint): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: IPathMap): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeed(value: IPathBezierSeed): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

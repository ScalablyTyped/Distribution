package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipse extends IModel {
  
  @JSName("models")
  var models_Ellipse: IModelMap = js.native
  
  @JSName("origin")
  var origin_Ellipse: IPoint = js.native
}
object Ellipse {
  
  @scala.inline
  def apply(models: IModelMap, origin: IPoint): Ellipse = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipse]
  }
  
  @scala.inline
  implicit class EllipseMutableBuilder[Self <: Ellipse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}

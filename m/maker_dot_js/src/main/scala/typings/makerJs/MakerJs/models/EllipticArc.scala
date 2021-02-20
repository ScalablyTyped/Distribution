package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipticArc extends IModel {
  
  @JSName("models")
  var models_EllipticArc: IModelMap = js.native
}
object EllipticArc {
  
  @scala.inline
  def apply(models: IModelMap): EllipticArc = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipticArc]
  }
  
  @scala.inline
  implicit class EllipticArcMutableBuilder[Self <: EllipticArc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
  }
}

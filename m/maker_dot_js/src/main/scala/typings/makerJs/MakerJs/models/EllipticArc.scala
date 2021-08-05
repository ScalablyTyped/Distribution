package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipticArc
  extends StObject
     with IModel {
  
  @JSName("models")
  var models_EllipticArc: IModelMap
}
object EllipticArc {
  
  inline def apply(models: IModelMap): EllipticArc = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipticArc]
  }
  
  extension [Self <: EllipticArc](x: Self) {
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
  }
}

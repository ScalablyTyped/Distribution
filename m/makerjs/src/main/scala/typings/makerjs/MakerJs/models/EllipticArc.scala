package typings.makerjs.MakerJs.models

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IModelMap
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EllipticArc] (val x: Self) extends AnyVal {
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
  }
}

package typings.makerjs.MakerJs.models

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IModelMap
import typings.makerjs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ellipse
  extends StObject
     with IModel {
  
  @JSName("models")
  var models_Ellipse: IModelMap
  
  @JSName("origin")
  var origin_Ellipse: IPoint
}
object Ellipse {
  
  inline def apply(models: IModelMap, origin: IPoint): Ellipse = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ellipse] (val x: Self) extends AnyVal {
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}

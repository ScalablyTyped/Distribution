package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with IModel {
  
  @JSName("models")
  var models_Text: IModelMap
}
object Text {
  
  inline def apply(models: IModelMap): Text = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
  }
}

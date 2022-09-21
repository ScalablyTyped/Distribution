package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to a model within a model.
  */
trait IRefModelInModel extends StObject {
  
  var childId: String
  
  var childModel: IModel
  
  var parentModel: IModel
}
object IRefModelInModel {
  
  inline def apply(childId: String, childModel: IModel, parentModel: IModel): IRefModelInModel = {
    val __obj = js.Dynamic.literal(childId = childId.asInstanceOf[js.Any], childModel = childModel.asInstanceOf[js.Any], parentModel = parentModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefModelInModel]
  }
  
  extension [Self <: IRefModelInModel](x: Self) {
    
    inline def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    inline def setChildModel(value: IModel): Self = StObject.set(x, "childModel", value.asInstanceOf[js.Any])
    
    inline def setParentModel(value: IModel): Self = StObject.set(x, "parentModel", value.asInstanceOf[js.Any])
  }
}

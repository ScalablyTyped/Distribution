package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to a model within a model.
  */
@js.native
trait IRefModelInModel extends StObject {
  
  var childId: String = js.native
  
  var childModel: IModel = js.native
  
  var parentModel: IModel = js.native
}
object IRefModelInModel {
  
  @scala.inline
  def apply(childId: String, childModel: IModel, parentModel: IModel): IRefModelInModel = {
    val __obj = js.Dynamic.literal(childId = childId.asInstanceOf[js.Any], childModel = childModel.asInstanceOf[js.Any], parentModel = parentModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefModelInModel]
  }
  
  @scala.inline
  implicit class IRefModelInModelMutableBuilder[Self <: IRefModelInModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildModel(value: IModel): Self = StObject.set(x, "childModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentModel(value: IModel): Self = StObject.set(x, "parentModel", value.asInstanceOf[js.Any])
  }
}

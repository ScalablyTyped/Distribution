package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to a path id within a model.
  */
trait IRefPathIdInModel extends StObject {
  
  var modelContext: IModel
  
  var pathId: String
}
object IRefPathIdInModel {
  
  @scala.inline
  def apply(modelContext: IModel, pathId: String): IRefPathIdInModel = {
    val __obj = js.Dynamic.literal(modelContext = modelContext.asInstanceOf[js.Any], pathId = pathId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefPathIdInModel]
  }
  
  @scala.inline
  implicit class IRefPathIdInModelMutableBuilder[Self <: IRefPathIdInModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelContext(value: IModel): Self = StObject.set(x, "modelContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathId(value: String): Self = StObject.set(x, "pathId", value.asInstanceOf[js.Any])
  }
}

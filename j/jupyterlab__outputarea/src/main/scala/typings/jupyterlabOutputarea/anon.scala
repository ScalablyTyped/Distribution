package typings.jupyterlabOutputarea

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.libOutputmodelMod.IOutputModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LastModel extends StObject {
    
    var lastModel: IOutputModel
    
    var value: IOutput
  }
  object LastModel {
    
    inline def apply(lastModel: IOutputModel, value: IOutput): LastModel = {
      val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastModel]
    }
    
    extension [Self <: LastModel](x: Self) {
      
      inline def setLastModel(value: IOutputModel): Self = StObject.set(x, "lastModel", value.asInstanceOf[js.Any])
      
      inline def setValue(value: IOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

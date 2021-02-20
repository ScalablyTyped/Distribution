package typings.jupyterlabOutputarea

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LastModel extends StObject {
    
    var lastModel: IOutputModel = js.native
    
    var value: IOutput = js.native
  }
  object LastModel {
    
    @scala.inline
    def apply(lastModel: IOutputModel, value: IOutput): LastModel = {
      val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastModel]
    }
    
    @scala.inline
    implicit class LastModelMutableBuilder[Self <: LastModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModel(value: IOutputModel): Self = StObject.set(x, "lastModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: IOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

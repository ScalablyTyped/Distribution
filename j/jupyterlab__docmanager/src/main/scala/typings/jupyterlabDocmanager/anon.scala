package typings.jupyterlabDocmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Kernel.IModel> */
  @js.native
  trait PartialIModel extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object PartialIModel {
    
    @scala.inline
    def apply(): PartialIModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIModel]
    }
    
    @scala.inline
    implicit class PartialIModelMutableBuilder[Self <: PartialIModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}

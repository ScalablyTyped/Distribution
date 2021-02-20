package typings.jupyterlabApputilsExtension

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ids extends StObject {
    
    var ids: js.Array[String] = js.native
    
    var values: js.Array[IPlugin] = js.native
  }
  object Ids {
    
    @scala.inline
    def apply(ids: js.Array[String], values: js.Array[IPlugin]): Ids = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids]
    }
    
    @scala.inline
    implicit class IdsMutableBuilder[Self <: Ids] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[IPlugin]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: IPlugin*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}

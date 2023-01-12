package typings.jupyterlabApputilsExtension

import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ids extends StObject {
    
    var ids: js.Array[String]
    
    var values: js.Array[IPlugin]
  }
  object Ids {
    
    inline def apply(ids: js.Array[String], values: js.Array[IPlugin]): Ids = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ids] (val x: Self) extends AnyVal {
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setValues(value: js.Array[IPlugin]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: IPlugin*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}

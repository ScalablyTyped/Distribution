package typings.jupyterlabServices.anon

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ids extends StObject {
  
  var ids: js.Array[String]
  
  var values: js.Array[IPlugin]
}
object Ids {
  
  inline def apply(ids: js.Array[String], values: js.Array[IPlugin]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  
  extension [Self <: Ids](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setValues(value: js.Array[IPlugin]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: IPlugin*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

package typings.jupyterlabServices.anon

import typings.jupyterlabServices.libWorkspaceMod.Workspace.IWorkspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values extends StObject {
  
  var ids: js.Array[String]
  
  var values: js.Array[IWorkspace]
}
object Values {
  
  inline def apply(ids: js.Array[String], values: js.Array[IWorkspace]): Values = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  extension [Self <: Values](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setValues(value: js.Array[IWorkspace]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: IWorkspace*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

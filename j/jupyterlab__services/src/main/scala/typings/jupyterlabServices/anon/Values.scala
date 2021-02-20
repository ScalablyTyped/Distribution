package typings.jupyterlabServices.anon

import typings.jupyterlabServices.workspaceMod.Workspace.IWorkspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values extends StObject {
  
  var ids: js.Array[String] = js.native
  
  var values: js.Array[IWorkspace] = js.native
}
object Values {
  
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IWorkspace]): Values = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  @scala.inline
  implicit class ValuesMutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[IWorkspace]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: IWorkspace*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

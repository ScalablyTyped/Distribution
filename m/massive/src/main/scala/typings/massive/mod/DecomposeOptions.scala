package typings.massive.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecomposeOptions
  extends /* foreignTable */ StringDictionary[DecomposeOptions | js.Any] {
  
  var columns: js.UndefOr[js.Array[String] | AnyObject[String]] = js.native
  
  var pk: String = js.native
}
object DecomposeOptions {
  
  @scala.inline
  def apply(pk: String): DecomposeOptions = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposeOptions]
  }
  
  @scala.inline
  implicit class DecomposeOptionsMutableBuilder[Self <: DecomposeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[String] | AnyObject[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
  }
}

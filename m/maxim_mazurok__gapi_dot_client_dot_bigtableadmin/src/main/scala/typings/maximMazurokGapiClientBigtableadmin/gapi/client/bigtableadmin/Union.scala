package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Union extends StObject {
  
  /** Delete cells which would be deleted by any element of `rules`. */
  var rules: js.UndefOr[js.Array[GcRule]] = js.native
}
object Union {
  
  @scala.inline
  def apply(): Union = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Union]
  }
  
  @scala.inline
  implicit class UnionMutableBuilder[Self <: Union] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[GcRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: GcRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}

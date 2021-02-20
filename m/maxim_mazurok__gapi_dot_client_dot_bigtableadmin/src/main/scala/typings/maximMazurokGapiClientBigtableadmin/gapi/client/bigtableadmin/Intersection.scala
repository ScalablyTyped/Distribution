package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Intersection extends StObject {
  
  /** Only delete cells which would be deleted by every element of `rules`. */
  var rules: js.UndefOr[js.Array[GcRule]] = js.native
}
object Intersection {
  
  @scala.inline
  def apply(): Intersection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Intersection]
  }
  
  @scala.inline
  implicit class IntersectionMutableBuilder[Self <: Intersection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[GcRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: GcRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}

package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intersection extends StObject {
  
  /** Only delete cells which would be deleted by every element of `rules`. */
  var rules: js.UndefOr[js.Array[GcRule]] = js.undefined
}
object Intersection {
  
  inline def apply(): Intersection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Intersection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Intersection] (val x: Self) extends AnyVal {
    
    inline def setRules(value: js.Array[GcRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: GcRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}

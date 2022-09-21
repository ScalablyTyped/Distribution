package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipState extends StObject {
  
  /**
    * Output only. The current state of the Membership resource.
    */
  var code: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembershipState {
  
  inline def apply(): SchemaMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipState]
  }
  
  extension [Self <: SchemaMembershipState](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}

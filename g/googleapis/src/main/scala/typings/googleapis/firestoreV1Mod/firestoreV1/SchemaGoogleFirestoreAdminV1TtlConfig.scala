package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1TtlConfig extends StObject {
  
  /**
    * Output only. The state of the TTL configuration.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1TtlConfig {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1TtlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1TtlConfig]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1TtlConfig](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

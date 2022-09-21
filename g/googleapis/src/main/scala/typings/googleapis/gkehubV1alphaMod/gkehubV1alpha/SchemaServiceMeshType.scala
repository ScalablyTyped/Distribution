package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshType extends StObject {
  
  /**
    * A 7 character code matching `^IST[0-9]{4\}$` or `^ASM[0-9]{4\}$`, intended to uniquely identify the message type. (e.g. "IST0001" is mapped to the "InternalError" message type.)
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human-readable name for the message type. e.g. "InternalError", "PodMissingProxy". This should be the same for all messages of the same type. (This corresponds to the `name` field in open-source Istio.)
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceMeshType {
  
  inline def apply(): SchemaServiceMeshType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshType]
  }
  
  extension [Self <: SchemaServiceMeshType](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}

package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevisionCheckResponse extends StObject {
  
  /**
    * The version of the API this client revision should use when calling API methods.
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#revisionCheckResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The result of the revision check.
    */
  var revisionStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaRevisionCheckResponse {
  
  inline def apply(): SchemaRevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionCheckResponse]
  }
  
  extension [Self <: SchemaRevisionCheckResponse](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRevisionStatus(value: String): Self = StObject.set(x, "revisionStatus", value.asInstanceOf[js.Any])
    
    inline def setRevisionStatusNull: Self = StObject.set(x, "revisionStatus", null)
    
    inline def setRevisionStatusUndefined: Self = StObject.set(x, "revisionStatus", js.undefined)
  }
}

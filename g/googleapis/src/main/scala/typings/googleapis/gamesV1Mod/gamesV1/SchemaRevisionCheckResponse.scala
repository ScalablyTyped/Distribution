package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the result of checking a revision.
  */
trait SchemaRevisionCheckResponse extends StObject {
  
  /**
    * The version of the API this client revision should use when calling API
    * methods.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#revisionCheckResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The result of the revision check. Possible values are:   - &quot;OK&quot;
    * - The revision being used is current.  - &quot;DEPRECATED&quot; - There
    * is currently a newer version available, but the revision being used still
    * works.  - &quot;INVALID&quot; - The revision being used is not supported
    * in any released version.
    */
  var revisionStatus: js.UndefOr[String] = js.undefined
}
object SchemaRevisionCheckResponse {
  
  @scala.inline
  def apply(): SchemaRevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionCheckResponse]
  }
  
  @scala.inline
  implicit class SchemaRevisionCheckResponseMutableBuilder[Self <: SchemaRevisionCheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRevisionStatus(value: String): Self = StObject.set(x, "revisionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionStatusUndefined: Self = StObject.set(x, "revisionStatus", js.undefined)
  }
}

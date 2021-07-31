package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instances ListServerCas response.
  */
trait SchemaInstancesListServerCasResponse extends StObject {
  
  var activeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * List of server CA certificates for the instance.
    */
  var certs: js.UndefOr[js.Array[SchemaSslCert]] = js.undefined
  
  /**
    * This is always sql#instancesListServerCas.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaInstancesListServerCasResponse {
  
  @scala.inline
  def apply(): SchemaInstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesListServerCasResponse]
  }
  
  @scala.inline
  implicit class SchemaInstancesListServerCasResponseMutableBuilder[Self <: SchemaInstancesListServerCasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveVersion(value: String): Self = StObject.set(x, "activeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveVersionUndefined: Self = StObject.set(x, "activeVersion", js.undefined)
    
    @scala.inline
    def setCerts(value: js.Array[SchemaSslCert]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    @scala.inline
    def setCertsVarargs(value: SchemaSslCert*): Self = StObject.set(x, "certs", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

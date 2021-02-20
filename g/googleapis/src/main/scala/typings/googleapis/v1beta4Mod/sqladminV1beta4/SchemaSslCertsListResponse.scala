package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SslCerts list response.
  */
@js.native
trait SchemaSslCertsListResponse extends StObject {
  
  /**
    * List of client certificates for the instance.
    */
  var items: js.UndefOr[js.Array[SchemaSslCert]] = js.native
  
  /**
    * This is always sql#sslCertsList.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaSslCertsListResponse {
  
  @scala.inline
  def apply(): SchemaSslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsListResponse]
  }
  
  @scala.inline
  implicit class SchemaSslCertsListResponseMutableBuilder[Self <: SchemaSslCertsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaSslCert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaSslCert*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

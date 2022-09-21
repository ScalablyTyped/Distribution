package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCertificateTemplatesResponse extends StObject {
  
  /**
    * The list of CertificateTemplates.
    */
  var certificateTemplates: js.UndefOr[js.Array[SchemaCertificateTemplate]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Pass this value in ListCertificateTemplatesRequest.next_page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations (e.g. "us-west1") that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListCertificateTemplatesResponse {
  
  inline def apply(): SchemaListCertificateTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCertificateTemplatesResponse]
  }
  
  extension [Self <: SchemaListCertificateTemplatesResponse](x: Self) {
    
    inline def setCertificateTemplates(value: js.Array[SchemaCertificateTemplate]): Self = StObject.set(x, "certificateTemplates", value.asInstanceOf[js.Any])
    
    inline def setCertificateTemplatesUndefined: Self = StObject.set(x, "certificateTemplates", js.undefined)
    
    inline def setCertificateTemplatesVarargs(value: SchemaCertificateTemplate*): Self = StObject.set(x, "certificateTemplates", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}

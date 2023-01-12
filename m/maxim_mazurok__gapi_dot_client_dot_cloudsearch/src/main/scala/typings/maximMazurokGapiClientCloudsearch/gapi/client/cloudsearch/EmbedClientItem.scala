package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbedClientItem extends StObject {
  
  /**
    * The canonical ID of the embed. If absent, the canonical ID is equal to the ID; if present, then the canonical ID represents an "equivalence class" of embeds which really refer to
    * the same object. (For example, the URLs http://www.foo.com/ and http://foo.com/ refer to the same object) This field may be updated periodically by background processes.
    */
  var canonicalId: js.UndefOr[String] = js.undefined
  
  /**
    * Deep-linking data to take the user to the right place in a mobile app. This is only used for preview and attribution. Links that are specific to a given embed type should live on
    * that specific embed's proto by using Link. See http://goto.google.com/mariana-design.
    */
  var deepLinkData: js.UndefOr[DeepLinkData] = js.undefined
  
  /** The ID of the embed. This corresponds to the schema.org ID, as represented in the ItemScope.id field. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The provenance of the embed, populated when the embed originated from a web fetch. The provenance captures information about the web page the embed had originated, like the URL that
    * was retrieved and the retrieved URL's canonical form. This is useful in the case where the URL shared by the URL redirects (e.g., in the case of a shortened URL).
    */
  var provenance: js.UndefOr[Provenance] = js.undefined
  
  /**
    * The ID used to identify the embed during rendering. This field will match ID, if set, otherwise it will be the ID of the parent activity. This field is only populated on the server
    * for client use and is not persisted to storage.
    */
  var renderId: js.UndefOr[String] = js.undefined
  
  /** Signature of the embed, used for verification. */
  var signature: js.UndefOr[String] = js.undefined
  
  /** Transient generic data that will not be saved on the server. */
  var transientData: js.UndefOr[Any] = js.undefined
  
  /**
    * The first value in `type` determines which extension field will be set. When creating an EmbedClientItem, you only need to set the first (primary) type in this field. When the
    * server receives the item, it will populate the full type list using the parent annotations in the ItemType enum.
    */
  var `type`: js.UndefOr[js.Array[String]] = js.undefined
}
object EmbedClientItem {
  
  inline def apply(): EmbedClientItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbedClientItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbedClientItem] (val x: Self) extends AnyVal {
    
    inline def setCanonicalId(value: String): Self = StObject.set(x, "canonicalId", value.asInstanceOf[js.Any])
    
    inline def setCanonicalIdUndefined: Self = StObject.set(x, "canonicalId", js.undefined)
    
    inline def setDeepLinkData(value: DeepLinkData): Self = StObject.set(x, "deepLinkData", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkDataUndefined: Self = StObject.set(x, "deepLinkData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProvenance(value: Provenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setRenderId(value: String): Self = StObject.set(x, "renderId", value.asInstanceOf[js.Any])
    
    inline def setRenderIdUndefined: Self = StObject.set(x, "renderId", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTransientData(value: Any): Self = StObject.set(x, "transientData", value.asInstanceOf[js.Any])
    
    inline def setTransientDataUndefined: Self = StObject.set(x, "transientData", js.undefined)
    
    inline def setType(value: js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
  }
}

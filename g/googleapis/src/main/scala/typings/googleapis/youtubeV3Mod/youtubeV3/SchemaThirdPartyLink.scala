package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyLink extends StObject {
  
  /**
    * Etag of this resource
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "youtube#thirdPartyLink".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The linking_token identifies a YouTube account and channel with which the third party account is linked.
    */
  var linkingToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The snippet object contains basic details about the third- party account link.
    */
  var snippet: js.UndefOr[SchemaThirdPartyLinkSnippet] = js.undefined
  
  /**
    * The status object contains information about the status of the link.
    */
  var status: js.UndefOr[SchemaThirdPartyLinkStatus] = js.undefined
}
object SchemaThirdPartyLink {
  
  inline def apply(): SchemaThirdPartyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyLink]
  }
  
  extension [Self <: SchemaThirdPartyLink](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinkingToken(value: String): Self = StObject.set(x, "linkingToken", value.asInstanceOf[js.Any])
    
    inline def setLinkingTokenNull: Self = StObject.set(x, "linkingToken", null)
    
    inline def setLinkingTokenUndefined: Self = StObject.set(x, "linkingToken", js.undefined)
    
    inline def setSnippet(value: SchemaThirdPartyLinkSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatus(value: SchemaThirdPartyLinkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

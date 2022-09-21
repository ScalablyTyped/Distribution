package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetRemarketingTagResponse extends StObject {
  
  /**
    * A HTML tag that can be placed on the advertiser's page to add users to a user list. For more information and code samples on using snippet on your website refer to [Tag your site for remarketing]( https://support.google.com/google-ads/answer/2476688).
    */
  var snippet: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetRemarketingTagResponse {
  
  inline def apply(): SchemaGetRemarketingTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetRemarketingTagResponse]
  }
  
  extension [Self <: SchemaGetRemarketingTagResponse](x: Self) {
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetNull: Self = StObject.set(x, "snippet", null)
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}

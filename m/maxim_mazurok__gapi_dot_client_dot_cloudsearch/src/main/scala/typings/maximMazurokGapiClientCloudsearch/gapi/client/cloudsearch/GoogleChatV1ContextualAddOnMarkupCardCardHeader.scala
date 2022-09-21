package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1ContextualAddOnMarkupCardCardHeader extends StObject {
  
  /** The image's type (e.g. square border or circular border). */
  var imageStyle: js.UndefOr[String] = js.undefined
  
  /** The URL of the image in the card header. */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /** The subtitle of the card header. */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * The title must be specified. The header has a fixed height: if both a title and subtitle is specified, each will take up 1 line. If only the title is specified, it will take up both
    * lines.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleChatV1ContextualAddOnMarkupCardCardHeader {
  
  inline def apply(): GoogleChatV1ContextualAddOnMarkupCardCardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1ContextualAddOnMarkupCardCardHeader]
  }
  
  extension [Self <: GoogleChatV1ContextualAddOnMarkupCardCardHeader](x: Self) {
    
    inline def setImageStyle(value: String): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

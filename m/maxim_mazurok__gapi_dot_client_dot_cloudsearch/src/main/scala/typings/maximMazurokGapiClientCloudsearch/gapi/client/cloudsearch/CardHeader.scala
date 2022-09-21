package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardHeader extends StObject {
  
  /** The alternative text of this image which will be used for accessibility. */
  var imageAltText: js.UndefOr[String] = js.undefined
  
  var imageStyle: js.UndefOr[String] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * The title must be specified. The header has a fixed height: if both a title and subtitle is specified, each will take up 1 line. If only the title is specified, it will take up both
    * lines. The header is rendered in collapsed and detailed view.
    */
  var title: js.UndefOr[String] = js.undefined
}
object CardHeader {
  
  inline def apply(): CardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardHeader]
  }
  
  extension [Self <: CardHeader](x: Self) {
    
    inline def setImageAltText(value: String): Self = StObject.set(x, "imageAltText", value.asInstanceOf[js.Any])
    
    inline def setImageAltTextUndefined: Self = StObject.set(x, "imageAltText", js.undefined)
    
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

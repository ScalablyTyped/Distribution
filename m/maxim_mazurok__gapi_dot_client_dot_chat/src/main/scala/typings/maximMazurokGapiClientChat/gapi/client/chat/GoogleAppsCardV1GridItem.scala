package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1GridItem extends StObject {
  
  /** A user-specified identifier for this grid item. This identifier is returned in the parent Grid's onClick callback parameters. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The image that displays in the grid item. */
  var image: js.UndefOr[GoogleAppsCardV1ImageComponent] = js.undefined
  
  /** The layout to use for the grid item. */
  var layout: js.UndefOr[String] = js.undefined
  
  /** The grid item's subtitle. */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /** The horizontal alignment of the grid item's text. */
  var textAlignment: js.UndefOr[String] = js.undefined
  
  /** The grid item's title. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1GridItem {
  
  inline def apply(): GoogleAppsCardV1GridItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1GridItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1GridItem] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: GoogleAppsCardV1ImageComponent): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTextAlignment(value: String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
    
    inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardHeader extends StObject {
  
  /** The image's type (e.g. square border or circular border). */
  var imageStyle: js.UndefOr[String] = js.native
  
  /** The URL of the image in the card header. */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** The subtitle of the card header. */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * The title must be specified. The header has a fixed height: if both a title and subtitle is specified, each will take up 1 line. If only the title is specified, it will take up both
    * lines.
    */
  var title: js.UndefOr[String] = js.native
}
object CardHeader {
  
  @scala.inline
  def apply(): CardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardHeader]
  }
  
  @scala.inline
  implicit class CardHeaderMutableBuilder[Self <: CardHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageStyle(value: String): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

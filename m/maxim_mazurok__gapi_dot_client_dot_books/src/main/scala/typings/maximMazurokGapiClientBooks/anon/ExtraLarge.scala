package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraLarge extends StObject {
  
  /** Image link for extra large size (width of ~1280 pixels). (In LITE projection) */
  var extraLarge: js.UndefOr[String] = js.native
  
  /** Image link for large size (width of ~800 pixels). (In LITE projection) */
  var large: js.UndefOr[String] = js.native
  
  /** Image link for medium size (width of ~575 pixels). (In LITE projection) */
  var medium: js.UndefOr[String] = js.native
  
  /** Image link for small size (width of ~300 pixels). (In LITE projection) */
  var small: js.UndefOr[String] = js.native
  
  /** Image link for small thumbnail size (width of ~80 pixels). (In LITE projection) */
  var smallThumbnail: js.UndefOr[String] = js.native
  
  /** Image link for thumbnail size (width of ~128 pixels). (In LITE projection) */
  var thumbnail: js.UndefOr[String] = js.native
}
object ExtraLarge {
  
  @scala.inline
  def apply(): ExtraLarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraLarge]
  }
  
  @scala.inline
  implicit class ExtraLargeMutableBuilder[Self <: ExtraLarge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraLarge(value: String): Self = StObject.set(x, "extraLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraLargeUndefined: Self = StObject.set(x, "extraLarge", js.undefined)
    
    @scala.inline
    def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallThumbnail(value: String): Self = StObject.set(x, "smallThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallThumbnailUndefined: Self = StObject.set(x, "smallThumbnail", js.undefined)
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}

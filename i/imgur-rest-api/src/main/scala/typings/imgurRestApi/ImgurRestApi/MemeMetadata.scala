package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemeMetadata extends StObject {
  
  var bg_image: String = js.native
  
  var bottom_text: String = js.native
  
  var meme_name: String = js.native
  
  var top_text: String = js.native
}
object MemeMetadata {
  
  @scala.inline
  def apply(bg_image: String, bottom_text: String, meme_name: String, top_text: String): MemeMetadata = {
    val __obj = js.Dynamic.literal(bg_image = bg_image.asInstanceOf[js.Any], bottom_text = bottom_text.asInstanceOf[js.Any], meme_name = meme_name.asInstanceOf[js.Any], top_text = top_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemeMetadata]
  }
  
  @scala.inline
  implicit class MemeMetadataMutableBuilder[Self <: MemeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg_image(value: String): Self = StObject.set(x, "bg_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom_text(value: String): Self = StObject.set(x, "bottom_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeme_name(value: String): Self = StObject.set(x, "meme_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_text(value: String): Self = StObject.set(x, "top_text", value.asInstanceOf[js.Any])
  }
}

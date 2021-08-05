package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemeMetadata extends StObject {
  
  var bg_image: String
  
  var bottom_text: String
  
  var meme_name: String
  
  var top_text: String
}
object MemeMetadata {
  
  inline def apply(bg_image: String, bottom_text: String, meme_name: String, top_text: String): MemeMetadata = {
    val __obj = js.Dynamic.literal(bg_image = bg_image.asInstanceOf[js.Any], bottom_text = bottom_text.asInstanceOf[js.Any], meme_name = meme_name.asInstanceOf[js.Any], top_text = top_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemeMetadata]
  }
  
  extension [Self <: MemeMetadata](x: Self) {
    
    inline def setBg_image(value: String): Self = StObject.set(x, "bg_image", value.asInstanceOf[js.Any])
    
    inline def setBottom_text(value: String): Self = StObject.set(x, "bottom_text", value.asInstanceOf[js.Any])
    
    inline def setMeme_name(value: String): Self = StObject.set(x, "meme_name", value.asInstanceOf[js.Any])
    
    inline def setTop_text(value: String): Self = StObject.set(x, "top_text", value.asInstanceOf[js.Any])
  }
}

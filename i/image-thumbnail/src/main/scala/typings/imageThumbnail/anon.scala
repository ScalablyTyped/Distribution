package typings.imageThumbnail

import typings.imageThumbnail.imageThumbnailStrings.base64
import typings.imageThumbnail.imageThumbnailStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Uri extends StObject {
    
    var uri: String
  }
  object Uri {
    
    inline def apply(uri: String): Uri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  responseType :'base64'} & image-thumbnail.image-thumbnail.Options */
  trait responseTypebase64Options extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var responseType: base64
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object responseTypebase64Options {
    
    inline def apply(): responseTypebase64Options = {
      val __obj = js.Dynamic.literal(responseType = "base64")
      __obj.asInstanceOf[responseTypebase64Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: responseTypebase64Options] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setResponseType(value: base64): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined {  responseType :'buffer'} & image-thumbnail.image-thumbnail.Options */
  trait responseTypebufferOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var responseType: buffer
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object responseTypebufferOptions {
    
    inline def apply(): responseTypebufferOptions = {
      val __obj = js.Dynamic.literal(responseType = "buffer")
      __obj.asInstanceOf[responseTypebufferOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: responseTypebufferOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setResponseType(value: buffer): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

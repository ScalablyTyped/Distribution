package typings.imageThumbnail

import typings.imageThumbnail.imageThumbnailStrings.base64
import typings.imageThumbnail.imageThumbnailStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Uri extends StObject {
    
    var uri: String = js.native
  }
  object Uri {
    
    @scala.inline
    def apply(uri: String): Uri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uri]
    }
    
    @scala.inline
    implicit class UriMutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  responseType :'base64'} & image-thumbnail.image-thumbnail.Options */
  @js.native
  trait responseTypebase64Options extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var percentage: js.UndefOr[Double] = js.native
    
    var responseType: base64 with js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object responseTypebase64Options {
    
    @scala.inline
    def apply(responseType: base64 with js.UndefOr[String]): responseTypebase64Options = {
      val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[responseTypebase64Options]
    }
    
    @scala.inline
    implicit class responseTypebase64OptionsMutableBuilder[Self <: responseTypebase64Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setResponseType(value: base64 with js.UndefOr[String]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined {  responseType :'buffer'} & image-thumbnail.image-thumbnail.Options */
  @js.native
  trait responseTypebufferOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var percentage: js.UndefOr[Double] = js.native
    
    var responseType: buffer with js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object responseTypebufferOptions {
    
    @scala.inline
    def apply(responseType: buffer with js.UndefOr[String]): responseTypebufferOptions = {
      val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[responseTypebufferOptions]
    }
    
    @scala.inline
    implicit class responseTypebufferOptionsMutableBuilder[Self <: responseTypebufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setResponseType(value: buffer with js.UndefOr[String]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

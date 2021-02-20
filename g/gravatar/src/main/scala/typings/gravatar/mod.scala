package typings.gravatar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gravatar", "profile_url")
  @js.native
  def profileUrl(email: String): String = js.native
  @JSImport("gravatar", "profile_url")
  @js.native
  def profileUrl(email: String, options: js.UndefOr[scala.Nothing], protocol: Boolean): String = js.native
  @JSImport("gravatar", "profile_url")
  @js.native
  def profileUrl(email: String, options: Options): String = js.native
  @JSImport("gravatar", "profile_url")
  @js.native
  def profileUrl(email: String, options: Options, protocol: Boolean): String = js.native
  
  @JSImport("gravatar", "url")
  @js.native
  def url(email: String): String = js.native
  @JSImport("gravatar", "url")
  @js.native
  def url(email: String, options: js.UndefOr[scala.Nothing], protocol: Boolean): String = js.native
  @JSImport("gravatar", "url")
  @js.native
  def url(email: String, options: Options): String = js.native
  @JSImport("gravatar", "url")
  @js.native
  def url(email: String, options: Options, protocol: Boolean): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var cdn: js.UndefOr[String] = js.native
    
    var d: js.UndefOr[String] = js.native
    
    var f: js.UndefOr[String] = js.native
    
    var forcedefault: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var r: js.UndefOr[String] = js.native
    
    var rating: js.UndefOr[String] = js.native
    
    var s: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setForcedefault(value: String): Self = StObject.set(x, "forcedefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcedefaultUndefined: Self = StObject.set(x, "forcedefault", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

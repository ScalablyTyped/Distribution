package typings.gravatar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gravatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def profileUrl(email: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def profileUrl(email: String, options: Unit, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def profileUrl(email: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def profileUrl(email: String, options: Options, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def url(email: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def url(email: String, options: Unit, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def url(email: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def url(email: String, options: Options, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var cdn: js.UndefOr[String] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var f: js.UndefOr[String] = js.undefined
    
    var forcedefault: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var r: js.UndefOr[String] = js.undefined
    
    var rating: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
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

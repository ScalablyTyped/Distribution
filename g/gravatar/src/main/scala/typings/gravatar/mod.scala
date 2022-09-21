package typings.gravatar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gravatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def profileUrl(email: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def profileUrl(email: String, options: Unit, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def profileUrl(email: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def profileUrl(email: String, options: Options, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("profile_url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def url(email: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def url(email: String, options: Unit, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def url(email: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def url(email: String, options: Options, protocol: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var cdn: js.UndefOr[String] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var f: js.UndefOr[String] = js.undefined
    
    var forcedefault: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[Protocol] = js.undefined
    
    var r: js.UndefOr[String] = js.undefined
    
    var rating: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      inline def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setForcedefault(value: String): Self = StObject.set(x, "forcedefault", value.asInstanceOf[js.Any])
      
      inline def setForcedefaultUndefined: Self = StObject.set(x, "forcedefault", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gravatar.gravatarBooleans.`false`
    - typings.gravatar.gravatarBooleans.`true`
    - typings.gravatar.gravatarStrings.http
    - typings.gravatar.gravatarStrings.https
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def `false`: typings.gravatar.gravatarBooleans.`false` = false.asInstanceOf[typings.gravatar.gravatarBooleans.`false`]
    
    inline def http: typings.gravatar.gravatarStrings.http = "http".asInstanceOf[typings.gravatar.gravatarStrings.http]
    
    inline def https: typings.gravatar.gravatarStrings.https = "https".asInstanceOf[typings.gravatar.gravatarStrings.https]
    
    inline def `true`: typings.gravatar.gravatarBooleans.`true` = true.asInstanceOf[typings.gravatar.gravatarBooleans.`true`]
  }
}

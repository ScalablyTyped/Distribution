package typings.jsGravatar

import typings.jsGravatar.jsGravatarStrings.`404`
import typings.jsGravatar.jsGravatarStrings.blank
import typings.jsGravatar.jsGravatarStrings.identicon
import typings.jsGravatar.jsGravatarStrings.monsterid
import typings.jsGravatar.jsGravatarStrings.mp
import typings.jsGravatar.jsGravatarStrings.retro
import typings.jsGravatar.jsGravatarStrings.robohash
import typings.jsGravatar.jsGravatarStrings.wavatar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("js-gravatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildQueryStringFromOptions(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryStringFromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")().asInstanceOf[Unit]
  inline def validateOptions(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      *  What image should be used if email does not have a gravatar
      */
    var defaultImage: js.UndefOr[`404` | mp | identicon | monsterid | wavatar | retro | robohash | blank] = js.undefined
    
    /**
      * Email address of the user to generate gravatar for
      */
    var email: String
    
    /**
      *  Optional: MD5 hash of the email above.
      * If email is provided, md5hash will be ignored. If neither email nor md5hash is provided, the library will throw en error
      */
    var md5Hash: js.UndefOr[String] = js.undefined
    
    /**
      * The size of the image to be displayed. Should be from 1 to 2048
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(email: String): Options = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefaultImage(value: `404` | mp | identicon | monsterid | wavatar | retro | robohash | blank): Self = StObject.set(x, "defaultImage", value.asInstanceOf[js.Any])
      
      inline def setDefaultImageUndefined: Self = StObject.set(x, "defaultImage", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

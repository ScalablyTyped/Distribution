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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-gravatar", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("js-gravatar", JSImport.Namespace)
  @js.native
  def apply(options: Options): String = js.native
  
  @JSImport("js-gravatar", "buildQueryStringFromOptions")
  @js.native
  def buildQueryStringFromOptions(options: Options): String = js.native
  
  @JSImport("js-gravatar", "validateOptions")
  @js.native
  def validateOptions(): Unit = js.native
  @JSImport("js-gravatar", "validateOptions")
  @js.native
  def validateOptions(options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      *  What image should be used if email does not have a gravatar
      */
    var defaultImage: js.UndefOr[`404` | mp | identicon | monsterid | wavatar | retro | robohash | blank] = js.native
    
    /**
      * Email address of the user to generate gravatar for
      */
    var email: String = js.native
    
    /**
      *  Optional: MD5 hash of the email above.
      * If email is provided, md5hash will be ignored. If neither email nor md5hash is provided, the library will throw en error
      */
    var md5Hash: js.UndefOr[String] = js.native
    
    /**
      * The size of the image to be displayed. Should be from 1 to 2048
      */
    var size: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(email: String): Options = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultImage(value: `404` | mp | identicon | monsterid | wavatar | retro | robohash | blank): Self = StObject.set(x, "defaultImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultImageUndefined: Self = StObject.set(x, "defaultImage", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

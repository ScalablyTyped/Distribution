package typings.gravatarUrl

import typings.gravatarUrl.gravatarUrlStrings.`404`
import typings.gravatarUrl.gravatarUrlStrings.blank
import typings.gravatarUrl.gravatarUrlStrings.g
import typings.gravatarUrl.gravatarUrlStrings.identicon
import typings.gravatarUrl.gravatarUrlStrings.mm
import typings.gravatarUrl.gravatarUrlStrings.monsterid
import typings.gravatarUrl.gravatarUrlStrings.pg
import typings.gravatarUrl.gravatarUrlStrings.r
import typings.gravatarUrl.gravatarUrlStrings.retro
import typings.gravatarUrl.gravatarUrlStrings.wavatar
import typings.gravatarUrl.gravatarUrlStrings.x
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gravatar-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(identifier: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(identifier.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(identifier: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(identifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	[Image](https://en.gravatar.com/site/implement/images/#default-image) to return if the identifier didn't match any Gravatar profile. Either a ustom URL or [`404`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=404), [`mm`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=mm), [`identicon`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=identicon), [`monsterid`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=monsterid), [`wavatar`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=wavatar), [`retro`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=retro), [`blank`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=blank).
    	@default 'https://gravatar.com/avatar/00000000000000000000000000000000'
    	*/
    val default: js.UndefOr[
        LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]
      ] = js.undefined
    
    /**
    	Allowed [rating](https://en.gravatar.com/site/implement/images/#rating) of the image.
    	@default 'g'
    	*/
    val rating: js.UndefOr[g | pg | r | x] = js.undefined
    
    /**
    	[Size](https://en.gravatar.com/site/implement/images/#size) of the image. Values: `1..2048`.
    	@default 80
    	*/
    val size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setRating(value: g | pg | r | typings.gravatarUrl.gravatarUrlStrings.x): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

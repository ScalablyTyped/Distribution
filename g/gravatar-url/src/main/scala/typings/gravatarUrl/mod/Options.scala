package typings.gravatarUrl.mod

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
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		[Image](https://en.gravatar.com/site/implement/images/#default-image) to return if the identifier didn't match any Gravatar profile. Either a ustom URL or [`404`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=404), [`mm`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=mm), [`identicon`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=identicon), [`monsterid`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=monsterid), [`wavatar`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=wavatar), [`retro`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=retro), [`blank`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=blank).
  		@default 'https://gravatar.com/avatar/00000000000000000000000000000000'
  		*/
  val default: js.UndefOr[
    LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]
  ] = js.native
  
  /**
  		Allowed [rating](https://en.gravatar.com/site/implement/images/#rating) of the image.
  		@default 'g'
  		*/
  val rating: js.UndefOr[g | pg | r | x] = js.native
  
  /**
  		[Size](https://en.gravatar.com/site/implement/images/#size) of the image. Values: `1..2048`.
  		@default 80
  		*/
  val size: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefault(value: LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setRating(value: g | pg | r | typings.gravatarUrl.gravatarUrlStrings.x): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}

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
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  @scala.inline
  def apply(
    default: LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String] = null,
    rating: g | pg | r | x = null,
    size: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


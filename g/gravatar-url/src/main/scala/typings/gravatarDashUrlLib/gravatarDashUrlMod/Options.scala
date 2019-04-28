package typings
package gravatarDashUrlLib.gravatarDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		[Image](https://en.gravatar.com/site/implement/images/#default-image) to return if the email didn't match any Gravatar profile. Either a ustom URL or [`404`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=404), [`mm`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=mm), [`identicon`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=identicon), [`monsterid`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=monsterid), [`wavatar`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=wavatar), [`retro`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=retro), [`blank`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=blank).
  		@default 'https://gravatar.com/avatar/00000000000000000000000000000000'
  		*/
  val default: js.UndefOr[
    typeDashFestLib.typeDashFestMod.LiteralUnion[
      gravatarDashUrlLib.gravatarDashUrlLibStrings.`404` | gravatarDashUrlLib.gravatarDashUrlLibStrings.mm | gravatarDashUrlLib.gravatarDashUrlLibStrings.identicon | gravatarDashUrlLib.gravatarDashUrlLibStrings.monsterid | gravatarDashUrlLib.gravatarDashUrlLibStrings.wavatar | gravatarDashUrlLib.gravatarDashUrlLibStrings.retro | gravatarDashUrlLib.gravatarDashUrlLibStrings.blank, 
      java.lang.String
    ]
  ] = js.undefined
  /**
  		Allowed [rating](https://en.gravatar.com/site/implement/images/#rating) of the image.
  		@default 'g'
  		*/
  val rating: js.UndefOr[
    gravatarDashUrlLib.gravatarDashUrlLibStrings.g | gravatarDashUrlLib.gravatarDashUrlLibStrings.pg | gravatarDashUrlLib.gravatarDashUrlLibStrings.r | gravatarDashUrlLib.gravatarDashUrlLibStrings.x
  ] = js.undefined
  /**
  		[Size](https://en.gravatar.com/site/implement/images/#size) of the image. Values: `1..2048`.
  		@default 80
  		*/
  val size: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: typeDashFestLib.typeDashFestMod.LiteralUnion[
      gravatarDashUrlLib.gravatarDashUrlLibStrings.`404` | gravatarDashUrlLib.gravatarDashUrlLibStrings.mm | gravatarDashUrlLib.gravatarDashUrlLibStrings.identicon | gravatarDashUrlLib.gravatarDashUrlLibStrings.monsterid | gravatarDashUrlLib.gravatarDashUrlLibStrings.wavatar | gravatarDashUrlLib.gravatarDashUrlLibStrings.retro | gravatarDashUrlLib.gravatarDashUrlLibStrings.blank, 
      java.lang.String
    ] = null,
    rating: gravatarDashUrlLib.gravatarDashUrlLibStrings.g | gravatarDashUrlLib.gravatarDashUrlLibStrings.pg | gravatarDashUrlLib.gravatarDashUrlLibStrings.r | gravatarDashUrlLib.gravatarDashUrlLibStrings.x = null,
    size: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


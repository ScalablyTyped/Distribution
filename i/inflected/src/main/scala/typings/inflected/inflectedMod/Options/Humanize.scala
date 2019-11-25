package typings.inflected.inflectedMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Humanize extends js.Object {
  var capitalize: Boolean
}

object Humanize {
  @scala.inline
  def apply(capitalize: Boolean): Humanize = {
    val __obj = js.Dynamic.literal(capitalize = capitalize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Humanize]
  }
}


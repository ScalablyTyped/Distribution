package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountOptions extends js.Object {
  def allPages(): typings.jodata.jo
  def none(): typings.jodata.jo
}

object InlineCountOptions {
  @scala.inline
  def apply(allPages: () => typings.jodata.jo, none: () => typings.jodata.jo): InlineCountOptions = {
    val __obj = js.Dynamic.literal(allPages = js.Any.fromFunction0(allPages), none = js.Any.fromFunction0(none))
  
    __obj.asInstanceOf[InlineCountOptions]
  }
}


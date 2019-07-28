package typings.jodata.joNs

import typings.jodata.jo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountOptions extends js.Object {
  def allPages(): jo
  def none(): jo
}

object InlineCountOptions {
  @scala.inline
  def apply(allPages: () => jo, none: () => jo): InlineCountOptions = {
    val __obj = js.Dynamic.literal(allPages = js.Any.fromFunction0(allPages), none = js.Any.fromFunction0(none))
  
    __obj.asInstanceOf[InlineCountOptions]
  }
}


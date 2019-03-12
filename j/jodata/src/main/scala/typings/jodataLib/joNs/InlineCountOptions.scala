package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountOptions extends js.Object {
  def allPages(): jodataLib.jo
  def none(): jodataLib.jo
}

object InlineCountOptions {
  @scala.inline
  def apply(allPages: () => jodataLib.jo, none: () => jodataLib.jo): InlineCountOptions = {
    val __obj = js.Dynamic.literal(allPages = js.Any.fromFunction0(allPages), none = js.Any.fromFunction0(none))
  
    __obj.asInstanceOf[InlineCountOptions]
  }
}


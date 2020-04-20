package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagHeaderFlags extends js.Object {
  var experimental_indicator: Boolean
  var extended_header: Boolean
  var footer_present: Boolean
  var unsynchronisation: Boolean
}

object TagHeaderFlags {
  @scala.inline
  def apply(
    experimental_indicator: Boolean,
    extended_header: Boolean,
    footer_present: Boolean,
    unsynchronisation: Boolean
  ): TagHeaderFlags = {
    val __obj = js.Dynamic.literal(experimental_indicator = experimental_indicator.asInstanceOf[js.Any], extended_header = extended_header.asInstanceOf[js.Any], footer_present = footer_present.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagHeaderFlags]
  }
}


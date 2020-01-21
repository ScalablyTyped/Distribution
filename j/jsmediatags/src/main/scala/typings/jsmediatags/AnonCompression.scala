package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompression extends js.Object {
  var compression: Boolean
  var data_length_indicator: Boolean
  var encryption: Boolean
  var grouping_identity: Boolean
  var unsynchronisation: Boolean
}

object AnonCompression {
  @scala.inline
  def apply(
    compression: Boolean,
    data_length_indicator: Boolean,
    encryption: Boolean,
    grouping_identity: Boolean,
    unsynchronisation: Boolean
  ): AnonCompression = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], data_length_indicator = data_length_indicator.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], grouping_identity = grouping_identity.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompression]
  }
}


package typings.atGrpcGrpcDashJs.buildSrcPickerMod

import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickArgs extends js.Object {
  var metadata: Metadata
}

object PickArgs {
  @scala.inline
  def apply(metadata: Metadata): PickArgs = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickArgs]
  }
}


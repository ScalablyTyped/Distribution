package typings.jweixin.anon

import typings.jweixin.mod.networkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkType extends js.Object {
  var networkType: typings.jweixin.mod.networkType
}

object NetworkType {
  @scala.inline
  def apply(networkType: networkType): NetworkType = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkType]
  }
}


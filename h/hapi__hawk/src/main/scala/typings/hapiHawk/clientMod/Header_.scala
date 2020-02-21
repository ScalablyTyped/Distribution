package typings.hapiHawk.clientMod

import typings.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header_ extends js.Object {
  var artifacts: Artifacts
  var header: String
}

object Header_ {
  @scala.inline
  def apply(artifacts: Artifacts, header: String): Header_ = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Header_]
  }
}


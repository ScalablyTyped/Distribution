package typings.hapiHawk.serverMod

import typings.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authentication extends js.Object {
  var artifacts: Artifacts
  var credentials: Credentials
}

object Authentication {
  @scala.inline
  def apply(artifacts: Artifacts, credentials: Credentials): Authentication = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Authentication]
  }
}


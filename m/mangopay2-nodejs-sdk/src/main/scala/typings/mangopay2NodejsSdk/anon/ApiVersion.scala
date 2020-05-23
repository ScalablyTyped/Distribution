package typings.mangopay2NodejsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiVersion extends js.Object {
  var apiVersion: String
  var clientId: String
  val id: String
}

object ApiVersion {
  @scala.inline
  def apply(apiVersion: String, clientId: String, id: String): ApiVersion = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
}


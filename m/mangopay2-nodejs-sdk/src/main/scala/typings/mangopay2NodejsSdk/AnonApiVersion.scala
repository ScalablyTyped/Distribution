package typings.mangopay2NodejsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiVersion extends js.Object {
  var apiVersion: String
  var clientId: String
  val id: String
}

object AnonApiVersion {
  @scala.inline
  def apply(apiVersion: String, clientId: String, id: String): AnonApiVersion = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiVersion]
  }
}


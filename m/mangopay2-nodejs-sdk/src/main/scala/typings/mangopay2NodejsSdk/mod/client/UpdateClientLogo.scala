package typings.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClientLogo extends js.Object {
  /**
    * The base64 encoded file which needs to be uploaded
    */
  var File: String
}

object UpdateClientLogo {
  @scala.inline
  def apply(File: String): UpdateClientLogo = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateClientLogo]
  }
}


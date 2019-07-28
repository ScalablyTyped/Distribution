package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthIdentityDetails extends js.Object {
  var html_url: String
  var name: String
  var username: String
}

object OAuthIdentityDetails {
  @scala.inline
  def apply(html_url: String, name: String, username: String): OAuthIdentityDetails = {
    val __obj = js.Dynamic.literal(html_url = html_url, name = name, username = username)
  
    __obj.asInstanceOf[OAuthIdentityDetails]
  }
}


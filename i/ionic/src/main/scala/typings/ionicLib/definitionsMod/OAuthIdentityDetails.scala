package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthIdentityDetails extends js.Object {
  var html_url: java.lang.String
  var name: java.lang.String
  var username: java.lang.String
}

object OAuthIdentityDetails {
  @scala.inline
  def apply(html_url: java.lang.String, name: java.lang.String, username: java.lang.String): OAuthIdentityDetails = {
    val __obj = js.Dynamic.literal(html_url = html_url, name = name, username = username)
  
    __obj.asInstanceOf[OAuthIdentityDetails]
  }
}


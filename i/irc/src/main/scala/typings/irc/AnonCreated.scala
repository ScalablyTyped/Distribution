package typings.irc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreated extends js.Object {
  var created: String
  var key: String
  var mode: String
  var serverName: String
  var users: StringDictionary[String]
}

object AnonCreated {
  @scala.inline
  def apply(created: String, key: String, mode: String, serverName: String, users: StringDictionary[String]): AnonCreated = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreated]
  }
}


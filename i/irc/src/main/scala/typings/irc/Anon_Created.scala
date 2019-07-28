package typings.irc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends js.Object {
  var created: String
  var key: String
  var mode: String
  var serverName: String
  var users: StringDictionary[String]
}

object Anon_Created {
  @scala.inline
  def apply(created: String, key: String, mode: String, serverName: String, users: StringDictionary[String]): Anon_Created = {
    val __obj = js.Dynamic.literal(created = created, key = key, mode = mode, serverName = serverName, users = users)
  
    __obj.asInstanceOf[Anon_Created]
  }
}


package typings
package ircLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends js.Object {
  var created: java.lang.String
  var key: java.lang.String
  var mode: java.lang.String
  var serverName: java.lang.String
  var users: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Anon_Created {
  @scala.inline
  def apply(
    created: java.lang.String,
    key: java.lang.String,
    mode: java.lang.String,
    serverName: java.lang.String,
    users: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): Anon_Created = {
    val __obj = js.Dynamic.literal(created = created, key = key, mode = mode, serverName = serverName, users = users)
  
    __obj.asInstanceOf[Anon_Created]
  }
}


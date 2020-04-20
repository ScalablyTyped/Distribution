package typings.inquirer.eventsMod

import typings.node.readlineMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a description about a key.
  */
trait KeyDescriptor extends js.Object {
  /**
    * Thedescription of the key.
    */
  var key: Key
  /**
    * The value of the key.
    */
  var value: String
}

object KeyDescriptor {
  @scala.inline
  def apply(key: Key, value: String): KeyDescriptor = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDescriptor]
  }
}


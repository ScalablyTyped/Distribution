package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.iobrokerStrings.`object`
import typings.iobroker.iobrokerStrings.create
import typings.iobroker.iobrokerStrings.delete
import typings.iobroker.iobrokerStrings.file
import typings.iobroker.iobrokerStrings.list
import typings.iobroker.iobrokerStrings.read
import typings.iobroker.iobrokerStrings.state
import typings.iobroker.iobrokerStrings.users
import typings.iobroker.iobrokerStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOrStatePermission extends Permission {
  @JSName("operation")
  var operation_ObjectOrStatePermission: list | read | write | create | delete
  @JSName("type")
  var type_ObjectOrStatePermission: `object` | file | users | state
}

object ObjectOrStatePermission {
  @scala.inline
  def apply(operation: list | read | write | create | delete, `type`: `object` | file | users | state): ObjectOrStatePermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOrStatePermission]
  }
}


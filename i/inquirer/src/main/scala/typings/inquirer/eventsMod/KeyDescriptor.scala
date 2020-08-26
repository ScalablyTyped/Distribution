package typings.inquirer.eventsMod

import typings.node.readlineMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a description about a key.
  */
@js.native
trait KeyDescriptor extends js.Object {
  /**
    * Thedescription of the key.
    */
  var key: Key = js.native
  /**
    * The value of the key.
    */
  var value: String = js.native
}

object KeyDescriptor {
  @scala.inline
  def apply(key: Key, value: String): KeyDescriptor = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDescriptor]
  }
  @scala.inline
  implicit class KeyDescriptorOps[Self <: KeyDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


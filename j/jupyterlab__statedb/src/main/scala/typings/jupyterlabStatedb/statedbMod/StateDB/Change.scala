package typings.jupyterlabStatedb.statedbMod.StateDB

import typings.jupyterlabStatedb.jupyterlabStatedbStrings.clear
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.remove
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.save
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A state database change.
  */
@js.native
trait Change extends js.Object {
  /**
    * The key of the database item that was changed.
    *
    * #### Notes
    * This field is set to `null` for global changes (i.e. `clear`).
    */
  var id: String | Null = js.native
  /**
    * The type of change.
    */
  var `type`: clear | remove | save = js.native
}

object Change {
  @scala.inline
  def apply(`type`: clear | remove | save): Change = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
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
    def setType(value: clear | remove | save): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
  }
  
}


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
trait Change extends js.Object {
  /**
    * The key of the database item that was changed.
    *
    * #### Notes
    * This field is set to `null` for global changes (i.e. `clear`).
    */
  var id: String | Null
  /**
    * The type of change.
    */
  var `type`: clear | remove | save
}

object Change {
  @scala.inline
  def apply(`type`: clear | remove | save, id: String = null): Change = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}


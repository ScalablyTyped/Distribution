package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data for a [[SelectionOption|`SelectionOption`]].
  */
trait SelectionOptionData extends js.Object {
  /**
    * Unique identifier of a [[SelectionOption|`SelectionOption`]].
    * Must match with [[SelectionOption.id|`SelectionOption.id`]]
    * field.
    */
  var id: String
}

object SelectionOptionData {
  @scala.inline
  def apply(id: String): SelectionOptionData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOptionData]
  }
}


package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data for a [[SelectionOption|`SelectionOption`]].
  */
@js.native
trait SelectionOptionData extends js.Object {
  
  /**
    * Unique identifier of a [[SelectionOption|`SelectionOption`]].
    * Must match with [[SelectionOption.id|`SelectionOption.id`]]
    * field.
    */
  var id: String = js.native
}
object SelectionOptionData {
  
  @scala.inline
  def apply(id: String): SelectionOptionData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOptionData]
  }
  
  @scala.inline
  implicit class SelectionOptionDataOps[Self <: SelectionOptionData] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}

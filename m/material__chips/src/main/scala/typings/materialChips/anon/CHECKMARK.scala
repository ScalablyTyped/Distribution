package typings.materialChips.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHECKMARK extends js.Object {
  
  var CHECKMARK: String = js.native
  
  var CHIP_EXIT: String = js.native
  
  var DELETABLE: String = js.native
  
  var EDITABLE: String = js.native
  
  var EDITING: String = js.native
  
  var HIDDEN_LEADING_ICON: String = js.native
  
  var LEADING_ICON: String = js.native
  
  var PRIMARY_ACTION: String = js.native
  
  var PRIMARY_ACTION_FOCUSED: String = js.native
  
  var SELECTED: String = js.native
  
  var TEXT: String = js.native
  
  var TRAILING_ACTION: String = js.native
  
  var TRAILING_ICON: String = js.native
}
object CHECKMARK {
  
  @scala.inline
  def apply(
    CHECKMARK: String,
    CHIP_EXIT: String,
    DELETABLE: String,
    EDITABLE: String,
    EDITING: String,
    HIDDEN_LEADING_ICON: String,
    LEADING_ICON: String,
    PRIMARY_ACTION: String,
    PRIMARY_ACTION_FOCUSED: String,
    SELECTED: String,
    TEXT: String,
    TRAILING_ACTION: String,
    TRAILING_ICON: String
  ): CHECKMARK = {
    val __obj = js.Dynamic.literal(CHECKMARK = CHECKMARK.asInstanceOf[js.Any], CHIP_EXIT = CHIP_EXIT.asInstanceOf[js.Any], DELETABLE = DELETABLE.asInstanceOf[js.Any], EDITABLE = EDITABLE.asInstanceOf[js.Any], EDITING = EDITING.asInstanceOf[js.Any], HIDDEN_LEADING_ICON = HIDDEN_LEADING_ICON.asInstanceOf[js.Any], LEADING_ICON = LEADING_ICON.asInstanceOf[js.Any], PRIMARY_ACTION = PRIMARY_ACTION.asInstanceOf[js.Any], PRIMARY_ACTION_FOCUSED = PRIMARY_ACTION_FOCUSED.asInstanceOf[js.Any], SELECTED = SELECTED.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any], TRAILING_ACTION = TRAILING_ACTION.asInstanceOf[js.Any], TRAILING_ICON = TRAILING_ICON.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHECKMARK]
  }
  
  @scala.inline
  implicit class CHECKMARKOps[Self <: CHECKMARK] (val x: Self) extends AnyVal {
    
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
    def setCHECKMARK(value: String): Self = this.set("CHECKMARK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHIP_EXIT(value: String): Self = this.set("CHIP_EXIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDELETABLE(value: String): Self = this.set("DELETABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDITABLE(value: String): Self = this.set("EDITABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDITING(value: String): Self = this.set("EDITING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHIDDEN_LEADING_ICON(value: String): Self = this.set("HIDDEN_LEADING_ICON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEADING_ICON(value: String): Self = this.set("LEADING_ICON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRIMARY_ACTION(value: String): Self = this.set("PRIMARY_ACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRIMARY_ACTION_FOCUSED(value: String): Self = this.set("PRIMARY_ACTION_FOCUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECTED(value: String): Self = this.set("SELECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT(value: String): Self = this.set("TEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRAILING_ACTION(value: String): Self = this.set("TRAILING_ACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRAILING_ICON(value: String): Self = this.set("TRAILING_ICON", value.asInstanceOf[js.Any])
  }
}

package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyCode extends js.Object {
  var BACKSPACE: Double = js.native
  var COMMA: Double = js.native
  var DELETE: Double = js.native
  var DOWN: Double = js.native
  var END: Double = js.native
  var ENTER: Double = js.native
  var ESCAPE: Double = js.native
  var HOME: Double = js.native
  var LEFT: Double = js.native
  var NUMPAD_ADD: Double = js.native
  var NUMPAD_DECIMAL: Double = js.native
  var NUMPAD_DIVIDE: Double = js.native
  var NUMPAD_ENTER: Double = js.native
  var NUMPAD_MULTIPLY: Double = js.native
  var NUMPAD_SUBTRACT: Double = js.native
  var PAGE_DOWN: Double = js.native
  var PAGE_UP: Double = js.native
  var PERIOD: Double = js.native
  var RIGHT: Double = js.native
  var SPACE: Double = js.native
  var TAB: Double = js.native
  var UP: Double = js.native
}

object KeyCode {
  @scala.inline
  def apply(
    BACKSPACE: Double,
    COMMA: Double,
    DELETE: Double,
    DOWN: Double,
    END: Double,
    ENTER: Double,
    ESCAPE: Double,
    HOME: Double,
    LEFT: Double,
    NUMPAD_ADD: Double,
    NUMPAD_DECIMAL: Double,
    NUMPAD_DIVIDE: Double,
    NUMPAD_ENTER: Double,
    NUMPAD_MULTIPLY: Double,
    NUMPAD_SUBTRACT: Double,
    PAGE_DOWN: Double,
    PAGE_UP: Double,
    PERIOD: Double,
    RIGHT: Double,
    SPACE: Double,
    TAB: Double,
    UP: Double
  ): KeyCode = {
    val __obj = js.Dynamic.literal(BACKSPACE = BACKSPACE.asInstanceOf[js.Any], COMMA = COMMA.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], END = END.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], HOME = HOME.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], NUMPAD_ADD = NUMPAD_ADD.asInstanceOf[js.Any], NUMPAD_DECIMAL = NUMPAD_DECIMAL.asInstanceOf[js.Any], NUMPAD_DIVIDE = NUMPAD_DIVIDE.asInstanceOf[js.Any], NUMPAD_ENTER = NUMPAD_ENTER.asInstanceOf[js.Any], NUMPAD_MULTIPLY = NUMPAD_MULTIPLY.asInstanceOf[js.Any], NUMPAD_SUBTRACT = NUMPAD_SUBTRACT.asInstanceOf[js.Any], PAGE_DOWN = PAGE_DOWN.asInstanceOf[js.Any], PAGE_UP = PAGE_UP.asInstanceOf[js.Any], PERIOD = PERIOD.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
  @scala.inline
  implicit class KeyCodeOps[Self <: KeyCode] (val x: Self) extends AnyVal {
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
    def setBACKSPACE(value: Double): Self = this.set("BACKSPACE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMMA(value: Double): Self = this.set("COMMA", value.asInstanceOf[js.Any])
    @scala.inline
    def setDELETE(value: Double): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOWN(value: Double): Self = this.set("DOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEND(value: Double): Self = this.set("END", value.asInstanceOf[js.Any])
    @scala.inline
    def setENTER(value: Double): Self = this.set("ENTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setESCAPE(value: Double): Self = this.set("ESCAPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOME(value: Double): Self = this.set("HOME", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEFT(value: Double): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD_ADD(value: Double): Self = this.set("NUMPAD_ADD", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD_DECIMAL(value: Double): Self = this.set("NUMPAD_DECIMAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD_DIVIDE(value: Double): Self = this.set("NUMPAD_DIVIDE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD_ENTER(value: Double): Self = this.set("NUMPAD_ENTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD_MULTIPLY(value: Double): Self = this.set("NUMPAD_MULTIPLY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD_SUBTRACT(value: Double): Self = this.set("NUMPAD_SUBTRACT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAGE_DOWN(value: Double): Self = this.set("PAGE_DOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAGE_UP(value: Double): Self = this.set("PAGE_UP", value.asInstanceOf[js.Any])
    @scala.inline
    def setPERIOD(value: Double): Self = this.set("PERIOD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIGHT(value: Double): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSPACE(value: Double): Self = this.set("SPACE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAB(value: Double): Self = this.set("TAB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUP(value: Double): Self = this.set("UP", value.asInstanceOf[js.Any])
  }
  
}


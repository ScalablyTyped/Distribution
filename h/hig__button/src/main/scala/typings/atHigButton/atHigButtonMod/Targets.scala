package typings.atHigButton.atHigButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.atHigButton.atHigButtonStrings._blank
import typings.atHigButton.atHigButtonStrings._parent
import typings.atHigButton.atHigButtonStrings._self
import typings.atHigButton.atHigButtonStrings._top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targets extends js.Object {
  var BLANK: _blank
  var PARENT: _parent
  var SELF: _self
  var TOP: _top
}

object Targets {
  @scala.inline
  def apply(BLANK: _blank, PARENT: _parent, SELF: _self, TOP: _top): Targets = {
    val __obj = js.Dynamic.literal(BLANK = BLANK, PARENT = PARENT, SELF = SELF, TOP = TOP)
  
    __obj.asInstanceOf[Targets]
  }
}

@JSImport("@hig/button", "targets")
@js.native
object targets extends TopLevel[Targets]


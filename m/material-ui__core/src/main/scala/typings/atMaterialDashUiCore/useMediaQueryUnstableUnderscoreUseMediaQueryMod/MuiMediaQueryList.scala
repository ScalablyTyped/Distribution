package typings.atMaterialDashUiCore.useMediaQueryUnstableUnderscoreUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiMediaQueryList extends js.Object {
  var matches: Boolean
  def addListener(listener: MuiMediaQueryListListener): Unit
  def removeListener(listener: MuiMediaQueryListListener): Unit
}

object MuiMediaQueryList {
  @scala.inline
  def apply(
    addListener: MuiMediaQueryListListener => Unit,
    matches: Boolean,
    removeListener: MuiMediaQueryListListener => Unit
  ): MuiMediaQueryList = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), matches = matches.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[MuiMediaQueryList]
  }
}


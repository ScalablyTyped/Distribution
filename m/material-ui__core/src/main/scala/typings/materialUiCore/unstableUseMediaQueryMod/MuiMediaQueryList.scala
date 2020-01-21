package typings.materialUiCore.unstableUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiMediaQueryList extends js.Object {
  var matches: Boolean = js.native
  def addListener(listener: MuiMediaQueryListListener): Unit = js.native
  def removeListener(listener: MuiMediaQueryListListener): Unit = js.native
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


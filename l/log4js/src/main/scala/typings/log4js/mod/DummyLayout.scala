package typings.log4js.mod

import typings.log4js.log4jsStrings.dummy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DummyLayout extends Layout {
  var `type`: dummy
}

object DummyLayout {
  @scala.inline
  def apply(`type`: dummy): DummyLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DummyLayout]
  }
}


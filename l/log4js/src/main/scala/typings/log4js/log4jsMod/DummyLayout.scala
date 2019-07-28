package typings.log4js.log4jsMod

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
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DummyLayout]
  }
}


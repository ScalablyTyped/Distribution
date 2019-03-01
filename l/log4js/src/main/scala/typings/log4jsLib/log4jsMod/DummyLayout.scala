package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DummyLayout extends Layout {
  var `type`: log4jsLib.log4jsLibStrings.dummy
}

object DummyLayout {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.dummy): DummyLayout = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[DummyLayout]
  }
}


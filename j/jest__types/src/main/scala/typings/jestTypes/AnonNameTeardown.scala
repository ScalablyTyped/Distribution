package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.teardown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTeardown extends Event {
  var name: teardown
}

object AnonNameTeardown {
  @scala.inline
  def apply(name: teardown): AnonNameTeardown = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameTeardown]
  }
}


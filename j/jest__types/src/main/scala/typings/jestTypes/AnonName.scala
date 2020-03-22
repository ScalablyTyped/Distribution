package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.include_test_location_in_result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends Event {
  var name: include_test_location_in_result
}

object AnonName {
  @scala.inline
  def apply(name: include_test_location_in_result): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}


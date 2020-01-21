package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.run_finish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameRunfinish extends Event {
  var name: run_finish
}

object AnonNameRunfinish {
  @scala.inline
  def apply(name: run_finish): AnonNameRunfinish = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameRunfinish]
  }
}


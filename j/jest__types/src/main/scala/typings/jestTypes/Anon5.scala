package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.teardown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon5 extends Event {
  var name: teardown
}

object Anon5 {
  @scala.inline
  def apply(name: teardown): Anon5 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon5]
  }
}


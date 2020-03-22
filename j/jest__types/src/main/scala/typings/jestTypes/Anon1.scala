package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_todo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends Event {
  var name: test_todo
  var test: TestEntry
}

object Anon1 {
  @scala.inline
  def apply(name: test_todo, test: TestEntry): Anon1 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1]
  }
}


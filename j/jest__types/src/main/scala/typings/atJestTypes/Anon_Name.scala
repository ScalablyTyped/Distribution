package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.test_fn_start
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends Event {
  var name: test_fn_start
  var test: TestEntry
}

object Anon_Name {
  @scala.inline
  def apply(name: test_fn_start, test: TestEntry): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}


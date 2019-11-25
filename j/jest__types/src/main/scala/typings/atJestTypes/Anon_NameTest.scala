package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.test_fn_success
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTest extends Event {
  var name: test_fn_success
  var test: TestEntry
}

object Anon_NameTest {
  @scala.inline
  def apply(name: test_fn_success, test: TestEntry): Anon_NameTest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTest]
  }
}


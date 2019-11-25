package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.test_skip
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTestTestskip extends Event {
  var name: test_skip
  var test: TestEntry
}

object Anon_NameTestTestskip {
  @scala.inline
  def apply(name: test_skip, test: TestEntry): Anon_NameTestTestskip = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTestTestskip]
  }
}


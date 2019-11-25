package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.test_retry
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTestTestretry extends Event {
  var name: test_retry
  var test: TestEntry
}

object Anon_NameTestTestretry {
  @scala.inline
  def apply(name: test_retry, test: TestEntry): Anon_NameTestTestretry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTestTestretry]
  }
}


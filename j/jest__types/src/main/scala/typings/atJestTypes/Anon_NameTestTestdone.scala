package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.test_done
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTestTestdone extends Event {
  var name: test_done
  var test: TestEntry
}

object Anon_NameTestTestdone {
  @scala.inline
  def apply(name: test_done, test: TestEntry): Anon_NameTestTestdone = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTestTestdone]
  }
}


package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.test_todo
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTestTesttodo extends Event {
  var name: test_todo
  var test: TestEntry
}

object Anon_NameTestTesttodo {
  @scala.inline
  def apply(name: test_todo, test: TestEntry): Anon_NameTestTesttodo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTestTesttodo]
  }
}


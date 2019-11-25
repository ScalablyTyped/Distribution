package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.teardown
import typings.atJestTypes.buildCircusMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTeardown extends Event {
  var name: teardown
}

object Anon_NameTeardown {
  @scala.inline
  def apply(name: teardown): Anon_NameTeardown = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTeardown]
  }
}


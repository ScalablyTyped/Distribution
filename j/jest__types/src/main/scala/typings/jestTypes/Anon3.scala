package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.run_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends Event {
  var name: run_start
}

object Anon3 {
  @scala.inline
  def apply(name: run_start): Anon3 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}


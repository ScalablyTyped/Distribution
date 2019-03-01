package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: jestLib.jestMod.jestNs.Milliseconds
  var start: jestLib.jestMod.jestNs.Milliseconds
}

object Anon_End {
  @scala.inline
  def apply(end: jestLib.jestMod.jestNs.Milliseconds, start: jestLib.jestMod.jestNs.Milliseconds): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}


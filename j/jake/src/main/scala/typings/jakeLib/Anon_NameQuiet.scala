package typings
package jakeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameQuiet
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var quiet: scala.Boolean
}

object Anon_NameQuiet {
  @scala.inline
  def apply(
    quiet: scala.Boolean,
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_NameQuiet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("quiet")(quiet)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_NameQuiet]
  }
}


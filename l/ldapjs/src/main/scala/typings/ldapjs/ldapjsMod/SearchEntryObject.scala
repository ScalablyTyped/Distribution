package typings.ldapjs.ldapjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEntryObject
  extends /* p */ StringDictionary[String | js.Array[String]] {
  var controls: js.Array[Control]
  var dn: String
}

object SearchEntryObject {
  @scala.inline
  def apply(
    controls: js.Array[Control],
    dn: String,
    StringDictionary: /* p */ StringDictionary[String | js.Array[String]] = null
  ): SearchEntryObject = {
    val __obj = js.Dynamic.literal(controls = controls, dn = dn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SearchEntryObject]
  }
}


package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEntryObject
  extends /* p */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] {
  var controls: js.Array[Control]
  var dn: java.lang.String
}

object SearchEntryObject {
  @scala.inline
  def apply(
    controls: js.Array[Control],
    dn: java.lang.String,
    StringDictionary: /* p */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null
  ): SearchEntryObject = {
    val __obj = js.Dynamic.literal(controls = controls, dn = dn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SearchEntryObject]
  }
}


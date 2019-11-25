package typings.ldapjs.ldapjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEntryRaw
  extends /* p */ StringDictionary[String | Buffer | js.Array[Buffer]] {
  var controls: js.Array[Control]
  var dn: String
}

object SearchEntryRaw {
  @scala.inline
  def apply(
    controls: js.Array[Control],
    dn: String,
    StringDictionary: /* p */ StringDictionary[String | Buffer | js.Array[Buffer]] = null
  ): SearchEntryRaw = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], dn = dn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SearchEntryRaw]
  }
}


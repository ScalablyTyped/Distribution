package typings.jestValidate

import org.scalablytyped.runtime.StringDictionary
import typings.jestValidate.typesMod.DeprecatedOptions
import typings.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecationEntries extends /* s */ StringDictionary[Options] {
  var deprecationEntries: DeprecatedOptions
}

object AnonDeprecationEntries {
  @scala.inline
  def apply(deprecationEntries: DeprecatedOptions, StringDictionary: /* s */ StringDictionary[Options] = null): AnonDeprecationEntries = {
    val __obj = js.Dynamic.literal(deprecationEntries = deprecationEntries.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDeprecationEntries]
  }
}


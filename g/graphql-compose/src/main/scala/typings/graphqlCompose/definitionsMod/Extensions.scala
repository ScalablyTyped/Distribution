package typings.graphqlCompose.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions
  extends /* key */ StringDictionary[js.Any] {
  var directives: js.UndefOr[js.Array[ExtensionsDirective]] = js.undefined
}

object Extensions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    directives: js.Array[ExtensionsDirective] = null
  ): Extensions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
}


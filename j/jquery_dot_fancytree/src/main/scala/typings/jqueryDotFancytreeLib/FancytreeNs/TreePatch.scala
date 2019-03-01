package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** May be passed to Fancytree#applyPatch. */
trait TreePatch
  extends /* key */ org.scalablytyped.runtime.StringDictionary[NodePatch]

object TreePatch {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[NodePatch] = null): TreePatch = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TreePatch]
  }
}


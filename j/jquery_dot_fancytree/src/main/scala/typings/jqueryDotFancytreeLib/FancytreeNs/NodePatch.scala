package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Data object similar to NodeData, but with additional options.
  * May be passed to FancytreeNode#applyPatch (Every property that is omitted (or set to undefined) will be ignored)  */
trait NodePatch extends js.Object {
  /** (not yet implemented) */
  var appendChildren: js.UndefOr[NodeData] = js.undefined
  /** (not yet implemented) */
  var insertChildren: js.UndefOr[NodeData] = js.undefined
  /** (not yet implemented) */
  var replaceChildren: js.UndefOr[NodeData] = js.undefined
}


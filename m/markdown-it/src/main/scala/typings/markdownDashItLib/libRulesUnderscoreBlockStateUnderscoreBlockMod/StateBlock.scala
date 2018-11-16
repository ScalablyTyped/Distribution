package typings
package markdownDashItLib.libRulesUnderscoreBlockStateUnderscoreBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock
  extends markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.namespaced {
  var bMarks: js.Array[scala.Double] = js.native
  var blkIndent: scala.Double = js.native
  var bsCount: js.Array[scala.Double] = js.native
  var ddIndent: scala.Double = js.native
  var eMarks: js.Array[scala.Double] = js.native
  var line: scala.Double = js.native
  var lineMax: scala.Double = js.native
  /** Used in lists to determine if they interrupt a paragraph */
  var parentType: markdownDashItLib.markdownDashItLibStrings.blockquote | markdownDashItLib.markdownDashItLibStrings.list | markdownDashItLib.markdownDashItLibStrings.root | markdownDashItLib.markdownDashItLibStrings.paragraph | markdownDashItLib.markdownDashItLibStrings.reference = js.native
  var sCount: js.Array[scala.Double] = js.native
  var tShift: js.Array[scala.Double] = js.native
  var tight: scala.Boolean = js.native
}


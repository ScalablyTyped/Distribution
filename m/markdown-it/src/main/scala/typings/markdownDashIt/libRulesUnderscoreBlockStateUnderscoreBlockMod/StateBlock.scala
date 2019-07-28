package typings.markdownDashIt.libRulesUnderscoreBlockStateUnderscoreBlockMod

import typings.markdownDashIt.markdownDashItStrings.blockquote
import typings.markdownDashIt.markdownDashItStrings.list
import typings.markdownDashIt.markdownDashItStrings.paragraph
import typings.markdownDashIt.markdownDashItStrings.reference
import typings.markdownDashIt.markdownDashItStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock
  extends typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ {
  var bMarks: js.Array[Double] = js.native
  var blkIndent: Double = js.native
  var bsCount: js.Array[Double] = js.native
  var ddIndent: Double = js.native
  var eMarks: js.Array[Double] = js.native
  var line: Double = js.native
  var lineMax: Double = js.native
  /** Used in lists to determine if they interrupt a paragraph */
  var parentType: blockquote | list | root | paragraph | reference = js.native
  var sCount: js.Array[Double] = js.native
  var tShift: js.Array[Double] = js.native
  var tight: Boolean = js.native
}


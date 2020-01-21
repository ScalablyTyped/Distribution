package typings.markdownIt.stateBlockMod

import typings.markdownIt.markdownItStrings.blockquote
import typings.markdownIt.markdownItStrings.list
import typings.markdownIt.markdownItStrings.paragraph
import typings.markdownIt.markdownItStrings.reference
import typings.markdownIt.markdownItStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock
  extends typings.markdownIt.stateCoreMod.^ {
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


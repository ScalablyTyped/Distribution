package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Identifier")
@js.native
class Identifier ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind]
     with TextContent {
  def this(text: java.lang.String) = this()
  /* CompleteClass */
  override var text: js.UndefOr[java.lang.String] = js.native
}


package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "OneOfList")
@js.native
class OneOfList protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], ofKeyword: js.UndefOr[scala.Nothing], indented: scala.Boolean) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], ofKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], indented: scala.Boolean) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], ofKeyword: js.UndefOr[scala.Nothing], indented: scala.Boolean, terminals: js.Array[Terminal]) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], ofKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], indented: scala.Boolean, terminals: js.Array[Terminal]) = this()
  val indented: scala.Boolean = js.native
  val ofKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  val terminals: js.UndefOr[js.Array[Terminal]] = js.native
  def update(): OneOfList = js.native
  def update(terminals: js.Array[Terminal]): OneOfList = js.native
}


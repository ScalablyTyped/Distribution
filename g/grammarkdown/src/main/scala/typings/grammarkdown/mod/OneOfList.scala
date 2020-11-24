package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "OneOfList")
@js.native
class OneOfList protected ()
  extends typings.grammarkdown.nodesMod.OneOfList {
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.nodesMod.Token[OfKeyword],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    indented: Boolean,
    terminals: js.Array[typings.grammarkdown.nodesMod.Terminal]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.nodesMod.Token[OfKeyword],
    indented: Boolean,
    terminals: js.Array[typings.grammarkdown.nodesMod.Terminal]
  ) = this()
}

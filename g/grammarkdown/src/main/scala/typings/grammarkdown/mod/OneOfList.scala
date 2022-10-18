package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OneKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "OneOfList")
@js.native
open class OneOfList protected ()
  extends typings.grammarkdown.distNodesMod.OneOfList {
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: Unit,
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: Unit,
    indented: Boolean,
    terminals: js.Array[typings.grammarkdown.distNodesMod.TerminalLiteral]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword],
    indented: Boolean,
    terminals: js.Array[typings.grammarkdown.distNodesMod.TerminalLiteral]
  ) = this()
}

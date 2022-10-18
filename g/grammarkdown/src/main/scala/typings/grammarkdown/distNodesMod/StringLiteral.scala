package typings.grammarkdown.distNodesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "StringLiteral")
@js.native
open class StringLiteral ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.StringLiteral]
     with TextContent
     with _TextContentNode {
  def this(text: String) = this()
}

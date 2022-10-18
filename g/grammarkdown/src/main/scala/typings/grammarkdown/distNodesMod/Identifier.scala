package typings.grammarkdown.distNodesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Identifier")
@js.native
open class Identifier ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.Identifier]
     with TextContent
     with _TextContentNode {
  def this(text: String) = this()
}

package typings.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "Node")
@js.native
open class Node[TKind /* <: typings.grammarkdown.distTokensMod.SyntaxKind */] protected ()
  extends typings.grammarkdown.distNodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

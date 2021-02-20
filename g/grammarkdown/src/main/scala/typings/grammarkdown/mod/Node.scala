package typings.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: typings.grammarkdown.tokensMod.SyntaxKind */] protected ()
  extends typings.grammarkdown.nodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

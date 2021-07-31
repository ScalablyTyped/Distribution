package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** {@docCategory Nodes} */
@JSImport("grammarkdown/dist/grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: SyntaxKind */] protected ()
  extends StObject
     with Node2[TKind] {
  def this(kind: TKind) = this()
  
  /* CompleteClass */
  var end: Double = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
}

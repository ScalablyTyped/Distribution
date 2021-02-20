package typings.grammarkdown.nodesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Parameter")
@js.native
class Parameter protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.Parameter]
     with Declaration {
  def this(name: Identifier) = this()
  
  val name: Identifier = js.native
  
  def update(name: Identifier): Parameter = js.native
}

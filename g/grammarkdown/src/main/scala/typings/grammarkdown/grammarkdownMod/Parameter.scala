package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Parameter")
@js.native
class Parameter protected ()
  extends StObject
     with Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.Parameter] {
  def this(name: Identifier) = this()
  
  /* CompleteClass */
  var end: Double = js.native
  
  val name: Identifier = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
  
  def update(name: Identifier): Parameter = js.native
}

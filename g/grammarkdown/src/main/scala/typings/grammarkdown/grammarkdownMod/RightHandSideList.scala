package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "RightHandSideList")
@js.native
class RightHandSideList ()
  extends StObject
     with Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.RightHandSideList] {
  def this(elements: js.Array[RightHandSide]) = this()
  
  val elements: js.UndefOr[js.Array[RightHandSide]] = js.native
  
  /* CompleteClass */
  var end: Double = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
  
  def update(): RightHandSideList = js.native
  def update(elements: js.Array[RightHandSide]): RightHandSideList = js.native
}

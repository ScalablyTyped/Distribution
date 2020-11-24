package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrientation extends js.Object
@JSImport("jsprintmanager", "JSPM.PrintOrientation")
@js.native
object PrintOrientation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
  
  @js.native
  sealed trait Landscape extends PrintOrientation
  /* 1 */ @js.native
  object Landscape extends TopLevel[Landscape with Double]
  
  @js.native
  sealed trait Portrait extends PrintOrientation
  /* 0 */ @js.native
  object Portrait extends TopLevel[Portrait with Double]
}

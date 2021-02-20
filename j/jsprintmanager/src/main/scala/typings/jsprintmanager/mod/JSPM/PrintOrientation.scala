package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrientation extends StObject
@JSImport("jsprintmanager", "JSPM.PrintOrientation")
@js.native
object PrintOrientation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
  
  @js.native
  sealed trait Landscape extends PrintOrientation
  /* 1 */ val Landscape: typings.jsprintmanager.mod.JSPM.PrintOrientation.Landscape with Double = js.native
  
  @js.native
  sealed trait Portrait extends PrintOrientation
  /* 0 */ val Portrait: typings.jsprintmanager.mod.JSPM.PrintOrientation.Portrait with Double = js.native
}

package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrientation extends StObject
@JSImport("jsprintmanager", "JSPM.PrintOrientation")
@js.native
object PrintOrientation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation & Double] = js.native
  
  @js.native
  sealed trait Landscape
    extends StObject
       with PrintOrientation
  /* 1 */ val Landscape: typings.jsprintmanager.mod.JSPM.PrintOrientation.Landscape & Double = js.native
  
  @js.native
  sealed trait Portrait
    extends StObject
       with PrintOrientation
  /* 0 */ val Portrait: typings.jsprintmanager.mod.JSPM.PrintOrientation.Portrait & Double = js.native
}

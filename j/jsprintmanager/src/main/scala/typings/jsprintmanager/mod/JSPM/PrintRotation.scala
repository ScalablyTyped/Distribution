package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintRotation extends StObject
@JSImport("jsprintmanager", "JSPM.PrintRotation")
@js.native
object PrintRotation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintRotation with Double] = js.native
  
  @js.native
  sealed trait None extends PrintRotation
  /* 3 */ val None: typings.jsprintmanager.mod.JSPM.PrintRotation.None with Double = js.native
  
  @js.native
  sealed trait Rot180 extends PrintRotation
  /* 6 */ val Rot180: typings.jsprintmanager.mod.JSPM.PrintRotation.Rot180 with Double = js.native
  
  @js.native
  sealed trait Rot270 extends PrintRotation
  /* 4 */ val Rot270: typings.jsprintmanager.mod.JSPM.PrintRotation.Rot270 with Double = js.native
  
  @js.native
  sealed trait Rot90 extends PrintRotation
  /* 5 */ val Rot90: typings.jsprintmanager.mod.JSPM.PrintRotation.Rot90 with Double = js.native
}

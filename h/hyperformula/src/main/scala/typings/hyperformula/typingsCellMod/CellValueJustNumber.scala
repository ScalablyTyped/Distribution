package typings.hyperformula.typingsCellMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellValueJustNumber
  extends StObject
     with CellValueType
@JSImport("hyperformula/typings/Cell", "CellValueJustNumber")
@js.native
object CellValueJustNumber extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CellValueJustNumber & String] = js.native
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with CellValueJustNumber
  /* "NUMBER" */ val NUMBER: typings.hyperformula.typingsCellMod.CellValueJustNumber.NUMBER & String = js.native
}

package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAlignment extends StObject
@JSImport("jsprintmanager", "JSPM.TextAlignment")
@js.native
object TextAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment & Double] = js.native
  
  @js.native
  sealed trait Center
    extends StObject
       with TextAlignment
  /* 1 */ val Center: typings.jsprintmanager.mod.JSPM.TextAlignment.Center & Double = js.native
  
  @js.native
  sealed trait Justify
    extends StObject
       with TextAlignment
  /* 3 */ val Justify: typings.jsprintmanager.mod.JSPM.TextAlignment.Justify & Double = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with TextAlignment
  /* 0 */ val Left: typings.jsprintmanager.mod.JSPM.TextAlignment.Left & Double = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with TextAlignment
  /* 2 */ val Right: typings.jsprintmanager.mod.JSPM.TextAlignment.Right & Double = js.native
}

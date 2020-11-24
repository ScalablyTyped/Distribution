package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAlignment extends js.Object
@JSImport("jsprintmanager", "JSPM.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
  
  @js.native
  sealed trait Center extends TextAlignment
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  @js.native
  sealed trait Justify extends TextAlignment
  /* 3 */ @js.native
  object Justify extends TopLevel[Justify with Double]
  
  @js.native
  sealed trait Left extends TextAlignment
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  @js.native
  sealed trait Right extends TextAlignment
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
}

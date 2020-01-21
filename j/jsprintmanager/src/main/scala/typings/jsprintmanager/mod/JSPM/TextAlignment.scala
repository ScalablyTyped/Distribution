package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSImport("jsprintmanager", "JSPM.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  @js.native
  sealed trait Center extends TextAlignment
  
  @js.native
  sealed trait Justify extends TextAlignment
  
  @js.native
  sealed trait Left extends TextAlignment
  
  @js.native
  sealed trait Right extends TextAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 3 */ @js.native
  object Justify extends TopLevel[Justify with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}


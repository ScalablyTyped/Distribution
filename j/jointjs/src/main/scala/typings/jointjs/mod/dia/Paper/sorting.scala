package typings.jointjs.mod.dia.Paper

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait sorting extends js.Object

@JSImport("jointjs", "dia.Paper.sorting")
@js.native
object sorting extends js.Object {
  @js.native
  sealed trait APPROX extends sorting
  
  @js.native
  sealed trait EXACT extends sorting
  
  @js.native
  sealed trait NONE extends sorting
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[sorting with String] = js.native
  /* "sorting-approximate" */ @js.native
  object APPROX extends TopLevel[APPROX with String]
  
  /* "sorting-exact" */ @js.native
  object EXACT extends TopLevel[EXACT with String]
  
  /* "sorting-none" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
}


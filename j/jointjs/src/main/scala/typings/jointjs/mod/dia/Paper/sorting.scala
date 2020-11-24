package typings.jointjs.mod.dia.Paper

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait sorting extends js.Object
@JSImport("jointjs", "dia.Paper.sorting")
@js.native
object sorting extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[sorting with String] = js.native
  
  @js.native
  sealed trait APPROX extends sorting
  /* "sorting-approximate" */ @js.native
  object APPROX extends TopLevel[APPROX with String]
  
  @js.native
  sealed trait EXACT extends sorting
  /* "sorting-exact" */ @js.native
  object EXACT extends TopLevel[EXACT with String]
  
  @js.native
  sealed trait NONE extends sorting
  /* "sorting-none" */ @js.native
  object NONE extends TopLevel[NONE with String]
}

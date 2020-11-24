package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitFormat extends js.Object
@JSImport("grammarkdown/dist/grammarkdown", "EmitFormat")
@js.native
object EmitFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFormat with Double] = js.native
  
  @js.native
  sealed trait ecmarkup extends EmitFormat
  /* 2 */ @js.native
  object ecmarkup extends TopLevel[ecmarkup with Double]
  
  @js.native
  sealed trait html extends EmitFormat
  /* 1 */ @js.native
  object html extends TopLevel[html with Double]
  
  @js.native
  sealed trait markdown extends EmitFormat
  /* 0 */ @js.native
  object markdown extends TopLevel[markdown with Double]
}

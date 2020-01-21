package typings.grammarkdown.optionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitFormat extends js.Object

@JSImport("grammarkdown/dist/options", "EmitFormat")
@js.native
object EmitFormat extends js.Object {
  @js.native
  sealed trait ecmarkup extends EmitFormat
  
  @js.native
  sealed trait html extends EmitFormat
  
  @js.native
  sealed trait markdown extends EmitFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFormat with Double] = js.native
  /* 2 */ @js.native
  object ecmarkup extends TopLevel[ecmarkup with Double]
  
  /* 1 */ @js.native
  object html extends TopLevel[html with Double]
  
  /* 0 */ @js.native
  object markdown extends TopLevel[markdown with Double]
  
}


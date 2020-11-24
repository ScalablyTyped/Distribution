package typings.grammarkdown.optionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitFormat extends js.Object
@JSImport("grammarkdown/dist/options", "EmitFormat")
@js.native
object EmitFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFormat with Double] = js.native
  
  /**
    * Output should be emitted in ECMArkup format.
    */
  @js.native
  sealed trait ecmarkup extends EmitFormat
  /* 2 */ @js.native
  object ecmarkup extends TopLevel[ecmarkup with Double]
  
  /**
    * Output should be emitted in HTML format.
    */
  @js.native
  sealed trait html extends EmitFormat
  /* 1 */ @js.native
  object html extends TopLevel[html with Double]
  
  /**
    * Output should be emitted in Markdown format.
    */
  @js.native
  sealed trait markdown extends EmitFormat
  /* 0 */ @js.native
  object markdown extends TopLevel[markdown with Double]
}

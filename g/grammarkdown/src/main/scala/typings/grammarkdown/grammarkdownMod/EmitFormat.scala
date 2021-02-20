package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitFormat extends StObject
@JSImport("grammarkdown/dist/grammarkdown", "EmitFormat")
@js.native
object EmitFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFormat with Double] = js.native
  
  @js.native
  sealed trait ecmarkup extends EmitFormat
  /* 2 */ val ecmarkup: typings.grammarkdown.grammarkdownMod.EmitFormat.ecmarkup with Double = js.native
  
  @js.native
  sealed trait html extends EmitFormat
  /* 1 */ val html: typings.grammarkdown.grammarkdownMod.EmitFormat.html with Double = js.native
  
  @js.native
  sealed trait markdown extends EmitFormat
  /* 0 */ val markdown: typings.grammarkdown.grammarkdownMod.EmitFormat.markdown with Double = js.native
}

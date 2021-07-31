package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitFormat extends StObject
@JSImport("grammarkdown/dist/grammarkdown", "EmitFormat")
@js.native
object EmitFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFormat & Double] = js.native
  
  @js.native
  sealed trait ecmarkup
    extends StObject
       with EmitFormat
  /* 2 */ val ecmarkup: typings.grammarkdown.grammarkdownMod.EmitFormat.ecmarkup & Double = js.native
  
  @js.native
  sealed trait html
    extends StObject
       with EmitFormat
  /* 1 */ val html: typings.grammarkdown.grammarkdownMod.EmitFormat.html & Double = js.native
  
  @js.native
  sealed trait markdown
    extends StObject
       with EmitFormat
  /* 0 */ val markdown: typings.grammarkdown.grammarkdownMod.EmitFormat.markdown & Double = js.native
}

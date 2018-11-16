package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitFormat extends js.Object

@JSImport("grammarkdown/dist/options", "EmitFormat")
@js.native
object EmitFormat extends js.Object {
  @js.native
  sealed trait ecmarkup
    extends grammarkdownLib.distOptionsMod.EmitFormat
  
  @js.native
  sealed trait html
    extends grammarkdownLib.distOptionsMod.EmitFormat
  
  @js.native
  sealed trait markdown
    extends grammarkdownLib.distOptionsMod.EmitFormat
  
  /* 2 */ val ecmarkup: ecmarkup with scala.Double = js.native
  /* 1 */ val html: html with scala.Double = js.native
  /* 0 */ val markdown: markdown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grammarkdownLib.distOptionsMod.EmitFormat with scala.Double] = js.native
}


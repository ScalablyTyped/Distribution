package typings.lunr.mod.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait wildcard extends js.Object

@JSImport("lunr", "Query.wildcard")
@js.native
object wildcard extends js.Object {
  @js.native
  sealed trait LEADING extends wildcard
  
  @js.native
  sealed trait NONE extends wildcard
  
  @js.native
  sealed trait TRAILING extends wildcard
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[wildcard with Double] = js.native
  /* 1 << 0 */ @js.native
  object LEADING extends TopLevel[LEADING with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 << 1 */ @js.native
  object TRAILING extends TopLevel[TRAILING with Double]
  
}


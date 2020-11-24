package typings.lunr.mod.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait wildcard extends js.Object
@JSImport("lunr", "Query.wildcard")
@js.native
object wildcard extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[wildcard with Double] = js.native
  
  @js.native
  sealed trait LEADING extends wildcard
  /* 1 << 0 */ @js.native
  object LEADING extends TopLevel[LEADING with Double]
  
  @js.native
  sealed trait NONE extends wildcard
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait TRAILING extends wildcard
  /* 1 << 1 */ @js.native
  object TRAILING extends TopLevel[TRAILING with Double]
}

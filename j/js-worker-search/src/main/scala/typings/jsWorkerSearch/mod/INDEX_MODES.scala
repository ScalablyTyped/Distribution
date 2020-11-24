package typings.jsWorkerSearch.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait INDEX_MODES extends js.Object
@JSImport("js-worker-search", "INDEX_MODES")
@js.native
object INDEX_MODES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[INDEX_MODES with String] = js.native
  
  @js.native
  sealed trait ALL_SUBSTRINGS extends INDEX_MODES
  /* "ALL_SUBSTRINGS" */ @js.native
  object ALL_SUBSTRINGS extends TopLevel[ALL_SUBSTRINGS with String]
  
  @js.native
  sealed trait EXACT_WORDS extends INDEX_MODES
  /* "EXACT_WORDS" */ @js.native
  object EXACT_WORDS extends TopLevel[EXACT_WORDS with String]
  
  @js.native
  sealed trait PREFIXES extends INDEX_MODES
  /* "PREFIXES" */ @js.native
  object PREFIXES extends TopLevel[PREFIXES with String]
}

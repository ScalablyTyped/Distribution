package typings.jsWorkerSearch.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait INDEX_MODES extends js.Object

@JSImport("js-worker-search", "INDEX_MODES")
@js.native
object INDEX_MODES extends js.Object {
  @js.native
  sealed trait ALL_SUBSTRINGS extends INDEX_MODES
  
  @js.native
  sealed trait EXACT_WORDS extends INDEX_MODES
  
  @js.native
  sealed trait PREFIXES extends INDEX_MODES
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[INDEX_MODES with String] = js.native
  /* "ALL_SUBSTRINGS" */ @js.native
  object ALL_SUBSTRINGS extends TopLevel[ALL_SUBSTRINGS with String]
  
  /* "EXACT_WORDS" */ @js.native
  object EXACT_WORDS extends TopLevel[EXACT_WORDS with String]
  
  /* "PREFIXES" */ @js.native
  object PREFIXES extends TopLevel[PREFIXES with String]
  
}


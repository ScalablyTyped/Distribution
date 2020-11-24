package typings.htmlValidator.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationResultsOutputFormats extends js.Object
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationResultsOutputFormats")
@js.native
object ValidationResultsOutputFormats extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationResultsOutputFormats with String] = js.native
  
  @js.native
  sealed trait gnu extends ValidationResultsOutputFormats
  /* "gnu" */ @js.native
  object gnu extends TopLevel[gnu with String]
  
  @js.native
  sealed trait html extends ValidationResultsOutputFormats
  /* "html" */ @js.native
  object html extends TopLevel[html with String]
  
  @js.native
  sealed trait json extends ValidationResultsOutputFormats
  /* "json" */ @js.native
  object json extends TopLevel[json with String]
  
  @js.native
  sealed trait text extends ValidationResultsOutputFormats
  /* "text" */ @js.native
  object text extends TopLevel[text with String]
  
  @js.native
  sealed trait xhtml extends ValidationResultsOutputFormats
  /* "xhtml" */ @js.native
  object xhtml extends TopLevel[xhtml with String]
  
  @js.native
  sealed trait xml extends ValidationResultsOutputFormats
  /* "xml" */ @js.native
  object xml extends TopLevel[xml with String]
}

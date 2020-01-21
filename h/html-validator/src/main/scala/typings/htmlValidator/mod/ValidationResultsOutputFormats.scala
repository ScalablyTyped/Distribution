package typings.htmlValidator.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationResultsOutputFormats extends js.Object

// Could be used to avoid string literals
@JSImport("html-validator", "ValidationResultsOutputFormats")
@js.native
object ValidationResultsOutputFormats extends js.Object {
  @js.native
  sealed trait gnu extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait html extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait json extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait text extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait xhtml extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait xml extends ValidationResultsOutputFormats
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationResultsOutputFormats with String] = js.native
  /* "gnu" */ @js.native
  object gnu extends TopLevel[gnu with String]
  
  /* "html" */ @js.native
  object html extends TopLevel[html with String]
  
  /* "json" */ @js.native
  object json extends TopLevel[json with String]
  
  /* "text" */ @js.native
  object text extends TopLevel[text with String]
  
  /* "xhtml" */ @js.native
  object xhtml extends TopLevel[xhtml with String]
  
  /* "xml" */ @js.native
  object xml extends TopLevel[xml with String]
  
}


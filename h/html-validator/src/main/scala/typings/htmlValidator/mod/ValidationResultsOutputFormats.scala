package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationResultsOutputFormats extends StObject
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationResultsOutputFormats")
@js.native
object ValidationResultsOutputFormats extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationResultsOutputFormats with String] = js.native
  
  @js.native
  sealed trait gnu extends ValidationResultsOutputFormats
  /* "gnu" */ val gnu: typings.htmlValidator.mod.ValidationResultsOutputFormats.gnu with String = js.native
  
  @js.native
  sealed trait html extends ValidationResultsOutputFormats
  /* "html" */ val html: typings.htmlValidator.mod.ValidationResultsOutputFormats.html with String = js.native
  
  @js.native
  sealed trait json extends ValidationResultsOutputFormats
  /* "json" */ val json: typings.htmlValidator.mod.ValidationResultsOutputFormats.json with String = js.native
  
  @js.native
  sealed trait text extends ValidationResultsOutputFormats
  /* "text" */ val text: typings.htmlValidator.mod.ValidationResultsOutputFormats.text with String = js.native
  
  @js.native
  sealed trait xhtml extends ValidationResultsOutputFormats
  /* "xhtml" */ val xhtml: typings.htmlValidator.mod.ValidationResultsOutputFormats.xhtml with String = js.native
  
  @js.native
  sealed trait xml extends ValidationResultsOutputFormats
  /* "xml" */ val xml: typings.htmlValidator.mod.ValidationResultsOutputFormats.xml with String = js.native
}

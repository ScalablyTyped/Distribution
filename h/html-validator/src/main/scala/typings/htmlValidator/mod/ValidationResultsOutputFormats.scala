package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationResultsOutputFormats extends StObject
// Could be used to avoid string literals
@JSImport("html-validator", "ValidationResultsOutputFormats")
@js.native
object ValidationResultsOutputFormats extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationResultsOutputFormats & String] = js.native
  
  @js.native
  sealed trait gnu
    extends StObject
       with ValidationResultsOutputFormats
  /* "gnu" */ val gnu: typings.htmlValidator.mod.ValidationResultsOutputFormats.gnu & String = js.native
  
  @js.native
  sealed trait html
    extends StObject
       with ValidationResultsOutputFormats
  /* "html" */ val html: typings.htmlValidator.mod.ValidationResultsOutputFormats.html & String = js.native
  
  @js.native
  sealed trait json
    extends StObject
       with ValidationResultsOutputFormats
  /* "json" */ val json: typings.htmlValidator.mod.ValidationResultsOutputFormats.json & String = js.native
  
  @js.native
  sealed trait text
    extends StObject
       with ValidationResultsOutputFormats
  /* "text" */ val text: typings.htmlValidator.mod.ValidationResultsOutputFormats.text & String = js.native
  
  @js.native
  sealed trait xhtml
    extends StObject
       with ValidationResultsOutputFormats
  /* "xhtml" */ val xhtml: typings.htmlValidator.mod.ValidationResultsOutputFormats.xhtml & String = js.native
  
  @js.native
  sealed trait xml
    extends StObject
       with ValidationResultsOutputFormats
  /* "xml" */ val xml: typings.htmlValidator.mod.ValidationResultsOutputFormats.xml & String = js.native
}

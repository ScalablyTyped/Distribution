package typings.lowlight

import typings.lowlight.lowlight.HighlightAutoOptions
import typings.lowlight.lowlight.HighlightAutoResult
import typings.lowlight.lowlight.HighlightOptions
import typings.lowlight.lowlight.HighlightResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lowlight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def highlight(language: String, value: String): HighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(language.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[HighlightResult]
  inline def highlight(language: String, value: String, options: HighlightOptions): HighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(language.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HighlightResult]
  
  inline def highlightAuto(value: String): HighlightAutoResult = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAuto")(value.asInstanceOf[js.Any]).asInstanceOf[HighlightAutoResult]
  inline def highlightAuto(value: String, options: HighlightAutoOptions): HighlightAutoResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAuto")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HighlightAutoResult]
  
  inline def registerLanguage(name: String, syntax: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], syntax.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

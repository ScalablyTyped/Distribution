package typings.i18next.mod

import typings.i18next.i18nextStrings.postProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostProcessorModule
  extends StObject
     with Module {
  
  /** Unique name */
  var name: String = js.native
  
  def process(value: String, key: String, options: TOptions[StringMap], translator: Any): String = js.native
  def process(value: String, key: js.Array[String], options: TOptions[StringMap], translator: Any): String = js.native
  
  @JSName("type")
  var type_PostProcessorModule: postProcessor = js.native
}

package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomHelpers[V] extends StObject {
  
  def error(code: String): ErrorReport = js.native
  def error(code: String, local: Context): ErrorReport = js.native
  
  def message(messages: LanguageMessages): ErrorReport = js.native
  def message(messages: LanguageMessages, local: Context): ErrorReport = js.native
  
  var original: V = js.native
  
  var prefs: ValidationOptions = js.native
  
  var schema: ExtensionBoundSchema = js.native
  
  var state: State = js.native
  
  def warn(code: String): Unit = js.native
  def warn(code: String, local: Context): Unit = js.native
}

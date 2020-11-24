package typings.humanizeDuration.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Humanizer_ extends js.Object {
  
  def apply(ms: Double): String = js.native
  def apply(ms: Double, options: Options): String = js.native
  
  var languages: StringDictionary[UnitTranslationOptions] = js.native
}

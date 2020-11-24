package typings.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("humanize-duration", "getSupportedLanguages")
@js.native
object getSupportedLanguages extends js.Object {
  
  /**
    * This function won't return any new languages you define; it will only return the defaults supported by the library.
    */
  def apply(): js.Array[LanguageCode] = js.native
}

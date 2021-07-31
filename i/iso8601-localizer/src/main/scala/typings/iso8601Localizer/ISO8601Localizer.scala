package typings.iso8601Localizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISO8601Localizer
  extends StObject
     with localizer
object ISO8601Localizer {
  
  @scala.inline
  def apply(localize: () => String, returnAs: String => localizer, to: Double => localizer): ISO8601Localizer = {
    val __obj = js.Dynamic.literal(localize = js.Any.fromFunction0(localize), returnAs = js.Any.fromFunction1(returnAs), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[ISO8601Localizer]
  }
}

package typings.intlifyCoreBase.mod

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreContext[Message, Messages, DateTimeFormats, NumberFormats, ResourceLocales, Locales]
  extends StObject
     with CoreCommonContext[Message, Locales]
     with CoreTranslationContext[NonNullable[Messages], Message]
     with CoreDateTimeContext[NonNullable[DateTimeFormats]]
     with CoreNumberContext[NonNullable[NumberFormats]] {
  
  var fallbackContext: js.UndefOr[
    CoreContext[Message, Messages, DateTimeFormats, NumberFormats, ResourceLocales, Locales]
  ] = js.native
}

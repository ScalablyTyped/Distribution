package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreMissingHandler[Message] extends StObject {
  
  def apply(
    context: CoreContext[
      Message, 
      js.Object, 
      js.Object, 
      js.Object, 
      PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
  {} */ String], 
      (PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
  {} */ String]) | Locale
    ],
    locale: Locale,
    key: Path,
    `type`: CoreMissingType,
    values: Any*
  ): String | Unit = js.native
}

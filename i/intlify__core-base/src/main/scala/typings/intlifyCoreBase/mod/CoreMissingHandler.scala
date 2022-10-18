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
      /* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
  {}, keyof / * Inlined std.NonNullable<{}> * /
  {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
  {}, keyof / * Inlined std.NonNullable<{}> * /
  {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
  {}, keyof / * Inlined std.NonNullable<{}> * /
  {}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
  {}, keyof / * Inlined std.NonNullable<{}> * /
  {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
  {}, keyof / * Inlined std.NonNullable<{}> * /
  {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
  {}, keyof / * Inlined std.NonNullable<{}> * /
  {}> */ js.Any
    ],
    locale: Locale,
    key: Path,
    `type`: CoreMissingType,
    values: Any*
  ): String | Unit = js.native
}

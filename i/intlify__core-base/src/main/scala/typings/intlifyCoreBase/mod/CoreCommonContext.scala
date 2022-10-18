package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreCommonContext[Message, Locales] extends StObject {
  
  var cid: Double = js.native
  
  var fallbackFormat: Boolean = js.native
  
  var fallbackLocale: FallbackLocales[Locales] = js.native
  
  var fallbackWarn: Boolean | js.RegExp = js.native
  
  var locale: Locales = js.native
  
  def localeFallbacker[Message](
    ctx: CoreContext[
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
    fallback: FallbackLocale,
    start: Locale
  ): js.Array[Locale] = js.native
  @JSName("localeFallbacker")
  var localeFallbacker_Original: LocaleFallbacker = js.native
  
  var missing: CoreMissingHandler[Message] | Null = js.native
  
  var missingWarn: Boolean | js.RegExp = js.native
  
  def onWarn(msg: String): Unit = js.native
  def onWarn(msg: String, err: js.Error): Unit = js.native
  
  var unresolving: Boolean = js.native
  
  var version: String = js.native
}

package typings.linguiCore

import typings.linguiCore.i18nMod.CompiledMessage
import typings.linguiCore.i18nMod.Locales
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@lingui/core/cjs/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/core/cjs/context", "UNICODE_REGEX")
  @js.native
  val UNICODE_REGEX: js.RegExp = js.native
  
  inline def interpolate(translation: CompiledMessage, locale: String, locales: Locales, localeData: js.Object): js.Function2[/* values */ js.Object, /* formats */ js.UndefOr[js.Object], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(translation.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], localeData.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* values */ js.Object, /* formats */ js.UndefOr[js.Object], String]]
}

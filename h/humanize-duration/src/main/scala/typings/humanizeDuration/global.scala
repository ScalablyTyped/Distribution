package typings.humanizeDuration

import typings.humanizeDuration.mod.HumanizerOptions
import typings.humanizeDuration.mod.Humanizer_
import typings.humanizeDuration.mod.LanguageCode
import typings.humanizeDuration.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object humanizeDuration {
    
    inline def apply(ms: Double): String = ^.asInstanceOf[js.Dynamic].apply(ms.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(ms: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(ms.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("humanizeDuration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This function won't return any new languages you define; it will only return the defaults supported by the library.
      */
    inline def getSupportedLanguages(): js.Array[LanguageCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedLanguages")().asInstanceOf[js.Array[LanguageCode]]
    
    inline def humanizer(): Humanizer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("humanizer")().asInstanceOf[Humanizer_]
    inline def humanizer(options: HumanizerOptions): Humanizer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("humanizer")(options.asInstanceOf[js.Any]).asInstanceOf[Humanizer_]
  }
}

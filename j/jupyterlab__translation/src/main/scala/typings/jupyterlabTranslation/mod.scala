package typings.jupyterlabTranslation

import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabTranslation.libBaseMod.NullTranslator_
import typings.luminoCoreutils.mod.Token
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/translation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/translation", "ITranslator")
  @js.native
  val ITranslator: Token[typings.jupyterlabTranslation.libTokensMod.ITranslator] = js.native
  
  @JSImport("@jupyterlab/translation", "ITranslatorConnector")
  @js.native
  val ITranslatorConnector: Token[typings.jupyterlabTranslation.libTokensMod.ITranslatorConnector] = js.native
  
  @JSImport("@jupyterlab/translation", "TranslationManager")
  @js.native
  open class TranslationManager ()
    extends typings.jupyterlabTranslation.libManagerMod.TranslationManager {
    def this(translationsUrl: String) = this()
    def this(translationsUrl: String, stringsPrefix: String) = this()
    def this(translationsUrl: Unit, stringsPrefix: String) = this()
    def this(translationsUrl: String, stringsPrefix: String, serverSettings: ISettings) = this()
    def this(translationsUrl: String, stringsPrefix: Unit, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, stringsPrefix: String, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, stringsPrefix: Unit, serverSettings: ISettings) = this()
  }
  
  @JSImport("@jupyterlab/translation", "TranslatorConnector")
  @js.native
  open class TranslatorConnector ()
    extends typings.jupyterlabTranslation.libTokensMod.TranslatorConnector {
    def this(translationsUrl: String) = this()
    def this(translationsUrl: String, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, serverSettings: ISettings) = this()
  }
  
  @JSImport("@jupyterlab/translation", "nullTranslator")
  @js.native
  val nullTranslator: NullTranslator_ = js.native
  
  inline def requestTranslationsAPI[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")().asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: Unit, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: Unit, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: Unit, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: Unit, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: Unit, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: Unit, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}

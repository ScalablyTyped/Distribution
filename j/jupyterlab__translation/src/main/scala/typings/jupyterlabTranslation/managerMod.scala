package typings.jupyterlabTranslation

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabTranslation.tokensMod.ITranslator
import typings.jupyterlabTranslation.tokensMod.TranslationBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerMod {
  
  @JSImport("@jupyterlab/translation/lib/manager", "TranslationManager")
  @js.native
  open class TranslationManager ()
    extends StObject
       with ITranslator {
    def this(translationsUrl: String) = this()
    def this(translationsUrl: String, stringsPrefix: String) = this()
    def this(translationsUrl: Unit, stringsPrefix: String) = this()
    def this(translationsUrl: String, stringsPrefix: String, serverSettings: ISettings) = this()
    def this(translationsUrl: String, stringsPrefix: Unit, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, stringsPrefix: String, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, stringsPrefix: Unit, serverSettings: ISettings) = this()
    
    /* private */ var _connector: Any = js.native
    
    /* private */ var _currentLocale: Any = js.native
    
    /* private */ var _domainData: Any = js.native
    
    /* private */ var _englishBundle: Any = js.native
    
    /* private */ var _languageData: Any = js.native
    
    /* private */ var _stringsPrefix: Any = js.native
    
    /* private */ var _translationBundles: Any = js.native
    
    /**
      * Fetch the localization data from the server.
      *
      * @param locale The language locale to use for translations.
      */
    def fetch(locale: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def load(domain: String): TranslationBundle = js.native
  }
}

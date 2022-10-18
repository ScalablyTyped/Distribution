package typings.jupyterlabTranslation

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typings.jupyterlabStatedb.mod.DataConnector
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  trait ITranslator extends StObject {
    
    def load(domain: String): TranslationBundle
  }
  object ITranslator {
    
    @JSImport("@jupyterlab/translation/lib/tokens", "ITranslator")
    @js.native
    val ^ : Token[ITranslator] = js.native
    
    extension [Self <: ITranslator](x: Self) {
      
      inline def setLoad(value: String => TranslationBundle): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("@jupyterlab/translation/lib/tokens", "ITranslatorConnector")
  @js.native
  val ITranslatorConnector: Token[typings.jupyterlabTranslation.libTokensMod.ITranslatorConnector] = js.native
  type ITranslatorConnector = IDataConnector[Language, Language, typings.jupyterlabTranslation.anon.Language, String]
  
  @JSImport("@jupyterlab/translation/lib/tokens", "TranslatorConnector")
  @js.native
  open class TranslatorConnector ()
    extends DataConnector[Language, Language, typings.jupyterlabTranslation.anon.Language, String] {
    def this(translationsUrl: String) = this()
    def this(translationsUrl: String, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, serverSettings: ISettings) = this()
    
    /* private */ var _serverSettings: Any = js.native
    
    /* private */ var _translationsUrl: Any = js.native
  }
  
  type Language = StringDictionary[String]
  
  trait TranslationBundle extends StObject {
    
    /**
      * Alias for `gettext` (translate strings without number inflection)
      * @param msgid message (text to translate)
      * @param args
      */
    def __(msgid: String, args: Any*): String
    
    /**
      * Alias for `ngettext` (translate accounting for plural forms)
      * @param msgid message for singular
      * @param msgid_plural message for plural
      * @param n determines which plural form to use
      * @param args
      */
    def _n(msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    /**
      * Alias for `npgettext` (translate accounting for plural forms in given context)
      * @param msgctxt context
      * @param msgid message for singular
      * @param msgid_plural message for plural
      * @param n number used to determine which plural form to use
      * @param args
      */
    def _np(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    /**
      * Alias for `pgettext` (translate in given context)
      * @param msgctxt context
      * @param msgid message (text to translate)
      * @param args
      */
    def _p(msgctxt: String, msgid: String, args: Any*): String
    
    def dcnpgettext(domain: String, msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    def gettext(msgid: String, args: Any*): String
    
    def ngettext(msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    def npgettext(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    def pgettext(msgctxt: String, msgid: String, args: Any*): String
  }
  object TranslationBundle {
    
    inline def apply(
      __ : (String, /* repeated */ Any) => String,
      _n: (String, String, Double, /* repeated */ Any) => String,
      _np: (String, String, String, Double, /* repeated */ Any) => String,
      _p: (String, String, /* repeated */ Any) => String,
      dcnpgettext: (String, String, String, String, Double, /* repeated */ Any) => String,
      gettext: (String, /* repeated */ Any) => String,
      ngettext: (String, String, Double, /* repeated */ Any) => String,
      npgettext: (String, String, String, Double, /* repeated */ Any) => String,
      pgettext: (String, String, /* repeated */ Any) => String
    ): TranslationBundle = {
      val __obj = js.Dynamic.literal(__ = js.Any.fromFunction2(__), _n = js.Any.fromFunction4(_n), _np = js.Any.fromFunction5(_np), _p = js.Any.fromFunction3(_p), dcnpgettext = js.Any.fromFunction6(dcnpgettext), gettext = js.Any.fromFunction2(gettext), ngettext = js.Any.fromFunction4(ngettext), npgettext = js.Any.fromFunction5(npgettext), pgettext = js.Any.fromFunction3(pgettext))
      __obj.asInstanceOf[TranslationBundle]
    }
    
    extension [Self <: TranslationBundle](x: Self) {
      
      inline def setDcnpgettext(value: (String, String, String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "dcnpgettext", js.Any.fromFunction6(value))
      
      inline def setGettext(value: (String, /* repeated */ Any) => String): Self = StObject.set(x, "gettext", js.Any.fromFunction2(value))
      
      inline def setNgettext(value: (String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "ngettext", js.Any.fromFunction4(value))
      
      inline def setNpgettext(value: (String, String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "npgettext", js.Any.fromFunction5(value))
      
      inline def setPgettext(value: (String, String, /* repeated */ Any) => String): Self = StObject.set(x, "pgettext", js.Any.fromFunction3(value))
      
      inline def set__(value: (String, /* repeated */ Any) => String): Self = StObject.set(x, "__", js.Any.fromFunction2(value))
      
      inline def set_n(value: (String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "_n", js.Any.fromFunction4(value))
      
      inline def set_np(value: (String, String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "_np", js.Any.fromFunction5(value))
      
      inline def set_p(value: (String, String, /* repeated */ Any) => String): Self = StObject.set(x, "_p", js.Any.fromFunction3(value))
    }
  }
}

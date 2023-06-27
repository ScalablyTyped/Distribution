package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bundle of gettext-based translation functions for a specific domain.
  */
trait TranslationBundle extends StObject {
  
  /**
    * Alias for `gettext` (translate strings without number inflection)
    * @param msgid message (text to translate)
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
  def __(msgid: String, args: Any*): String
  
  /**
    * Alias for `ngettext` (translate accounting for plural forms)
    * @param msgid message for singular
    * @param msgid_plural message for plural
    * @param n determines which plural form to use
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
  def _n(msgid: String, msgid_plural: String, n: Double, args: Any*): String
  
  /**
    * Alias for `npgettext` (translate accounting for plural forms in given context)
    * @param msgctxt context
    * @param msgid message for singular
    * @param msgid_plural message for plural
    * @param n number used to determine which plural form to use
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
  def _np(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
  
  /**
    * Alias for `pgettext` (translate in given context)
    * @param msgctxt context
    * @param msgid message (text to translate)
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
  def _p(msgctxt: String, msgid: String, args: Any*): String
  
  /**
    * Do a plural-forms lookup of a message id. msgid is used as the message id for
    * purposes of lookup in the catalog, while n is used to determine which plural
    * form to use. Otherwise, when n is 1 msgid is returned, and msgid_plural is
    * returned in all other cases.
    *
    * @param domain - The translations domain.
    * @param msgctxt - The message context.
    * @param msgid - The singular string to translate.
    * @param msgid_plural - The plural string to translate.
    * @param n - The number for pluralization.
    * @param args - Any additional values to use with interpolation
    *
    * @returns A translated string if found, or the original string.
    */
  def dcnpgettext(domain: String, msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
  
  /**
    * Look up the message id in the catalog and return the corresponding message string.
    * Otherwise, the message id is returned.
    *
    * @param msgid message (text to translate)
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
  def gettext(msgid: String, args: Any*): String
  
  /**
    * Do a plural-forms lookup of a message id. msgid is used as the message id for
    * purposes of lookup in the catalog, while n is used to determine which plural form
    * to use. Otherwise, when n is 1 msgid is returned, and msgid_plural is returned in
    * all other cases.
    *
    * @param msgid message for singular
    * @param msgid_plural message for plural
    * @param n determines which plural form to use
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
  def ngettext(msgid: String, msgid_plural: String, n: Double, args: Any*): String
  
  /**
    * Do a plural-forms lookup of a message id. msgid is used as the message id for
    * purposes of lookup in the catalog, while n is used to determine which plural
    * form to use. Otherwise, when n is 1 msgid is returned, and msgid_plural is
    * returned in all other cases.
    *
    * @param msgctxt context
    * @param msgid message for singular
    * @param msgid_plural message for plural
    * @param n number used to determine which plural form to use
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
  def npgettext(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
  
  /**
    * Look up the context and message id in the catalog and return the corresponding
    * message string. Otherwise, the message id is returned.
    *
    * @param msgctxt context
    * @param msgid message (text to translate)
    * @param args
    *
    * @returns A translated string if found, or the original string.
    */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslationBundle] (val x: Self) extends AnyVal {
    
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

package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextStrings.fallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactOptions extends StObject {
  
  /**
    * Set which events trigger a re-render, can be set to false or string of events
    * @default 'languageChanged'
    */
  var bindI18n: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * Set which events on store trigger a re-render, can be set to false or string of events
    * @default ''
    */
  var bindI18nStore: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * Set it to the default parent element created by the Trans component.
    * @default 'div'
    */
  var defaultTransParent: js.UndefOr[String] = js.undefined
  
  /**
    * Function to generate an i18nKey from the defaultValue (or Trans children)
    * when no key is provided.
    * By default, the defaultValue (Trans text) itself is used as the key.
    * If you want to require keys for all translations, supply a function
    * that always throws an error.
    * @default undefined
    */
  var hashTransKey: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Any], js.UndefOr[Any]]] = js.undefined
  
  /**
    * Optional keyPrefix that will be automatically applied to returned t function in useTranslation for example.
    * @default undefined
    */
  var keyPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Set it to fallback to let passed namespaces to translated hoc act as fallbacks
    * @default 'default'
    */
  var nsMode: js.UndefOr[typings.i18next.i18nextStrings.default | fallback] = js.undefined
  
  /**
    * Set fallback value for Trans components without children
    * @default undefined
    */
  var transEmptyNodeValue: js.UndefOr[String] = js.undefined
  
  /**
    * Which nodes not to convert in defaultValue generation in the Trans component.
    * @default ['br', 'strong', 'i', 'p']
    */
  var transKeepBasicHtmlNodesFor: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Convert eg. <br/> found in translations to a react component of type br
    * @default true
    */
  var transSupportBasicHtmlNodes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Wrap text nodes in a user-specified element.
    * @default ''
    */
  var transWrapTextNodes: js.UndefOr[String] = js.undefined
  
  /**
    * Unescape function
    * by default it unescapes some basic html entities
    */
  var unescape: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  /**
    * Set it to false if you do not want to use Suspense
    * @default true
    */
  var useSuspense: js.UndefOr[Boolean] = js.undefined
}
object ReactOptions {
  
  inline def apply(): ReactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactOptions]
  }
  
  extension [Self <: ReactOptions](x: Self) {
    
    inline def setBindI18n(value: String | `false`): Self = StObject.set(x, "bindI18n", value.asInstanceOf[js.Any])
    
    inline def setBindI18nStore(value: String | `false`): Self = StObject.set(x, "bindI18nStore", value.asInstanceOf[js.Any])
    
    inline def setBindI18nStoreUndefined: Self = StObject.set(x, "bindI18nStore", js.undefined)
    
    inline def setBindI18nUndefined: Self = StObject.set(x, "bindI18n", js.undefined)
    
    inline def setDefaultTransParent(value: String): Self = StObject.set(x, "defaultTransParent", value.asInstanceOf[js.Any])
    
    inline def setDefaultTransParentUndefined: Self = StObject.set(x, "defaultTransParent", js.undefined)
    
    inline def setHashTransKey(value: /* defaultValue */ js.UndefOr[Any] => js.UndefOr[Any]): Self = StObject.set(x, "hashTransKey", js.Any.fromFunction1(value))
    
    inline def setHashTransKeyUndefined: Self = StObject.set(x, "hashTransKey", js.undefined)
    
    inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    inline def setNsMode(value: typings.i18next.i18nextStrings.default | fallback): Self = StObject.set(x, "nsMode", value.asInstanceOf[js.Any])
    
    inline def setNsModeUndefined: Self = StObject.set(x, "nsMode", js.undefined)
    
    inline def setTransEmptyNodeValue(value: String): Self = StObject.set(x, "transEmptyNodeValue", value.asInstanceOf[js.Any])
    
    inline def setTransEmptyNodeValueUndefined: Self = StObject.set(x, "transEmptyNodeValue", js.undefined)
    
    inline def setTransKeepBasicHtmlNodesFor(value: js.Array[String]): Self = StObject.set(x, "transKeepBasicHtmlNodesFor", value.asInstanceOf[js.Any])
    
    inline def setTransKeepBasicHtmlNodesForUndefined: Self = StObject.set(x, "transKeepBasicHtmlNodesFor", js.undefined)
    
    inline def setTransKeepBasicHtmlNodesForVarargs(value: String*): Self = StObject.set(x, "transKeepBasicHtmlNodesFor", js.Array(value*))
    
    inline def setTransSupportBasicHtmlNodes(value: Boolean): Self = StObject.set(x, "transSupportBasicHtmlNodes", value.asInstanceOf[js.Any])
    
    inline def setTransSupportBasicHtmlNodesUndefined: Self = StObject.set(x, "transSupportBasicHtmlNodes", js.undefined)
    
    inline def setTransWrapTextNodes(value: String): Self = StObject.set(x, "transWrapTextNodes", value.asInstanceOf[js.Any])
    
    inline def setTransWrapTextNodesUndefined: Self = StObject.set(x, "transWrapTextNodes", js.undefined)
    
    inline def setUnescape(value: /* str */ String => String): Self = StObject.set(x, "unescape", js.Any.fromFunction1(value))
    
    inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
    
    inline def setUseSuspense(value: Boolean): Self = StObject.set(x, "useSuspense", value.asInstanceOf[js.Any])
    
    inline def setUseSuspenseUndefined: Self = StObject.set(x, "useSuspense", js.undefined)
  }
}

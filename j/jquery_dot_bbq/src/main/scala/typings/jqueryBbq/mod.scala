package typings.jqueryBbq

import typings.jquery.JQueryEventObject
import typings.jqueryBbq.mod.global.JQueryBbq.EventObject
import typings.jqueryBbq.mod.global.JQueryBbq.JQueryDeparam
import typings.jqueryBbq.mod.global.JQueryBbq.ParamFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def fragment(): JQuery = js.native
      def fragment(attr: js.Any): JQuery = js.native
      def fragment(attr: js.Any, params: js.Any): JQuery = js.native
      def fragment(attr: js.Any, params: js.Any, merge_mode: Double): JQuery = js.native
      def fragment(attr: js.Any, params: Unit, merge_mode: Double): JQuery = js.native
      def fragment(attr: Unit, params: js.Any): JQuery = js.native
      def fragment(attr: Unit, params: js.Any, merge_mode: Double): JQuery = js.native
      def fragment(attr: Unit, params: Unit, merge_mode: Double): JQuery = js.native
      
      def hashchange(): JQuery = js.native
      def hashchange(eventData: js.Any): JQuery = js.native
      def hashchange(eventData: js.Any, handler: js.Function1[/* eventObject */ EventObject, js.Any]): JQuery = js.native
      def hashchange(eventData: Unit, handler: js.Function1[/* eventObject */ EventObject, js.Any]): JQuery = js.native
      def hashchange(handler: js.Function1[/* eventObject */ EventObject, js.Any]): JQuery = js.native
      
      def querystring(): JQuery = js.native
      def querystring(attr: js.Any): JQuery = js.native
      def querystring(attr: js.Any, params: js.Any): JQuery = js.native
      def querystring(attr: js.Any, params: js.Any, merge_mode: Double): JQuery = js.native
      def querystring(attr: js.Any, params: Unit, merge_mode: Double): JQuery = js.native
      def querystring(attr: Unit, params: js.Any): JQuery = js.native
      def querystring(attr: Unit, params: js.Any, merge_mode: Double): JQuery = js.native
      def querystring(attr: Unit, params: Unit, merge_mode: Double): JQuery = js.native
    }
    
    object JQueryBbq {
      
      @js.native
      trait EventObject
        extends StObject
           with JQueryEventObject {
        
        var fragment: String = js.native
        
        def getState(): js.Any = js.native
        def getState(key: String): js.Any = js.native
        def getState(key: String, coerce: Boolean): js.Any = js.native
        def getState(key: Unit, coerce: Boolean): js.Any = js.native
      }
      
      @js.native
      trait JQuery extends StObject {
        
        /**
          * Retrieves the current 'state' from the browser history, parsing
          * location.hash for a specific key or returning an object containing the
          * entire state, optionally coercing numbers, booleans, null and undefined
          * values.
          *
          * @name key An optional state key for which to return a value.
          * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false
          */
        def getState(): js.Any = js.native
        def getState(coerce: Boolean): js.Any = js.native
        def getState(key: String): js.Any = js.native
        def getState(key: String, coerce: Boolean): js.Any = js.native
        def getState(key: Unit, coerce: Boolean): js.Any = js.native
        
        /**
          * Adds a 'state' into the browser history at the current position, setting
          * location.hash and triggering any bound <hashchange event> callbacks
          * (provided the new state is different than the previous state).
          *
          * @name params A serialized params string or a hash string beginning with # to merge into location.hash.
          * @name merge_mode Merge behavior defaults to 0 if merge_mode is not specified (unless a hash string beginning with # is specified, in which case merge behavior defaults to 2)
          */
        def pushState(): Unit = js.native
        def pushState(params: String): Unit = js.native
        def pushState(params: String, merge_mode: Double): Unit = js.native
        def pushState(params: js.Any): Unit = js.native
        def pushState(params: js.Any, merge_mode: Double): Unit = js.native
        def pushState(params: Unit, merge_mode: Double): Unit = js.native
        
        /**
          * Remove one or more keys from the current browser history 'state', creating
          * a new state, setting location.hash and triggering any bound
          * <hashchange event> callbacks (provided the new state is different than
          * the previous state).
          *
          * @name key One or more key values to remove from the current state.
          */
        def removeState(key: js.Any*): Unit = js.native
      }
      
      @js.native
      trait JQueryDeparam extends StObject {
        
        /**
          * Deserialize a params string into an object, optionally coercing numbers,
          * booleans, null and undefined values; this method is the counterpart to the
          * internal jQuery.param method.
          *
          * @name params A params string to be parsed.
          * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
          */
        def apply(params: String): js.Any = js.native
        def apply(params: String, coerce: Boolean): js.Any = js.native
        
        /**
          * Parse the fragment (hash) from a URL or the current window.location.href,
          * deserializing it into an object, optionally coercing numbers, booleans,
          * null and undefined values.
          *
          * @name url An optional params string or URL containing fragment (hash) params to be parsed. If url is omitted, the current window.location.href is used.
          * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
          */
        def fragment(): js.Any = js.native
        def fragment(url: String): js.Any = js.native
        def fragment(url: String, coerce: Boolean): js.Any = js.native
        def fragment(url: Unit, coerce: Boolean): js.Any = js.native
        
        /**
          * Parse the query string from a URL or the current window.location.href,
          * deserializing it into an object, optionally coercing numbers, booleans,
          * null and undefined values.
          *
          * @name url An optional params string or URL containing query string params to be parsed. If url is omitted, the current window.location.href is used.
          * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
          */
        def querystring(): js.Any = js.native
        def querystring(url: String): js.Any = js.native
        def querystring(url: String, coerce: Boolean): js.Any = js.native
        def querystring(url: Unit, coerce: Boolean): js.Any = js.native
      }
      
      @js.native
      trait ParamFragment extends StObject {
        
        def apply(): String = js.native
        def apply(url: String): String = js.native
        def apply(url: String, params: js.Any): String = js.native
        def apply(url: String, params: js.Any, merge_mode: Double): String = js.native
        
        /**
          * TODO: DESCRIBE
          *
          * @name state TODO: DESCRIBE
          */
        def ajaxCrawlable(): Boolean = js.native
        def ajaxCrawlable(state: Boolean): Boolean = js.native
        
        /**
          * Specify characters that will be left unescaped when fragments are created
          * or merged using <jQuery.param.fragment>, or when the fragment is modified
          * using <jQuery.bbq.pushState>. This option only applies to serialized data
          * object fragments, and not set-as-string fragments. Does not affect the
          * query string. Defaults to ",/" (comma, forward slash).
          *
          * @name chars The characters to not escape in the fragment. If unspecified, defaults to empty string (escape all characters).
          */
        def noEscape(): Unit = js.native
        def noEscape(chars: String): Unit = js.native
      }
    }
    
    @js.native
    trait JQueryParam extends StObject {
      
      def fragment(): String = js.native
      def fragment(url: String): String = js.native
      def fragment(url: String, params: js.Any): String = js.native
      def fragment(url: String, params: js.Any, merge_mode: Double): String = js.native
      @JSName("fragment")
      var fragment_Original: ParamFragment = js.native
      
      /**
        * Parse the query string from a URL or the current window.location.href,
        * deserializing it into an object, optionally coercing numbers, booleans,
        * null and undefined values.
        *
        * @name url An optional params string or URL containing query string params to be parsed. If url is omitted, the current window.location.href is used.
        * @name coerce (Boolean) If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
        * @name merge_mode An object representing the deserialized params string.
        */
      def querystring(): String = js.native
      def querystring(url: String): String = js.native
      def querystring(url: String, coerce: js.Any): String = js.native
      def querystring(url: String, coerce: js.Any, merge_mode: Double): String = js.native
      def querystring(url: String, coerce: Boolean): String = js.native
      def querystring(url: String, coerce: Boolean, merge_mode: Double): String = js.native
      def querystring(url: String, coerce: Unit, merge_mode: Double): String = js.native
      def querystring(url: Unit, coerce: js.Any): String = js.native
      def querystring(url: Unit, coerce: js.Any, merge_mode: Double): String = js.native
      def querystring(url: Unit, coerce: Boolean): String = js.native
      def querystring(url: Unit, coerce: Boolean, merge_mode: Double): String = js.native
      def querystring(url: Unit, coerce: Unit, merge_mode: Double): String = js.native
      
      /**
        * Returns a params string equivalent to that returned by the internal
        * jQuery.param method, but sorted, which makes it suitable for use as a
        * cache key.
        *
        * @name obj An object to be serialized.
        * @name traditional Params deep/shallow serialization mode. See the documentation at http://api.jquery.com/jQuery.param/ for more detail.
        */
      def sorted(obj: js.Any): String = js.native
      def sorted(obj: js.Any, traditional: Boolean): String = js.native
    }
    
    @js.native
    trait JQueryStatic extends StObject {
      
      var bbq: typings.jqueryBbq.mod.global.JQueryBbq.JQuery = js.native
      
      /**
        * Deserialize a params string into an object, optionally coercing numbers,
        * booleans, null and undefined values; this method is the counterpart to the
        * internal jQuery.param method.
        *
        * @name params A params string to be parsed.
        * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
        */
      def deparam(params: String): js.Any = js.native
      def deparam(params: String, coerce: Boolean): js.Any = js.native
      @JSName("deparam")
      var deparam_Original: JQueryDeparam = js.native
      
      /**
        * Get the internal "Default URL attribute per tag" list, or augment the list
        * with additional tag-attribute pairs, in case the defaults are insufficient.
        *
        * @name tag_attr An object containing a list of tag names and their associated default attribute names in the format { tag: 'attr', ... } to be merged into the internal tag-attribute list.
        */
      def elemUrlAttr(): js.Any = js.native
      def elemUrlAttr(tag_attr: js.Any): js.Any = js.native
    }
  }
}

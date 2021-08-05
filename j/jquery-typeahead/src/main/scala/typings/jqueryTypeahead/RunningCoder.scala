package typings.jqueryTypeahead

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQueryEventObject
import typings.jquery.JQueryXHR
import typings.jqueryTypeahead.jqueryTypeaheadBooleans.`false`
import typings.jqueryTypeahead.jqueryTypeaheadBooleans.`true`
import typings.jqueryTypeahead.jqueryTypeaheadStrings.any
import typings.jqueryTypeahead.jqueryTypeaheadStrings.asc
import typings.jqueryTypeahead.jqueryTypeaheadStrings.desc
import typings.jqueryTypeahead.jqueryTypeaheadStrings.localStorage
import typings.jqueryTypeahead.jqueryTypeaheadStrings.sessionStorage
import typings.jqueryTypeahead.jqueryTypeaheadStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RunningCoder {
  
  object Typeahead {
    
    trait AJaxSettings
      extends StObject
         with AjaxSettings[js.Any] {
      
      var always: js.UndefOr[
            js.Function3[
              /* data */ js.UndefOr[JQuery], 
              /* textStatus */ js.UndefOr[String], 
              /* jqXHR */ js.UndefOr[JQueryXHR], 
              Unit
            ]
          ] = js.undefined
      
      var done: js.UndefOr[
            js.Function3[
              /* data */ js.UndefOr[JQuery], 
              /* textStatus */ js.UndefOr[String], 
              /* jqXHR */ js.UndefOr[JQueryXHR], 
              Unit
            ]
          ] = js.undefined
      
      var fail: js.UndefOr[
            js.Function3[
              /* jqXHR */ js.UndefOr[JQueryXHR], 
              /* textStatus */ js.UndefOr[String], 
              /* errorThrown */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var `then`: js.UndefOr[
            js.Function2[/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], Unit]
          ] = js.undefined
    }
    object AJaxSettings {
      
      inline def apply(): AJaxSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AJaxSettings]
      }
      
      extension [Self <: AJaxSettings](x: Self) {
        
        inline def setAlways(
          value: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit
        ): Self = StObject.set(x, "always", js.Any.fromFunction3(value))
        
        inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
        
        inline def setDone(
          value: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit
        ): Self = StObject.set(x, "done", js.Any.fromFunction3(value))
        
        inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
        
        inline def setFail(
          value: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], /* errorThrown */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "fail", js.Any.fromFunction3(value))
        
        inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setThen(value: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
        
        inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
      }
    }
    
    trait Callback extends StObject {
      
      /** Perform operation on the source data before it gets in Typeahead cache */
      var onCacheSave: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* data */ js.UndefOr[js.Any], 
              /* group */ js.UndefOr[js.Any], 
              /* path */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.undefined
      
      /**
        * Any time there is text inside the input and it gets cleared (Backspace, Esc, Cancel button, etc).
        * It is possible to track back the event that cleared the input using event.originalEvent
        */
      var onCancel: js.UndefOr[
            js.Function2[/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject], Unit]
          ] = js.undefined
      
      /**
        * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
        * the results list. This function will trigger before the regular behaviors.
        */
      var onClick: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* a */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /**
        * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
        * the results list. This function will trigger after the regular behaviors.
        */
      var onClickAfter: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* a */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /**
        * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
        * the results list. This function will trigger before the regular behaviors.
        */
      var onClickBefore: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* a */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /** Will be executed when a dropdown filter is selected. Requires `dropdownFilter: true`. */
      var onDropdownFilter: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* a */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /** When an item in the result list is focused */
      var onEnter: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* result */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /** Triggers when the Typeahead results layout is requested to hide. */
      var onHideLayout: js.UndefOr[
            js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
          ] = js.undefined
      
      /** Will be executed on Typeahead initialization, before anything else. */
      var onInit: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.undefined
      
      /** Perform an action right after the result HTML gets inserted into Typeahead's DOM. */
      var onLayoutBuiltAfter: js.UndefOr[
            js.Function3[
              /* node */ js.UndefOr[JQuery], 
              /* query */ js.UndefOr[String], 
              /* result */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.undefined
      
      /**
        * When the result HTML is build, modify it before it get showed.
        * This callback should be used to modify the result DOM before it gets inserted into Typeahead.
        * * If you are using this callback, the resultHtmlList param needs to be returned at the end of your function.
        */
      var onLayoutBuiltBefore: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* query */ js.UndefOr[String], 
              /* result */ js.UndefOr[js.Any], 
              /* resultHtmlList */ js.UndefOr[JQuery], 
              JQuery
            ]
          ] = js.undefined
      
      /** When an item in the result list is blurred */
      var onLeave: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* result */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /** Will be executed when a item is hovered inside the result list. */
      var onMouseEnter: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* a */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /** Will be executed when a result item is hovered out. */
      var onMouseLeave: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* a */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /** Called at the end of Navigate (once the `.active` class and other operations are completed). */
      var onNavigateAfter: js.UndefOr[
            js.Function6[
              /* node */ js.UndefOr[JQuery], 
              /* lis */ js.UndefOr[JQuery], 
              /* a */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* query */ js.UndefOr[String], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /**
        * When a key is pressed to navigate the results. It is possible to disable the input text change
        * when using up and down arrows when `event.preventInputChange` is set to true
        */
      var onNavigateBefore: js.UndefOr[
            js.Function3[
              /* node */ js.UndefOr[JQuery], 
              /* query */ js.UndefOr[String], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /**
        * Gets called after the Ajax requests are all received and the data is populated inside Typeahead.
        * This is the place where extra parsing or filtering should occure before the data gets available inside any Typeahead query
        * For example, the Backend sends the "display" key separated by underscores "_" instead of spaces " ".
        * * The `data` parameter HAS to be returned after it's transformed.
        */
      var onPopulateSource: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* data */ js.UndefOr[js.Array[js.Any]], 
              /* group */ js.UndefOr[js.Any], 
              /* path */ js.UndefOr[js.Any], 
              js.Array[js.Any]
            ]
          ] = js.undefined
      
      /** Triggers when the Typeahead initial preparation is completed. */
      var onReady: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.undefined
      
      /** Gets called when the Ajax request(s) are all received */
      var onReceiveRequest: js.UndefOr[
            js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
          ] = js.undefined
      
      /** Whenever the result changes, this callback will be triggered. */
      var onResult: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* query */ js.UndefOr[String], 
              /* result */ js.UndefOr[js.Any], 
              /* resultCount */ js.UndefOr[Double], 
              Unit
            ]
          ] = js.undefined
      
      /** Triggers every time a new search is executed in Typeahead. */
      var onSearch: js.UndefOr[
            js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
          ] = js.undefined
      
      /** Gets called when the Ajax request(s) are sent. Either on initial requests or on every dynamic requests. */
      var onSendRequest: js.UndefOr[
            js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
          ] = js.undefined
      
      /** Triggers when the Typeahead results layout is displayed. */
      var onShowLayout: js.UndefOr[
            js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
          ] = js.undefined
      
      /**
        * Override the native onSubmit function by your own.
        * If after performing a set of action(s) you want to submit the form, simply do `form.submit()`.
        * * The item parameter is not always defined. An item object will be sent if the submit happens after an item from the list has been selected.
        */
      var onSubmit: js.UndefOr[
            js.Function4[
              /* node */ js.UndefOr[JQuery], 
              /* form */ js.UndefOr[js.Any], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
    }
    object Callback {
      
      inline def apply(): Callback = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Callback]
      }
      
      extension [Self <: Callback](x: Self) {
        
        inline def setOnCacheSave(
          value: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Any], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "onCacheSave", js.Any.fromFunction4(value))
        
        inline def setOnCacheSaveUndefined: Self = StObject.set(x, "onCacheSave", js.undefined)
        
        inline def setOnCancel(value: (/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject]) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
        
        inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
        
        inline def setOnClick(
          value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onClick", js.Any.fromFunction4(value))
        
        inline def setOnClickAfter(
          value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onClickAfter", js.Any.fromFunction4(value))
        
        inline def setOnClickAfterUndefined: Self = StObject.set(x, "onClickAfter", js.undefined)
        
        inline def setOnClickBefore(
          value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onClickBefore", js.Any.fromFunction4(value))
        
        inline def setOnClickBeforeUndefined: Self = StObject.set(x, "onClickBefore", js.undefined)
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        inline def setOnDropdownFilter(
          value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onDropdownFilter", js.Any.fromFunction4(value))
        
        inline def setOnDropdownFilterUndefined: Self = StObject.set(x, "onDropdownFilter", js.undefined)
        
        inline def setOnEnter(
          value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onEnter", js.Any.fromFunction4(value))
        
        inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
        
        inline def setOnHideLayout(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onHideLayout", js.Any.fromFunction2(value))
        
        inline def setOnHideLayoutUndefined: Self = StObject.set(x, "onHideLayout", js.undefined)
        
        inline def setOnInit(value: /* node */ js.UndefOr[JQuery] => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
        
        inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
        
        inline def setOnLayoutBuiltAfter(
          value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "onLayoutBuiltAfter", js.Any.fromFunction3(value))
        
        inline def setOnLayoutBuiltAfterUndefined: Self = StObject.set(x, "onLayoutBuiltAfter", js.undefined)
        
        inline def setOnLayoutBuiltBefore(
          value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultHtmlList */ js.UndefOr[JQuery]) => JQuery
        ): Self = StObject.set(x, "onLayoutBuiltBefore", js.Any.fromFunction4(value))
        
        inline def setOnLayoutBuiltBeforeUndefined: Self = StObject.set(x, "onLayoutBuiltBefore", js.undefined)
        
        inline def setOnLeave(
          value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onLeave", js.Any.fromFunction4(value))
        
        inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
        
        inline def setOnMouseEnter(
          value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction4(value))
        
        inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
        
        inline def setOnMouseLeave(
          value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction4(value))
        
        inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
        
        inline def setOnNavigateAfter(
          value: (/* node */ js.UndefOr[JQuery], /* lis */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onNavigateAfter", js.Any.fromFunction6(value))
        
        inline def setOnNavigateAfterUndefined: Self = StObject.set(x, "onNavigateAfter", js.undefined)
        
        inline def setOnNavigateBefore(
          value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onNavigateBefore", js.Any.fromFunction3(value))
        
        inline def setOnNavigateBeforeUndefined: Self = StObject.set(x, "onNavigateBefore", js.undefined)
        
        inline def setOnPopulateSource(
          value: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Array[js.Any]], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => js.Array[js.Any]
        ): Self = StObject.set(x, "onPopulateSource", js.Any.fromFunction4(value))
        
        inline def setOnPopulateSourceUndefined: Self = StObject.set(x, "onPopulateSource", js.undefined)
        
        inline def setOnReady(value: /* node */ js.UndefOr[JQuery] => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
        
        inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
        
        inline def setOnReceiveRequest(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onReceiveRequest", js.Any.fromFunction2(value))
        
        inline def setOnReceiveRequestUndefined: Self = StObject.set(x, "onReceiveRequest", js.undefined)
        
        inline def setOnResult(
          value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultCount */ js.UndefOr[Double]) => Unit
        ): Self = StObject.set(x, "onResult", js.Any.fromFunction4(value))
        
        inline def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
        
        inline def setOnSearch(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
        
        inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
        
        inline def setOnSendRequest(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onSendRequest", js.Any.fromFunction2(value))
        
        inline def setOnSendRequestUndefined: Self = StObject.set(x, "onSendRequest", js.undefined)
        
        inline def setOnShowLayout(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onShowLayout", js.Any.fromFunction2(value))
        
        inline def setOnShowLayoutUndefined: Self = StObject.set(x, "onShowLayout", js.undefined)
        
        inline def setOnSubmit(
          value: (/* node */ js.UndefOr[JQuery], /* form */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction4(value))
        
        inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      }
    }
    
    type CssObject = StringDictionary[String]
    
    trait DropdownFilterItem extends StObject {
      
      var all: String
      
      var key: String
      
      var template: String | (js.Function1[/* item */ js.Any, String])
      
      var value: String
    }
    object DropdownFilterItem {
      
      inline def apply(
        all: String,
        key: String,
        template: String | (js.Function1[/* item */ js.Any, String]),
        value: String
      ): DropdownFilterItem = {
        val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[DropdownFilterItem]
      }
      
      extension [Self <: DropdownFilterItem](x: Self) {
        
        inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setTemplate(value: String | (js.Function1[/* item */ js.Any, String])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateFunction1(value: /* item */ js.Any => String): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait DynamicFilterItem extends StObject {
      
      var key: String
      
      var selector: String
    }
    object DynamicFilterItem {
      
      inline def apply(key: String, selector: String): DynamicFilterItem = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[DynamicFilterItem]
      }
      
      extension [Self <: DynamicFilterItem](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      }
    }
    
    trait FromToPair extends StObject {
      
      var from: String
      
      var to: String
    }
    object FromToPair {
      
      inline def apply(from: String, to: String): FromToPair = {
        val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
        __obj.asInstanceOf[FromToPair]
      }
      
      extension [Self <: FromToPair](x: Self) {
        
        inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      }
    }
    
    trait GroupSetting extends StObject {
      
      var key: String
      
      var template: String | (js.Function1[/* item */ js.Any, String])
    }
    object GroupSetting {
      
      inline def apply(key: String, template: String | (js.Function1[/* item */ js.Any, String])): GroupSetting = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
        __obj.asInstanceOf[GroupSetting]
      }
      
      extension [Self <: GroupSetting](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setTemplate(value: String | (js.Function1[/* item */ js.Any, String])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateFunction1(value: /* item */ js.Any => String): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      }
    }
    
    trait MultiSelectSettings extends StObject {
      
      var callback: js.UndefOr[MultiSelectSettingsCallback] = js.undefined
      
      /** If true, the last label will be deleted if the query is empty and backspace is pressed */
      var cancelOnBackspace: js.UndefOr[Boolean] = js.undefined
      
      /** Default items when Typeahead is loade */
      var data: js.UndefOr[js.Array[js.Any] | js.Function0[js.Any]] = js.undefined
      
      /** Href link on the multiselect item */
      var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.undefined
      
      /** Optional limit of maximum items to select */
      var limit: js.UndefOr[Double] = js.undefined
      
      /** Template when the limit is reached */
      var limitTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String])] = js.undefined
      
      /** Unique item identifier to remove an item from the result list when selected (use any of the item key), by default a JSON of the item will be used */
      var matchOn: js.UndefOr[String | js.Array[js.Any]] = js.undefined
    }
    object MultiSelectSettings {
      
      inline def apply(): MultiSelectSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MultiSelectSettings]
      }
      
      extension [Self <: MultiSelectSettings](x: Self) {
        
        inline def setCallback(value: MultiSelectSettingsCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setCancelOnBackspace(value: Boolean): Self = StObject.set(x, "cancelOnBackspace", value.asInstanceOf[js.Any])
        
        inline def setCancelOnBackspaceUndefined: Self = StObject.set(x, "cancelOnBackspace", js.undefined)
        
        inline def setData(value: js.Array[js.Any] | js.Function0[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataFunction0(value: () => js.Any): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        inline def setHref(value: String | (js.Function1[/* item */ js.UndefOr[js.Any], String])): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        inline def setHrefFunction1(value: /* item */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "href", js.Any.fromFunction1(value))
        
        inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitTemplate(value: String | (js.Function1[/* query */ js.UndefOr[String], String])): Self = StObject.set(x, "limitTemplate", value.asInstanceOf[js.Any])
        
        inline def setLimitTemplateFunction1(value: /* query */ js.UndefOr[String] => String): Self = StObject.set(x, "limitTemplate", js.Any.fromFunction1(value))
        
        inline def setLimitTemplateUndefined: Self = StObject.set(x, "limitTemplate", js.undefined)
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setMatchOn(value: String | js.Array[js.Any]): Self = StObject.set(x, "matchOn", value.asInstanceOf[js.Any])
        
        inline def setMatchOnUndefined: Self = StObject.set(x, "matchOn", js.undefined)
        
        inline def setMatchOnVarargs(value: js.Any*): Self = StObject.set(x, "matchOn", js.Array(value :_*))
      }
    }
    
    trait MultiSelectSettingsCallback extends StObject {
      
      /** Triggered when a multiselect item is canceled */
      var onCancel: js.UndefOr[
            js.Function3[
              /* node */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
      
      /** Triggered when a multiselect item is clicked */
      var onClick: js.UndefOr[
            js.Function3[
              /* node */ js.UndefOr[JQuery], 
              /* item */ js.UndefOr[js.Any], 
              /* event */ js.UndefOr[JQueryEventObject], 
              Unit
            ]
          ] = js.undefined
    }
    object MultiSelectSettingsCallback {
      
      inline def apply(): MultiSelectSettingsCallback = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MultiSelectSettingsCallback]
      }
      
      extension [Self <: MultiSelectSettingsCallback](x: Self) {
        
        inline def setOnCancel(
          value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onCancel", js.Any.fromFunction3(value))
        
        inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
        
        inline def setOnClick(
          value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
        ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      /**
        * If enabled, the query and search results will ignore accents (`ãàáäâẽèéëêìíïîõòóöôùúüûñç`) and display every matches regardless of the punctuation.  Ex: `é = e`, `À = a`, etc.
        * It is possible to set a custom accent object, by simply setting `from` and `to` keys
        * * Using this option on large data sets (10,000+ items) might impact your search performances.
        *
        * @default false
        */
      var accent: js.UndefOr[Boolean | FromToPair] = js.undefined
      
      /**
        * If set to `true`, html will be added to add a backdrop under the search input and results.
        * It is possible to override the css options by passing an object to this option.
        */
      var backdrop: js.UndefOr[Boolean | CssObject] = js.undefined
      
      /**
        * If set to `true`, as soon as the Typeahead input is focused, the `backdrop` option will be displayed regardless.
        */
      var backdropOnFocus: js.UndefOr[`true`] = js.undefined
      
      /** Blur Typeahead when Tab key is pressed, if false Tab will go though search results */
      var blurOnTab: js.UndefOr[Boolean] = js.undefined
      
      /**
        * * If set to `true` or `localStorage`, the source data will be stored in `localStorage`.
        * * If set to `sessionStorage`, the source data will be stored in `sessionStorage`.
        */
      var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.undefined
      
      /**
        * The callbacks are used to customize and add functionality to your Typeahead instance. You will find plenty of examples in the Demo section.
        * There are 3 ways to define the callbacks:
        * * Function `(recommended)`: Anonymous function calling a local function with parameters.
        * * String: Function name (can be namespaced) located on the window scope without any parameters.
        * * Array: First element is the function name accessible from the window scope, second element is an array containing the parameters.
        */
      var callback: js.UndefOr[Callback] = js.undefined
      
      /**
        * This option provides a small `"x"` on the right side of the input to clear the text,
        * similar to some browser's default behavior with `input[type="search"]`.
        */
      var cancelButton: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enabling this option will compress the data inside Localstorage.
        * * Setting `compression: true` requires `cache: true` option to be enabled.
        */
      var compression: js.UndefOr[Boolean] = js.undefined
      
      /**
        * By default, search text matching is reserved to `display` keys. A searched text can't match multiple keys.
        *
        * If the option is enabled with `true` or `array` of display keys, every item will reveive an additional key called `compiled`.
        * This key will then be searched first (using soften matching mechanism) for any matching results, then the `display` keys will
        * be searched (using a `"string perfect"` matching mechanism).
        *
        * If the option is set to true, the `template` option will be compiled into the `"compiled"` item key.
        *
        * It is also possible to set an Array of display keys instead of the complete template. Try it on
        * [Hockey_v1](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
        */
      var correlativeTemplate: js.UndefOr[Boolean | js.Array[js.Any]] = js.undefined
      
      /** Display debug information (RECOMMENDED for dev environment) */
      var debug: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If `dynamic: true`, the delay (in milliseconds) will add a timer to prevent from sending a request on every key typed.
        * Instead the request(s) will be sent once the delay expires.
        *
        * @default 300
        */
      var delay: js.UndefOr[Double] = js.undefined
      
      /**
        * The key that will be searched for typeahead matching results inside source objects.
        * It is possible to search through multiple keys by simply adding them inside the configuration array.
        */
      var display: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * If a string a specified, a dropdown filter will be created between the search input and the search submit button using the `source.group` as indexes.
        * The string value will appear at the end of the dropdown and will filter through all the sources.
        *
        * If an array of objects is set, the dropdownFilter will be built based on it. It is then possible to create filters based on item matching key:value. -
        * [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
        */
      var dropdownFilter: js.UndefOr[Boolean | string | js.Array[DropdownFilterItem]] = js.undefined
      
      /**
        * By default, the typeahead will only load once the source data.
        * Although you can change this behavior and request the data to be re-loaded on every "input" event (similar to
        * keypress). - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-user_v1)
        * * Note that you can modify the Ajax request to send the query with `{{query}}` modifier.
        *
        * @default false
        */
      var dynamic: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If filters objects are defined, the Typeahead source data will be filtered based on the `"selected"` / `"checked"` checkboxes,
        * radios and selects based on `"OR"` and `"AND"` filtering similar to database queries.
        * * `selector` is the jquery selector to reach the unique input type `"checkbox"`, `"radio"` or select tag
        * * `key` the object key that will be filtered, you can use "dot" notation to reach deep object properties,
        * but in that case extra processing will be performed. Ex `object.key.is.deep`
        * * `|` key prefix means "OR" filtering, the object key CAN match the value
        * * `&` key prefix means "AND" filtering, the object key HAS to match the value
        *
        * Ex `dynamicFilter: [{ selector: "#assassin", key: "|tags.Assassin" }],`
        */
      var dynamicFilter: js.UndefOr[`false` | js.Array[DynamicFilterItem]] = js.undefined
      
      /**
        * In case there are no results to be displayed, a row will be displayed containing this template.
        * It is possible to display the query using `{{query}}` string.
        */
      var emptyTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery])] = js.undefined
      
      /**
        * If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied.
        */
      var filter: js.UndefOr[
            Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
          ] = js.undefined
      
      /**
        * If enabled, the source data will be generated (doing Ajax request and preparing to data to be searched)
        * on page load instead of waiting for the input to be focused.
        * * This option does not work well with `dynamic: true` unless some other configuration is adjusted.
        */
      var generateOnLoad: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If set to `true`, the results will grouped by the group name specified inside `source`.
        *
        * If set to `string`, the results will be grouped by the corresponding object key.
        * Ex: group: `"conference"` will group the hockey teams by `"Western"` and `"Eastern"` conferences in [hockey_v1 demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
        *
        * If an Object is set: `key`: Grouping key. `template`: Grouping template in the result list (custom header text), can be string or function.
        *
        * @default false
        */
      var group: js.UndefOr[Boolean | String | GroupSetting] = js.undefined
      
      /**
        * By default, the groups will be output in the same order as they are defined in `source`.
        * Set `"asc"` or `"desc"` to have the group name sorted ascending or descending
        * Set an `Array` to specify the group order to appear in the search result
        */
      var groupOrder: js.UndefOr[
            asc | desc | js.Array[String] | (js.Function5[
              /* node */ js.UndefOr[JQuery], 
              /* query */ js.UndefOr[String], 
              /* result */ js.UndefOr[js.Any], 
              /* resultCount */ js.UndefOr[Double], 
              /* resultCountPerGroup */ js.UndefOr[Double], 
              js.Array[js.Any]
            ])
          ] = js.undefined
      
      /** Set a custom template for the groups */
      var groupTemplate: js.UndefOr[Null] = js.undefined
      
      /**
        * The search result(s) will receive the <strong> HTML tag around the matched query.
        *
        * If set to `true`, only the display keys will be highlighted
        *
        * If set to `"any"`, any string within the template will be highlighted
        *
        * @default true
        */
      var highlight: js.UndefOr[any | Boolean] = js.undefined
      
      /**
        * A suggestion text will appear if there is an item inside the result list that starts by the user query.
        * Also pressing the right arrow at the end of the search input text will autocomplete the query with the suggested hint and call `callback.onClickBefore` with the selected item.
        *
        * @default false
        */
      var hint: js.UndefOr[Boolean | CssObject] = js.undefined
      
      /**
        * If a string is defined, every result item will receive the string as href attribute replacing any `{{itemKey}}` by the `item's value`.
        * It is possible to apply an extra operation of `"slugify"` on the value `{{url|slugify}}`. - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-beer_v1)
        */
      var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.undefined
      
      /**
        * The jQuery input selector is only required if the Typeahead was initialized without a jQuery object.
        * In that case, if no input is found, the Typeahead is dropped.
        */
      var input: js.UndefOr[String] = js.undefined
      
      /** Display a loading animation when typeahead is doing request / searching for results */
      var loadingAnimation: js.UndefOr[`true`] = js.undefined
      
      /** If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied. */
      var matcher: js.UndefOr[
            js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
          ] = js.undefined
      
      /**
        * The maximum number of search results that will appear inside the list. Set 0 to display ALL search results.
        * It is possible to combine `maxItem` with `maxItemPerGroup` to get different results.
        *
        * @default 8
        */
      var maxItem: js.UndefOr[`false` | Double] = js.undefined
      
      /** Set a maximum results per group if `group: true` configuration is enabled */
      var maxItemPerGroup: js.UndefOr[Double] = js.undefined
      
      /**
        * The maximum number of characters typed inside the input to perform a search.
        *
        * @default false
        */
      var maxLength: js.UndefOr[`false` | Double] = js.undefined
      
      /**
        * The number of characters typed inside the search input before searching for results.
        * It is possible to set this option to 0 and combine it with `searchOnFocus: true` to display a set of results by default.
        *
        * @default 2
        */
      var minLength: js.UndefOr[Double] = js.undefined
      
      /** `multiselect` configuration */
      var multiselect: js.UndefOr[MultiSelectSettings] = js.undefined
      
      /**
        * If enabled, an item will HAVE TO be selected in order to submit the form.
        * Use this option if you want to restrict searching to your data set only.
        */
      var mustSelectItem: js.UndefOr[Boolean] = js.undefined
      
      /**
        * `false` The position of the matched query can be anywhere inside the result string
        *
        * `true` The query can only be match if the result string starts by the query characters.
        *
        * @default false
        */
      var offset: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Takes the default order in which the data was given.
        * If `"asc"` or `"desc"` is set, they results will re-order based on display key.
        */
      var order: js.UndefOr[asc | desc] = js.undefined
      
      /**
        * If a jQuery string selector or jQuery object is specified, the typeahead results will appear in that container instead of the default one.
        * If the option is set to `false`, the HTML result list will not be built.
        * Use this option for filtering "already on page" HTML list elements with show / hide.
        */
      var resultContainer: js.UndefOr[string | `false` | JQuery] = js.undefined
      
      /**
        * If enabled, the typeahead will display results (if any) on input focus. You can combine this option with the input
        * attribute `"autofocus"` to display results when the page is loaded.
        */
      var searchOnFocus: js.UndefOr[Boolean] = js.undefined
      
      var selector: js.UndefOr[Selector] = js.undefined
      
      /**
        * The source option corresponds to the data set(s) that Typeahead will look through to find matches for the user query string.
        * Inside the source, you can have multiple lists of data (groups)
        * It is possible to send an async request inside the data function using `$.Deferred`
        * `source.group` configuration:
        */
      var source: js.UndefOr[Source | js.Array[Source] | SourceTable] = js.undefined
      
      /**
        * The template is a HTML string containing keys that will replaced by match results object keys.
        * You MUST use `{{variable}}` delimiters for your string to be replaced.
        *
        * You can also reach multi-level deep object properties using regular `"."` format, `{{variable.secordlevel.thirdlevel}}`
        *
        * If you need to print the item values inside HTML data attributes, it is possible to use `{{variable|raw}}`.
        * That optional modifier will make sure to get the unmodified value.
        */
      var template: js.UndefOr[
            String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
          ] = js.undefined
      
      /**
        * When an item is selected / clicked, by default the `"Matched key"` will go inside the input.
        * By defining a `templateValue`, the text that will result in the input can be customized.
        */
      var templateValue: js.UndefOr[String] = js.undefined
      
      /** This is a `cache` configuration, it sets the storage time to live in milliseconds. */
      var ttl: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAccent(value: Boolean | FromToPair): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
        
        inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
        
        inline def setBackdrop(value: Boolean | CssObject): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
        
        inline def setBackdropOnFocus(value: `true`): Self = StObject.set(x, "backdropOnFocus", value.asInstanceOf[js.Any])
        
        inline def setBackdropOnFocusUndefined: Self = StObject.set(x, "backdropOnFocus", js.undefined)
        
        inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
        
        inline def setBlurOnTab(value: Boolean): Self = StObject.set(x, "blurOnTab", value.asInstanceOf[js.Any])
        
        inline def setBlurOnTabUndefined: Self = StObject.set(x, "blurOnTab", js.undefined)
        
        inline def setCache(value: Boolean | localStorage | sessionStorage): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
        
        inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setCancelButton(value: Boolean): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
        
        inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
        
        inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
        
        inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
        
        inline def setCorrelativeTemplate(value: Boolean | js.Array[js.Any]): Self = StObject.set(x, "correlativeTemplate", value.asInstanceOf[js.Any])
        
        inline def setCorrelativeTemplateUndefined: Self = StObject.set(x, "correlativeTemplate", js.undefined)
        
        inline def setCorrelativeTemplateVarargs(value: js.Any*): Self = StObject.set(x, "correlativeTemplate", js.Array(value :_*))
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setDisplay(value: js.Array[String]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setDisplayVarargs(value: String*): Self = StObject.set(x, "display", js.Array(value :_*))
        
        inline def setDropdownFilter(value: Boolean | string | js.Array[DropdownFilterItem]): Self = StObject.set(x, "dropdownFilter", value.asInstanceOf[js.Any])
        
        inline def setDropdownFilterUndefined: Self = StObject.set(x, "dropdownFilter", js.undefined)
        
        inline def setDropdownFilterVarargs(value: DropdownFilterItem*): Self = StObject.set(x, "dropdownFilter", js.Array(value :_*))
        
        inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
        
        inline def setDynamicFilter(value: `false` | js.Array[DynamicFilterItem]): Self = StObject.set(x, "dynamicFilter", value.asInstanceOf[js.Any])
        
        inline def setDynamicFilterUndefined: Self = StObject.set(x, "dynamicFilter", js.undefined)
        
        inline def setDynamicFilterVarargs(value: DynamicFilterItem*): Self = StObject.set(x, "dynamicFilter", js.Array(value :_*))
        
        inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
        
        inline def setEmptyTemplate(value: String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery])): Self = StObject.set(x, "emptyTemplate", value.asInstanceOf[js.Any])
        
        inline def setEmptyTemplateFunction1(value: /* query */ js.UndefOr[String] => String | JQuery): Self = StObject.set(x, "emptyTemplate", js.Any.fromFunction1(value))
        
        inline def setEmptyTemplateUndefined: Self = StObject.set(x, "emptyTemplate", js.undefined)
        
        inline def setFilter(
          value: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
        ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterFunction2(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setGenerateOnLoad(value: Boolean): Self = StObject.set(x, "generateOnLoad", value.asInstanceOf[js.Any])
        
        inline def setGenerateOnLoadUndefined: Self = StObject.set(x, "generateOnLoad", js.undefined)
        
        inline def setGroup(value: Boolean | String | GroupSetting): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupOrder(
          value: asc | desc | js.Array[String] | (js.Function5[
                  /* node */ js.UndefOr[JQuery], 
                  /* query */ js.UndefOr[String], 
                  /* result */ js.UndefOr[js.Any], 
                  /* resultCount */ js.UndefOr[Double], 
                  /* resultCountPerGroup */ js.UndefOr[Double], 
                  js.Array[js.Any]
                ])
        ): Self = StObject.set(x, "groupOrder", value.asInstanceOf[js.Any])
        
        inline def setGroupOrderFunction5(
          value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultCount */ js.UndefOr[Double], /* resultCountPerGroup */ js.UndefOr[Double]) => js.Array[js.Any]
        ): Self = StObject.set(x, "groupOrder", js.Any.fromFunction5(value))
        
        inline def setGroupOrderUndefined: Self = StObject.set(x, "groupOrder", js.undefined)
        
        inline def setGroupOrderVarargs(value: String*): Self = StObject.set(x, "groupOrder", js.Array(value :_*))
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        inline def setHighlight(value: any | Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
        
        inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
        
        inline def setHint(value: Boolean | CssObject): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        inline def setHref(value: String | (js.Function1[/* item */ js.UndefOr[js.Any], String])): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        inline def setHrefFunction1(value: /* item */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "href", js.Any.fromFunction1(value))
        
        inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
        
        inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
        
        inline def setLoadingAnimation(value: `true`): Self = StObject.set(x, "loadingAnimation", value.asInstanceOf[js.Any])
        
        inline def setLoadingAnimationUndefined: Self = StObject.set(x, "loadingAnimation", js.undefined)
        
        inline def setMatcher(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
        
        inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
        
        inline def setMaxItem(value: `false` | Double): Self = StObject.set(x, "maxItem", value.asInstanceOf[js.Any])
        
        inline def setMaxItemPerGroup(value: Double): Self = StObject.set(x, "maxItemPerGroup", value.asInstanceOf[js.Any])
        
        inline def setMaxItemPerGroupUndefined: Self = StObject.set(x, "maxItemPerGroup", js.undefined)
        
        inline def setMaxItemUndefined: Self = StObject.set(x, "maxItem", js.undefined)
        
        inline def setMaxLength(value: `false` | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
        
        inline def setMultiselect(value: MultiSelectSettings): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
        
        inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
        
        inline def setMustSelectItem(value: Boolean): Self = StObject.set(x, "mustSelectItem", value.asInstanceOf[js.Any])
        
        inline def setMustSelectItemUndefined: Self = StObject.set(x, "mustSelectItem", js.undefined)
        
        inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
        
        inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
        
        inline def setResultContainer(value: string | `false` | JQuery): Self = StObject.set(x, "resultContainer", value.asInstanceOf[js.Any])
        
        inline def setResultContainerUndefined: Self = StObject.set(x, "resultContainer", js.undefined)
        
        inline def setSearchOnFocus(value: Boolean): Self = StObject.set(x, "searchOnFocus", value.asInstanceOf[js.Any])
        
        inline def setSearchOnFocusUndefined: Self = StObject.set(x, "searchOnFocus", js.undefined)
        
        inline def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: Source | js.Array[Source] | SourceTable): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setSourceVarargs(value: Source*): Self = StObject.set(x, "source", js.Array(value :_*))
        
        inline def setTemplate(
          value: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
        ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateFunction2(value: (/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => String): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
        
        inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        inline def setTemplateValue(value: String): Self = StObject.set(x, "templateValue", value.asInstanceOf[js.Any])
        
        inline def setTemplateValueUndefined: Self = StObject.set(x, "templateValue", js.undefined)
        
        inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    trait Selector extends StObject {
      
      var backdrop: js.UndefOr[String] = js.undefined
      
      var button: js.UndefOr[String] = js.undefined
      
      var cancelButton: js.UndefOr[String] = js.undefined
      
      var container: js.UndefOr[String] = js.undefined
      
      var display: js.UndefOr[String] = js.undefined
      
      var dropdown: js.UndefOr[String] = js.undefined
      
      var dropdownItem: js.UndefOr[String] = js.undefined
      
      var empty: js.UndefOr[String] = js.undefined
      
      var filter: js.UndefOr[String] = js.undefined
      
      var filterButton: js.UndefOr[String] = js.undefined
      
      var group: js.UndefOr[String] = js.undefined
      
      var hint: js.UndefOr[String] = js.undefined
      
      var item: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var labelContainer: js.UndefOr[String] = js.undefined
      
      var list: js.UndefOr[String] = js.undefined
      
      var query: js.UndefOr[String] = js.undefined
      
      var result: js.UndefOr[String] = js.undefined
    }
    object Selector {
      
      inline def apply(): Selector = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Selector]
      }
      
      extension [Self <: Selector](x: Self) {
        
        inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
        
        inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
        
        inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
        
        inline def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
        
        inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
        
        inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
        
        inline def setDropdownItem(value: String): Self = StObject.set(x, "dropdownItem", value.asInstanceOf[js.Any])
        
        inline def setDropdownItemUndefined: Self = StObject.set(x, "dropdownItem", js.undefined)
        
        inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
        
        inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
        
        inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
        
        inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterButton(value: String): Self = StObject.set(x, "filterButton", value.asInstanceOf[js.Any])
        
        inline def setFilterButtonUndefined: Self = StObject.set(x, "filterButton", js.undefined)
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelContainer(value: String): Self = StObject.set(x, "labelContainer", value.asInstanceOf[js.Any])
        
        inline def setLabelContainerUndefined: Self = StObject.set(x, "labelContainer", js.undefined)
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      }
    }
    
    trait Source extends StObject {
      
      /** En extended version of `JQuery Ajax` */
      var ajax: js.UndefOr[AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings])] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var compression: js.UndefOr[Boolean] = js.undefined
      
      /**  Array or function that returns an Array. The items in your array can either be strings or objects */
      var data: js.UndefOr[js.Array[js.Any] | js.Function0[js.Array[js.Any]]] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var display: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var dynamic: js.UndefOr[Boolean] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var filter: js.UndefOr[
            Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
          ] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var matcher: js.UndefOr[
            js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
          ] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var maxLength: js.UndefOr[`false` | Double] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var minLength: js.UndefOr[Double] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var template: js.UndefOr[
            String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
          ] = js.undefined
      
      /** Overrides the default configuration for the specified group. */
      var ttl: js.UndefOr[Double] = js.undefined
    }
    object Source {
      
      inline def apply(): Source = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Source]
      }
      
      extension [Self <: Source](x: Self) {
        
        inline def setAjax(value: AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings])): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
        
        inline def setAjaxFunction1(value: /* query */ js.UndefOr[String] => AJaxSettings): Self = StObject.set(x, "ajax", js.Any.fromFunction1(value))
        
        inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
        
        inline def setCache(value: Boolean | localStorage | sessionStorage): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
        
        inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
        
        inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
        
        inline def setData(value: js.Array[js.Any] | js.Function0[js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataFunction0(value: () => js.Array[js.Any]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        inline def setDisplay(value: String | js.Array[String]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setDisplayVarargs(value: String*): Self = StObject.set(x, "display", js.Array(value :_*))
        
        inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
        
        inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
        
        inline def setFilter(
          value: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
        ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterFunction2(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setMatcher(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
        
        inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
        
        inline def setMaxLength(value: `false` | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
        
        inline def setTemplate(
          value: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
        ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateFunction2(value: (/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => String): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
        
        inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    type SourceTable = StringDictionary[Source]
  }
}

package typings.jqueryAjaxChain

import org.scalablytyped.runtime.Instantiable0
import typings.jquery.JQuery.PromiseBase
import typings.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxChain {
  
  /**
    * A set of key/value pairs that configure the AjaxChain request; 'ajaxSettings' is mandatory.
    */
  trait AjaxChainConfiguration extends StObject {
    
    /**
      * jQuery $.ajax method settings (required).
      */
    var ajaxSettings: JQueryAjaxSettings
    
    /**
      * Returning a truthy value (String) allows to append a string to the next queued
      * Ajax call 'url' property value specified in original jQuery $.ajax method configuration
      * object ('ajaxSettings') (optional).
      */
    var appendToUrl: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
    
    /**
      * Returning a truthy value allows to prevent the related Ajax call from being executed,
      * passing the former as a parameter to any registered handler(s); useful to create
      * caching mechanisms (optional).
      */
    var hasCache: js.UndefOr[js.Function1[/* response */ js.Any, js.Any]] = js.undefined
    
    /**
      * Returning a truthy value determines any registered fail callback(s) to be called immediately,
      * passing the former as an argument to the latter; the queue is then rejected (optional).
      */
    var hasErrors: js.UndefOr[js.Function1[/* response */ js.Any, js.Any]] = js.undefined
    
    /**
      * Returning a truthy value prevents the queue from further progressing to the succeeding
      * Ajax calls; the queue is then resolved (optional).
      */
    var hasHaltingCapabilities: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.undefined
    
    /**
      * Returning a truthy value prevents the queue from being halted in case of Ajax error (optional).
      */
    var isSkippable: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.undefined
    
    /**
      * Configuration object label (optional).
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Returning a truthy value (Object) allows to arbitrarily overwrite the next queued Ajax call
      * 'data' property value specified in the original jQuery $.ajax method configuration
      * object ('ajaxSettings') (optional).
      */
    var transform: js.UndefOr[js.Function1[/* response */ js.Any, String | js.Object | js.Array[js.Object]]] = js.undefined
  }
  object AjaxChainConfiguration {
    
    inline def apply(ajaxSettings: JQueryAjaxSettings): AjaxChainConfiguration = {
      val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjaxChainConfiguration]
    }
    
    extension [Self <: AjaxChainConfiguration](x: Self) {
      
      inline def setAjaxSettings(value: JQueryAjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      inline def setAppendToUrl(value: /* response */ js.Any => String): Self = StObject.set(x, "appendToUrl", js.Any.fromFunction1(value))
      
      inline def setAppendToUrlUndefined: Self = StObject.set(x, "appendToUrl", js.undefined)
      
      inline def setHasCache(value: /* response */ js.Any => js.Any): Self = StObject.set(x, "hasCache", js.Any.fromFunction1(value))
      
      inline def setHasCacheUndefined: Self = StObject.set(x, "hasCache", js.undefined)
      
      inline def setHasErrors(value: /* response */ js.Any => js.Any): Self = StObject.set(x, "hasErrors", js.Any.fromFunction1(value))
      
      inline def setHasErrorsUndefined: Self = StObject.set(x, "hasErrors", js.undefined)
      
      inline def setHasHaltingCapabilities(value: /* response */ js.Any => Boolean): Self = StObject.set(x, "hasHaltingCapabilities", js.Any.fromFunction1(value))
      
      inline def setHasHaltingCapabilitiesUndefined: Self = StObject.set(x, "hasHaltingCapabilities", js.undefined)
      
      inline def setIsSkippable(value: /* response */ js.Any => Boolean): Self = StObject.set(x, "isSkippable", js.Any.fromFunction1(value))
      
      inline def setIsSkippableUndefined: Self = StObject.set(x, "isSkippable", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTransform(value: /* response */ js.Any => String | js.Object | js.Array[js.Object]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /**
    * Instance members of JQueryAjaxChain
    */
  @js.native
  trait JQueryAjaxChain
    extends StObject
       with PromiseBase[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any] {
    
    /**
      * Clears the currently queued configuration objects.
      */
    def clearQueue(): JQueryAjaxChain = js.native
    
    /**
      * Sequentially and synchronously dequeues the configuration objects enqueued via enqueue() method
      * in the order they were added, triggering the related Ajax calls.
      */
    def dequeue(): JQueryAjaxChain = js.native
    
    def enqueue(confObj: js.Array[AjaxChainConfiguration]): JQueryAjaxChain = js.native
    /**
      * Enqueues one or more configuration objects for later processing.
      */
    def enqueue(confObj: AjaxChainConfiguration): JQueryAjaxChain = js.native
  }
  
  /**
    * Static members of JQueryAjaxChain
    */
  @js.native
  trait JQueryAjaxChainStatic
    extends StObject
       with Instantiable0[JQueryAjaxChain]
}

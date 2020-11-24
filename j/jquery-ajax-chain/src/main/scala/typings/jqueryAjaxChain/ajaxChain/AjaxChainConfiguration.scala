package typings.jqueryAjaxChain.ajaxChain

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of key/value pairs that configure the AjaxChain request; 'ajaxSettings' is mandatory.
  */
@js.native
trait AjaxChainConfiguration extends js.Object {
  
  /**
    * jQuery $.ajax method settings (required).
    */
  var ajaxSettings: JQueryAjaxSettings = js.native
  
  /**
    * Returning a truthy value (String) allows to append a string to the next queued
    * Ajax call 'url' property value specified in original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var appendToUrl: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.native
  
  /**
    * Returning a truthy value allows to prevent the related Ajax call from being executed,
    * passing the former as a parameter to any registered handler(s); useful to create
    * caching mechanisms (optional).
    */
  var hasCache: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.native
  
  /**
    * Returning a truthy value determines any registered fail callback(s) to be called immediately,
    * passing the former as an argument to the latter; the queue is then rejected (optional).
    */
  var hasErrors: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.native
  
  /**
    * Returning a truthy value prevents the queue from further progressing to the succeeding
    * Ajax calls; the queue is then resolved (optional).
    */
  var hasHaltingCapabilities: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.native
  
  /**
    * Returning a truthy value prevents the queue from being halted in case of Ajax error (optional).
    */
  var isSkippable: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.native
  
  /**
    * Configuration object label (optional).
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Returning a truthy value (Object) allows to arbitrarily overwrite the next queued Ajax call
    * 'data' property value specified in the original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var transform: js.UndefOr[js.Function1[/* response */ js.Any, String | js.Object | js.Array[js.Object]]] = js.native
}
object AjaxChainConfiguration {
  
  @scala.inline
  def apply(ajaxSettings: JQueryAjaxSettings): AjaxChainConfiguration = {
    val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxChainConfiguration]
  }
  
  @scala.inline
  implicit class AjaxChainConfigurationOps[Self <: AjaxChainConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAjaxSettings(value: JQueryAjaxSettings): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUrl(value: /* response */ js.Any => String): Self = this.set("appendToUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAppendToUrl: Self = this.set("appendToUrl", js.undefined)
    
    @scala.inline
    def setHasCache(value: /* response */ js.Any => _): Self = this.set("hasCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasCache: Self = this.set("hasCache", js.undefined)
    
    @scala.inline
    def setHasErrors(value: /* response */ js.Any => _): Self = this.set("hasErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasErrors: Self = this.set("hasErrors", js.undefined)
    
    @scala.inline
    def setHasHaltingCapabilities(value: /* response */ js.Any => Boolean): Self = this.set("hasHaltingCapabilities", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasHaltingCapabilities: Self = this.set("hasHaltingCapabilities", js.undefined)
    
    @scala.inline
    def setIsSkippable(value: /* response */ js.Any => Boolean): Self = this.set("isSkippable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsSkippable: Self = this.set("isSkippable", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTransform(value: /* response */ js.Any => String | js.Object | js.Array[js.Object]): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}

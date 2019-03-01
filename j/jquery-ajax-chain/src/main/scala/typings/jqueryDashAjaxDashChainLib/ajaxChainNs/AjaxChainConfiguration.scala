package typings
package jqueryDashAjaxDashChainLib.ajaxChainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of key/value pairs that configure the AjaxChain request; 'ajaxSettings' is mandatory.
  */
trait AjaxChainConfiguration extends js.Object {
  /**
    * jQuery $.ajax method settings (required).
    */
  var ajaxSettings: jqueryLib.JQueryAjaxSettings
  /**
    * Returning a truthy value (String) allows to append a string to the next queued
    * Ajax call 'url' property value specified in original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var appendToUrl: js.UndefOr[js.Function1[/* response */ js.Any, java.lang.String]] = js.undefined
  /**
    * Returning a truthy value allows to prevent the related Ajax call from being executed,
    * passing the former as a parameter to any registered handler(s); useful to create
    * caching mechanisms (optional).
    */
  var hasCache: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.undefined
  /**
    * Returning a truthy value determines any registered fail callback(s) to be called immediately,
    * passing the former as an argument to the latter; the queue is then rejected (optional).
    */
  var hasErrors: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.undefined
  /**
    * Returning a truthy value prevents the queue from further progressing to the succeeding
    * Ajax calls; the queue is then resolved (optional).
    */
  var hasHaltingCapabilities: js.UndefOr[js.Function1[/* response */ js.Any, scala.Boolean]] = js.undefined
  /**
    * Returning a truthy value prevents the queue from being halted in case of Ajax error (optional).
    */
  var isSkippable: js.UndefOr[js.Function1[/* response */ js.Any, scala.Boolean]] = js.undefined
  /**
    * Configuration object label (optional).
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returning a truthy value (Object) allows to arbitrarily overwrite the next queued Ajax call
    * 'data' property value specified in the original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var transform: js.UndefOr[
    js.Function1[/* response */ js.Any, java.lang.String | js.Object | js.Array[js.Object]]
  ] = js.undefined
}

object AjaxChainConfiguration {
  @scala.inline
  def apply(
    ajaxSettings: jqueryLib.JQueryAjaxSettings,
    appendToUrl: js.Function1[/* response */ js.Any, java.lang.String] = null,
    hasCache: js.Function1[/* response */ js.Any, _] = null,
    hasErrors: js.Function1[/* response */ js.Any, _] = null,
    hasHaltingCapabilities: js.Function1[/* response */ js.Any, scala.Boolean] = null,
    isSkippable: js.Function1[/* response */ js.Any, scala.Boolean] = null,
    label: java.lang.String = null,
    transform: js.Function1[/* response */ js.Any, java.lang.String | js.Object | js.Array[js.Object]] = null
  ): AjaxChainConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    if (appendToUrl != null) __obj.updateDynamic("appendToUrl")(appendToUrl)
    if (hasCache != null) __obj.updateDynamic("hasCache")(hasCache)
    if (hasErrors != null) __obj.updateDynamic("hasErrors")(hasErrors)
    if (hasHaltingCapabilities != null) __obj.updateDynamic("hasHaltingCapabilities")(hasHaltingCapabilities)
    if (isSkippable != null) __obj.updateDynamic("isSkippable")(isSkippable)
    if (label != null) __obj.updateDynamic("label")(label)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[AjaxChainConfiguration]
  }
}


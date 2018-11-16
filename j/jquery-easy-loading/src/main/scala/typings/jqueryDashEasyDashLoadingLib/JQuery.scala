package typings
package jqueryDashEasyDashLoadingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
       * Return the loading object associated to the element or initialize it
       * This method is interesting if you need the plugin object to access the
       * internal API
       * Example: `$('#some-element').Loading().toggle()`
       *
       * @param {Object} [options] Initialization options. If new options are given
       * to a previously initialized object, the old ones are overriden and the
       * plugin restarted
       * @return {Loading}
       */
  def Loading(): jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.LoadingObject = js.native
  /**
       * Return the loading object associated to the element or initialize it
       * This method is interesting if you need the plugin object to access the
       * internal API
       * Example: `$('#some-element').Loading().toggle()`
       *
       * @param {Object} [options] Initialization options. If new options are given
       * to a previously initialized object, the old ones are overriden and the
       * plugin restarted
       * @return {Loading}
       */
  def Loading(options: jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.Options): jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.LoadingObject = js.native
  /**
       * Initializes the plugin and return a chainable jQuery object
       *
       * @param {Object} [options] Initialization options. Extends `Loading.defaults`
       * @return {jQuery}
       */
  def loading(): JQuery = js.native
  /**
       * Initializes the plugin and return a chainable jQuery object
       *
       * @param {Object} [options] Initialization options. Extends `Loading.defaults`
       * @return {jQuery}
       */
  def loading(options: jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.Command): JQuery = js.native
  /**
       * Initializes the plugin and return a chainable jQuery object
       *
       * @param {Object} [options] Initialization options. Extends `Loading.defaults`
       * @return {jQuery}
       */
  def loading(options: jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.Options): JQuery = js.native
}


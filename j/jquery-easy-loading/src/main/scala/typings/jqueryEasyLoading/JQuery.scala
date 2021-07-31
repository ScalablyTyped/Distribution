package typings.jqueryEasyLoading

import typings.jqueryEasyLoading.JQueryEasyLoading.Command
import typings.jqueryEasyLoading.JQueryEasyLoading.LoadingObject
import typings.jqueryEasyLoading.JQueryEasyLoading.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
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
  def Loading(): LoadingObject = js.native
  def Loading(options: Options): LoadingObject = js.native
  
  /**
    * Initializes the plugin and return a chainable jQuery object
    *
    * @param {Object} [options] Initialization options. Extends `Loading.defaults`
    * @return {jQuery}
    */
  def loading(): JQuery = js.native
  def loading(options: Command): JQuery = js.native
  def loading(options: Options): JQuery = js.native
}

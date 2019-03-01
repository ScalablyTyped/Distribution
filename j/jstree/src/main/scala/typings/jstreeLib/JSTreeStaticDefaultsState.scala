package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsState extends js.Object {
  /**
    * A space separated list of events that trigger a state save. Defaults to `changed.jstree open_node.jstree close_node.jstree`.
    * @name $.jstree.defaults.state.events
    * @plugin state
    */
  var events: java.lang.String
  /**
    * A function that will be executed prior to restoring state with one argument - the state object. Can be used to clear unwanted parts of the state.
    * @name $.jstree.defaults.state.filter
    * @plugin state
    */
  var filter: js.Any
  /**
    * A string for the key to use when saving the current tree (change if using multiple trees in your project). Defaults to `jstree`.
    * @name $.jstree.defaults.state.key
    * @plugin state
    */
  var key: java.lang.String
  /**
    * Time in milliseconds after which the state will expire. Defaults to 'false' meaning - no expire.
    * @name $.jstree.defaults.state.ttl
    * @plugin state
    */
  var ttl: js.Any
}

object JSTreeStaticDefaultsState {
  @scala.inline
  def apply(events: java.lang.String, filter: js.Any, key: java.lang.String, ttl: js.Any): JSTreeStaticDefaultsState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[JSTreeStaticDefaultsState]
  }
}


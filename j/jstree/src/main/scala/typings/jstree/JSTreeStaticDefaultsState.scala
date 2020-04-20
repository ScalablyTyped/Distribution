package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsState extends js.Object {
  /**
    * A space separated list of events that trigger a state save. Defaults to `changed.jstree open_node.jstree close_node.jstree`.
    * @name $.jstree.defaults.state.events
    * @plugin state
    */
  var events: String
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
  var key: String
  /**
    * Should loaded nodes be restored (setting this to true means that it is possible that the whole tree will be loaded for some users - use with caution). Defaults to `false`
    * @name $.jstree.defaults.state.preserve_loaded
    * @plugin state
    */
  var preserve_loaded: Boolean
  /**
    * Time in milliseconds after which the state will expire. Defaults to 'false' meaning - no expire.
    * @name $.jstree.defaults.state.ttl
    * @plugin state
    */
  var ttl: js.Any
}

object JSTreeStaticDefaultsState {
  @scala.inline
  def apply(events: String, filter: js.Any, key: String, preserve_loaded: Boolean, ttl: js.Any): JSTreeStaticDefaultsState = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], preserve_loaded = preserve_loaded.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsState]
  }
}


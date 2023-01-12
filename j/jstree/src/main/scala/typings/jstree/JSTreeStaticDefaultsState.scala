package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSTreeStaticDefaultsState extends StObject {
  
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
  var filter: Any
  
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
  var ttl: Any
}
object JSTreeStaticDefaultsState {
  
  inline def apply(events: String, filter: Any, key: String, preserve_loaded: Boolean, ttl: Any): JSTreeStaticDefaultsState = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], preserve_loaded = preserve_loaded.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSTreeStaticDefaultsState] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPreserve_loaded(value: Boolean): Self = StObject.set(x, "preserve_loaded", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Any): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}

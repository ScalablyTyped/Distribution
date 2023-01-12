package typings.hapiHapi.mod

import typings.hapiHapi.anon.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerEventCriteria[T] extends StObject {
  
  /**
    * a string or array of strings specifying the event channels to subscribe to. If the event registration specified a list of allowed channels, the channels array must match the allowed
    * channels. If channels are specified, event updates without any channel designation will not be included in the subscription. Defaults to no channels filter.
    */
  var channels: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** if true, the data object passed to server.event.emit() is cloned before it is passed to the listener method. Defaults to the event registration option (which defaults to false). */
  @JSName("clone")
  var clone_FServerEventCriteria: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a positive integer indicating the number of times the listener can be called after which the subscription is automatically removed. A count of 1 is the same as calling server.events.once().
    * Defaults to no limit.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * filter - the event tags (if present) to subscribe to which can be one of:
    * * a tag string.
    * * an array of tag strings.
    * * an object with the following:
    * * * tags - a tag string or array of tag strings.
    * * * all - if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag).
    */
  var filter: js.UndefOr[String | js.Array[String] | All] = js.undefined
  
  /** (required) the event name string. */
  var name: T
  
  /**
    * if true, and the data object passed to server.event.emit() is an array, the listener method is called with each array element passed as a separate argument. This should only be used
    * when the emitted data structure is known and predictable. Defaults to the event registration option (which defaults to false).
    */
  var spread: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true and the criteria object passed to server.event.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended
    * to the arguments list at the end. Defaults to the event registration option (which defaults to false).
    */
  var tags: js.UndefOr[Boolean] = js.undefined
}
object ServerEventCriteria {
  
  inline def apply[T](name: T): ServerEventCriteria[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEventCriteria[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerEventCriteria[?], T] (val x: Self & ServerEventCriteria[T]) extends AnyVal {
    
    inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFilter(value: String | js.Array[String] | All): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerEventsApplicationObject extends StObject {
  
  /** a string or array of strings specifying the event channels available. Defaults to no channel restrictions (event updates can specify a channel or not). */
  var channels: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * if true, the data object passed to server.events.emit() is cloned before it is passed to the listeners (unless an override specified by each listener). Defaults to false (data is passed as-is).
    */
  @JSName("clone")
  var clone_FServerEventsApplicationObject: js.UndefOr[Boolean] = js.undefined
  
  /** the event name string (required). */
  var name: String
  
  /**
    * if true, the same event name can be registered multiple times where the second registration is ignored. Note that if the registration config is changed between registrations, only the first
    * configuration is used. Defaults to false (a duplicate registration will throw an error).
    */
  var shared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, the data object passed to server.event.emit() must be an array and the listener method is called with each array element passed as a separate argument (unless an override specified
    * by each listener). This should only be used when the emitted data structure is known and predictable. Defaults to false (data is emitted as a single argument regardless of its type).
    */
  var spread: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true and the criteria object passed to server.event.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to
    * the arguments list at the end. A configuration override can be set by each listener. Defaults to false.
    */
  var tags: js.UndefOr[Boolean] = js.undefined
}
object ServerEventsApplicationObject {
  
  inline def apply(name: String): ServerEventsApplicationObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEventsApplicationObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerEventsApplicationObject] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

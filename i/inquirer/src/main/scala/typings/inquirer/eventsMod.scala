package typings.inquirer

import typings.node.readlineMod.Interface
import typings.node.readlineMod.Key
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  /**
    * Observes a readline-object.
    *
    * @param readline
    * The readline-object to observe.
    */
  @scala.inline
  def apply(readline: Interface): Events = ^.asInstanceOf[js.Dynamic].apply(readline.asInstanceOf[js.Any]).asInstanceOf[Events]
  
  @JSImport("inquirer/lib/utils/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A set of events.
    */
  trait Events extends StObject {
    
    /**
      * The event-flow of the `aKey`-event.
      */
    var aKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `iKey`-event.
      */
    var iKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `keypress`-event of the readline-object.
      */
    var keypress: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `line`-event of the readline-object.
      */
    var line: Observable_[String]
    
    /**
      * The event-flow of the `normalizedDownKey`-event.
      */
    var normalizedDownKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `normalizedUpKey`-event.
      */
    var normalizedUpKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `numberKey`-event.
      */
    var numberKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `spaceKey`-event.
      */
    var spaceKey: Observable_[KeyDescriptor]
  }
  object Events {
    
    @scala.inline
    def apply(
      aKey: Observable_[KeyDescriptor],
      iKey: Observable_[KeyDescriptor],
      keypress: Observable_[KeyDescriptor],
      line: Observable_[String],
      normalizedDownKey: Observable_[KeyDescriptor],
      normalizedUpKey: Observable_[KeyDescriptor],
      numberKey: Observable_[KeyDescriptor],
      spaceKey: Observable_[KeyDescriptor]
    ): Events = {
      val __obj = js.Dynamic.literal(aKey = aKey.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], normalizedDownKey = normalizedDownKey.asInstanceOf[js.Any], normalizedUpKey = normalizedUpKey.asInstanceOf[js.Any], numberKey = numberKey.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "aKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "iKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeypress(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Observable_[String]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizedDownKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "normalizedDownKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizedUpKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "normalizedUpKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "numberKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "spaceKey", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides a description about a key.
    */
  trait KeyDescriptor extends StObject {
    
    /**
      * Thedescription of the key.
      */
    var key: Key
    
    /**
      * The value of the key.
      */
    var value: String
  }
  object KeyDescriptor {
    
    @scala.inline
    def apply(key: Key, value: String): KeyDescriptor = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDescriptor]
    }
    
    @scala.inline
    implicit class KeyDescriptorMutableBuilder[Self <: KeyDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

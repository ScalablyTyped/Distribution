package typings.inquirer

import typings.node.readlineMod.Interface
import typings.node.readlineMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("inquirer/lib/utils/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(readline: Interface): Events = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(readline.asInstanceOf[js.Any]).asInstanceOf[Events]
  
  /**
    * A set of events.
    */
  trait Events extends StObject {
    
    /**
      * The event-flow of the `aKey`-event.
      */
    var aKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
    
    /**
      * The event-flow of the `iKey`-event.
      */
    var iKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
    
    /**
      * The event-flow of the `keypress`-event of the {@link ReadlineInterface `readline.Interface`}-object.
      */
    var keypress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
    
    /**
      * The event-flow of the `line`-event of the {@link ReadlineInterface `readline.Interface`}-object.
      */
    var line: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<string> */ Any
    
    /**
      * The event-flow of the `normalizedDownKey`-event.
      */
    var normalizedDownKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
    
    /**
      * The event-flow of the `normalizedUpKey`-event.
      */
    var normalizedUpKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
    
    /**
      * The event-flow of the `numberKey`-event.
      */
    var numberKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
    
    /**
      * The event-flow of the `spaceKey`-event.
      */
    var spaceKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
  }
  object Events {
    
    inline def apply(
      aKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any,
      iKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any,
      keypress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any,
      line: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<string> */ Any,
      normalizedDownKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any,
      normalizedUpKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any,
      numberKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any,
      spaceKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
    ): Events = {
      val __obj = js.Dynamic.literal(aKey = aKey.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], normalizedDownKey = normalizedDownKey.asInstanceOf[js.Any], normalizedUpKey = normalizedUpKey.asInstanceOf[js.Any], numberKey = numberKey.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setAKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
      ): Self = StObject.set(x, "aKey", value.asInstanceOf[js.Any])
      
      inline def setIKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
      ): Self = StObject.set(x, "iKey", value.asInstanceOf[js.Any])
      
      inline def setKeypress(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
      ): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      inline def setLine(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<string> */ Any
      ): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setNormalizedDownKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
      ): Self = StObject.set(x, "normalizedDownKey", value.asInstanceOf[js.Any])
      
      inline def setNormalizedUpKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
      ): Self = StObject.set(x, "normalizedUpKey", value.asInstanceOf[js.Any])
      
      inline def setNumberKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
      ): Self = StObject.set(x, "numberKey", value.asInstanceOf[js.Any])
      
      inline def setSpaceKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<KeyDescriptor> */ Any
      ): Self = StObject.set(x, "spaceKey", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides a description about a key.
    */
  trait KeyDescriptor extends StObject {
    
    /**
      * The description of the key.
      */
    var key: Key
    
    /**
      * The value of the key.
      */
    var value: String
  }
  object KeyDescriptor {
    
    inline def apply(key: Key, value: String): KeyDescriptor = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDescriptor]
    }
    
    extension [Self <: KeyDescriptor](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

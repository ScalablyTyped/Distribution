package typings.jupyterlabServices

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.libEventMod.Event.Request
import typings.jupyterlabServices.libEventMod.Event.Stream
import typings.jupyterlabServices.libEventMod.EventManager.IOptions
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventMod {
  
  @JSImport("@jupyterlab/services/lib/event", "EventManager")
  @js.native
  /**
    * Create a new event manager.
    */
  open class EventManager ()
    extends StObject
       with IDisposable {
    def this(options: IOptions) = this()
    
    /* private */ var _isDisabled: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _poll: Any = js.native
    
    /* private */ var _socket: Any = js.native
    
    /* private */ var _stream: Any = js.native
    
    /**
      * Subscribe to event bus emissions.
      */
    /* private */ var _subscribe: Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Post an event request to be emitted by the event bus.
      */
    def emit(event: Request): js.Promise[Unit] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether the event manager is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MEventManager: Boolean = js.native
    
    /**
      * The server settings used to make API requests.
      */
    val serverSettings: ISettings = js.native
    
    /**
      * An event stream that emits and yields each new event.
      */
    def stream: Stream = js.native
  }
  object EventManager {
    
    /**
      * The instantiation options for an event manager.
      */
    trait IOptions extends StObject {
      
      /**
        * The server settings used to make API requests.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  object Event {
    
    /**
      * The event emission type.
      */
    trait Emission
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      var schema_id: String
    }
    object Emission {
      
      inline def apply(schema_id: String): Emission = {
        val __obj = js.Dynamic.literal(schema_id = schema_id.asInstanceOf[js.Any])
        __obj.asInstanceOf[Emission]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Emission] (val x: Self) extends AnyVal {
        
        inline def setSchema_id(value: String): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The interface for the event bus front-end.
      */
    type IManager = EventManager
    
    /**
      * An object that is both a signal and an async iterable.
      */
    @js.native
    trait IStream[T, U]
      extends StObject
         with ISignal[T, U]
         with AsyncIterable[U]
    
    /**
      * The event request type.
      */
    trait Request extends StObject {
      
      var data: StringDictionary[Any]
      
      var schema_id: String
      
      var version: String
    }
    object Request {
      
      inline def apply(data: StringDictionary[Any], schema_id: String, version: String): Request = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setSchema_id(value: String): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An event stream with the characteristics of a signal and an async iterator.
      */
    type Stream = IStream[IManager, Emission]
  }
}

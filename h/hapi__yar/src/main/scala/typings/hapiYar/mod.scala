package typings.hapiYar

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hapiCatbox.mod.Id
import typings.hapiHapi.mod.CachePolicyOptions
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.ResponseToolkit
import typings.hapiYar.anon.ClearInvalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/yar", JSImport.Namespace)
  @js.native
  val ^ : Plugin[YarOptions] = js.native
  
  trait ServerYar extends StObject {
    
    def revoke(id: Id): js.Promise[Unit]
  }
  object ServerYar {
    
    inline def apply(revoke: Id => js.Promise[Unit]): ServerYar = {
      val __obj = js.Dynamic.literal(revoke = js.Any.fromFunction1(revoke))
      __obj.asInstanceOf[ServerYar]
    }
    
    extension [Self <: ServerYar](x: Self) {
      
      inline def setRevoke(value: Id => js.Promise[Unit]): Self = StObject.set(x, "revoke", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Yar extends StObject {
    
    /**
      * clears key.
      */
    def clear(key: String): Unit = js.native
    
    /**
      * used to manually prepare the session state and commit it into the response when the response is taken
      * over in an onPreResponse handler. Normally, the yar onPreRespinse handler performs the commit, but if
      * an application extension handler takes over, yar doesn't get a chance to commit the state before the
      * response goes out. The method requires the hapi h toolkit argument available in the extension handler.
      */
    def commit(h: ResponseToolkit[ReqRefDefaults]): js.Promise[Unit] = js.native
    
    /**
      * stores volatile data - data that should be deleted once read.
      * When given no arguments, it will return all of the flash messages and delete the originals.
      * When given only a type, it will return all of the flash messages of that type and delete the originals.
      * When given a type and a message, it will set or append that message to the given type.
      * 'isOverride' used to indicate that the message provided should replace
      * any existing value instead of being appended to it (defaults to false).
      */
    def flash(): js.Array[Any] = js.native
    def flash(`type`: String): js.Array[Any] = js.native
    def flash(`type`: String, message: Any): js.Array[Any] = js.native
    def flash(`type`: String, message: Any, isOverride: Boolean): js.Array[Any] = js.native
    def flash(`type`: String, message: Unit, isOverride: Boolean): js.Array[Any] = js.native
    def flash(`type`: Unit, message: Any): js.Array[Any] = js.native
    def flash(`type`: Unit, message: Any, isOverride: Boolean): js.Array[Any] = js.native
    def flash(`type`: Unit, message: Unit, isOverride: Boolean): js.Array[Any] = js.native
    
    /**
      * retrieve value using a key. If 'clear' is 'true', key is cleared on return.
      */
    def get(key: String): Any = js.native
    def get(key: String, clear: Boolean): Any = js.native
    
    /**
      * Session id, see `customSessionIDGenerator`.
      */
    val id: String = js.native
    
    /**
      * if set to 'true', enables lazy mode.
      * In lazy mode, request.yar can be modified directly (e.g. setting request.yar.myKey to an object value),
      * and those keys will be stored and loaded back.
      * Lazy mode isn't as fast as the normal get/set because
      * it has to store the session state on every responses regardless of any changes being made.
      */
    def `lazy`(enabled: Boolean): Unit = js.native
    
    /**
      * clears the session and assigns a new session id.
      */
    def reset(): Unit = js.native
    
    /**
      * - assigns a value (string, object, etc) to a given key which will persist across requests. Returns the value.
      */
    def set[T](key: String, value: T): T = js.native
    /**
      *  assigns values to multiple keys using each 'keysObject' top-level property. Returns the keysObject.
      */
    def set[T /* <: StringDictionary[Any] */](keysObject: T): T = js.native
    
    /**
      * Manually notify the session of changes (when using get()
      * and changing the content of the returned reference directly without calling set()).
      */
    def touch(): Unit = js.native
  }
  
  trait YarOptions extends StObject {
    
    /**
      * hapi cache options which includes (among other options):
      */
    var cache: js.UndefOr[CachePolicyOptions[Any]] = js.undefined
    
    /**
      * the configuration for cookie-specific features:
      */
    var cookieOptions: ClearInvalid
    
    /**
      * will cause yar to throw an exception if trying to persist to cache when the cache is unavailable.
      * Setting this to false will allow applications using yar to run uninterrupted if the cache is not ready (however sessions will not be saving).
      * Defaults to true.
      */
    var errorOnCacheNotReady: js.UndefOr[Boolean] = js.undefined
    
    /**
      * maximum cookie size before using server-side storage.
      * Defaults to 1K. Set to zero to always use server-side storage.
      */
    var maxCookieSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines the name of the cookie used to store session information.
      * Defaults to session.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * determines whether to store empty session before they've been modified.
      * Defaults to true.
      */
    var storeBlank: js.UndefOr[Boolean] = js.undefined
  }
  object YarOptions {
    
    inline def apply(cookieOptions: ClearInvalid): YarOptions = {
      val __obj = js.Dynamic.literal(cookieOptions = cookieOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[YarOptions]
    }
    
    extension [Self <: YarOptions](x: Self) {
      
      inline def setCache(value: CachePolicyOptions[Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCookieOptions(value: ClearInvalid): Self = StObject.set(x, "cookieOptions", value.asInstanceOf[js.Any])
      
      inline def setErrorOnCacheNotReady(value: Boolean): Self = StObject.set(x, "errorOnCacheNotReady", value.asInstanceOf[js.Any])
      
      inline def setErrorOnCacheNotReadyUndefined: Self = StObject.set(x, "errorOnCacheNotReady", js.undefined)
      
      inline def setMaxCookieSize(value: Double): Self = StObject.set(x, "maxCookieSize", value.asInstanceOf[js.Any])
      
      inline def setMaxCookieSizeUndefined: Self = StObject.set(x, "maxCookieSize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStoreBlank(value: Boolean): Self = StObject.set(x, "storeBlank", value.asInstanceOf[js.Any])
      
      inline def setStoreBlankUndefined: Self = StObject.set(x, "storeBlank", js.undefined)
    }
  }
  
  type _To = Plugin[YarOptions]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[YarOptions] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait Request extends StObject {
      
      var yar: Yar
    }
    object Request {
      
      inline def apply(yar: Yar): Request = {
        val __obj = js.Dynamic.literal(yar = yar.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setYar(value: Yar): Self = StObject.set(x, "yar", value.asInstanceOf[js.Any])
      }
    }
    
    trait Server extends StObject {
      
      var yar: ServerYar
    }
    object Server {
      
      inline def apply(yar: ServerYar): Server = {
        val __obj = js.Dynamic.literal(yar = yar.asInstanceOf[js.Any])
        __obj.asInstanceOf[Server]
      }
      
      extension [Self <: Server](x: Self) {
        
        inline def setYar(value: ServerYar): Self = StObject.set(x, "yar", value.asInstanceOf[js.Any])
      }
    }
  }
}

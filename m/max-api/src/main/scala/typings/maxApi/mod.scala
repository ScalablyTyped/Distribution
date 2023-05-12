package typings.maxApi

import org.scalablytyped.runtime.StringDictionary
import typings.maxApi.mod.MaxAPIStatic.Anything
import typings.maxApi.mod.MaxAPIStatic.MaxFunctionHandler
import typings.maxApi.mod.MaxAPIStatic.MaxFunctionSelector
import typings.maxApi.mod.MaxAPIStatic.POST_LEVELS
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("max-api", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /** Enum options for the value Node For Max will set on process.env.MAX_ENV */
    @JSImport("max-api", "default.MAX_ENV")
    @js.native
    object MAX_ENV extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.maxApi.mod.MaxAPIStatic.MAX_ENV & String] = js.native
      
      /* "max" */ val MAX: typings.maxApi.mod.MaxAPIStatic.MAX_ENV.MAX & String = js.native
      
      /* "maxforlive" */ val MAX_FOR_LIVE: typings.maxApi.mod.MaxAPIStatic.MAX_ENV.MAX_FOR_LIVE & String = js.native
      
      /* "max:standalone" */ val STANDALONE: typings.maxApi.mod.MaxAPIStatic.MAX_ENV.STANDALONE & String = js.native
    }
    
    /** Predefined generic MaxFunctionSelector types */
    @JSImport("max-api", "default.MESSAGE_TYPES")
    @js.native
    object MESSAGE_TYPES extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.maxApi.mod.MaxAPIStatic.MESSAGE_TYPES & String] = js.native
      
      /* "all" */ val ALL: typings.maxApi.mod.MaxAPIStatic.MESSAGE_TYPES.ALL & String = js.native
      
      /* "bang" */ val BANG: typings.maxApi.mod.MaxAPIStatic.MESSAGE_TYPES.BANG & String = js.native
      
      /* "dict" */ val DICT: typings.maxApi.mod.MaxAPIStatic.MESSAGE_TYPES.DICT & String = js.native
      
      /* "list" */ val LIST: typings.maxApi.mod.MaxAPIStatic.MESSAGE_TYPES.LIST & String = js.native
      
      /* "number" */ val NUMBER: typings.maxApi.mod.MaxAPIStatic.MESSAGE_TYPES.NUMBER & String = js.native
    }
    
    /** Log Levels used in maxAPI.post */
    @JSImport("max-api", "default.POST_LEVELS")
    @js.native
    object POST_LEVELS extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.maxApi.mod.MaxAPIStatic.POST_LEVELS & String] = js.native
      
      /* "error" */ val ERROR: typings.maxApi.mod.MaxAPIStatic.POST_LEVELS.ERROR & String = js.native
      
      /* "info" */ val INFO: typings.maxApi.mod.MaxAPIStatic.POST_LEVELS.INFO & String = js.native
      
      /* "warn" */ val WARN: typings.maxApi.mod.MaxAPIStatic.POST_LEVELS.WARN & String = js.native
    }
    
    // Handlers
    /** Register a single handler */
    inline def addHandler(selector: MaxFunctionSelector, handler: MaxFunctionHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Register handlers */
    inline def addHandlers(handlers: Record[MaxFunctionSelector, MaxFunctionHandler]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // Dictionaries
    /** Get the value of a dict object */
    inline def getDict(id: String): js.Promise[JSONObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDict")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONObject]]
    
    // Outlet
    /** Outlet any values */
    inline def outlet(args: JSONValue*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("outlet")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
    
    /** Outlet a Bang */
    inline def outletBang(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("outletBang")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Post to the Max console. Setting the last argument to a value of maxAPI.POST_LEVELS allows control of the log level
      */
    inline def post(args: (Anything | POST_LEVELS)*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
    
    /** Remove a single handler */
    inline def removeHandler(selector: MaxFunctionSelector, handler: MaxFunctionHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHandler")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Remove handlers */
    inline def removeHandlers(selector: MaxFunctionSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHandlers")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Set the value of a dict object */
    inline def setDict(id: String, dict: JSONObject): js.Promise[JSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDict")(id.asInstanceOf[js.Any], dict.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONObject]]
    
    /** Partially update the value of a dict object at a given path */
    inline def updateDict(id: String, updatePath: String, updateValue: JSONValue): js.Promise[JSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDict")(id.asInstanceOf[js.Any], updatePath.asInstanceOf[js.Any], updateValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONObject]]
  }
  
  object MaxAPIStatic {
    
    @js.native
    sealed trait MAX_ENV extends StObject
    /** Enum options for the value Node For Max will set on process.env.MAX_ENV */
    @JSImport("max-api", "MaxAPIStatic.MAX_ENV")
    @js.native
    object MAX_ENV extends StObject {
      
      /** node.script running from within Max */
      @js.native
      sealed trait MAX
        extends StObject
           with MAX_ENV
      
      /** node.script running from within Max For Live */
      @js.native
      sealed trait MAX_FOR_LIVE
        extends StObject
           with MAX_ENV
      
      /** node.script running from within a standalone application */
      @js.native
      sealed trait STANDALONE
        extends StObject
           with MAX_ENV
    }
    
    @js.native
    sealed trait MESSAGE_TYPES extends StObject
    /** Predefined generic MaxFunctionSelector types */
    @JSImport("max-api", "MaxAPIStatic.MESSAGE_TYPES")
    @js.native
    object MESSAGE_TYPES extends StObject {
      
      /** Generic Type for *all* kinds of messages */
      @js.native
      sealed trait ALL
        extends StObject
           with MESSAGE_TYPES
      
      /** Bang message type */
      @js.native
      sealed trait BANG
        extends StObject
           with MESSAGE_TYPES
      
      /** Dictionary message type */
      @js.native
      sealed trait DICT
        extends StObject
           with MESSAGE_TYPES
      
      /** List message type */
      @js.native
      sealed trait LIST
        extends StObject
           with MESSAGE_TYPES
      
      /** Number message type */
      @js.native
      sealed trait NUMBER
        extends StObject
           with MESSAGE_TYPES
    }
    
    @js.native
    sealed trait POST_LEVELS extends StObject
    /** Log Levels used in maxAPI.post */
    @JSImport("max-api", "MaxAPIStatic.POST_LEVELS")
    @js.native
    object POST_LEVELS extends StObject {
      
      /** error level messages */
      @js.native
      sealed trait ERROR
        extends StObject
           with POST_LEVELS
      
      /** info level messages */
      @js.native
      sealed trait INFO
        extends StObject
           with POST_LEVELS
      
      /** warn level messages */
      @js.native
      sealed trait WARN
        extends StObject
           with POST_LEVELS
    }
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Anything = string | number | std.Array<string | number> | max-api.max-api.JSONObject | max-api.max-api.JSONArray
    }}}
    to avoid circular code involving: 
    - max-api.max-api.JSONArray
    - max-api.max-api.JSONValue
    - max-api.max-api.MaxAPIStatic.Anything
    */
    type Anything = String | Double | (js.Array[String | Double]) | JSONObject | Any
    
    @js.native
    trait MaxFunctionHandler extends StObject {
      
      def apply(args: Any*): Any = js.native
    }
    
    type MaxFunctionSelector = MESSAGE_TYPES | String
  }
  
  type JSONArray = js.Array[JSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONObject = {[key: string] : max-api.max-api.JSONValue | undefined}
  }}}
  to avoid circular code involving: 
  - max-api.max-api.JSONArray
  - max-api.max-api.JSONObject
  - max-api.max-api.JSONValue
  - max-api.max-api.MaxAPIStatic.Anything
  */
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[JSONValue]]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  type JSONPrimitive = String | Double | Boolean | Null
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = max-api.max-api.JSONPrimitive | max-api.max-api.JSONArray | max-api.max-api.JSONObject
  }}}
  to avoid circular code involving: 
  - max-api.max-api.JSONArray
  - max-api.max-api.JSONValue
  */
  type JSONValue = JSONPrimitive | Any | JSONObject
}

package typings.ipfsHttpGateway

import typings.debug.mod.Debugger
import typings.joi.mod.ObjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CopyWithin extends StObject {
    
    var copyWithin: Boolean
    
    var entries: Boolean
    
    var fill: Boolean
    
    var find: Boolean
    
    var findIndex: Boolean
    
    var keys: Boolean
    
    var values: Boolean
  }
  object CopyWithin {
    
    inline def apply(
      copyWithin: Boolean,
      entries: Boolean,
      fill: Boolean,
      find: Boolean,
      findIndex: Boolean,
      keys: Boolean,
      values: Boolean
    ): CopyWithin = {
      val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyWithin]
    }
    
    extension [Self <: CopyWithin](x: Self) {
      
      inline def setCopyWithin(value: Boolean): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFind(value: Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindIndex(value: Boolean): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined debug.debug.Debugger & {  error :debug.debug.Debugger} */
  @js.native
  trait DebuggererrorDebugger extends StObject {
    
    def apply(formatter: js.Any, args: js.Any*): Unit = js.native
    
    var color: String = js.native
    
    def destroy(): Boolean = js.native
    
    var enabled: Boolean = js.native
    
    def error(formatter: js.Any, args: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: Debugger = js.native
    
    def extend(namespace: String): Debugger = js.native
    def extend(namespace: String, delimiter: String): Debugger = js.native
    
    def log(args: js.Any*): js.Any = js.native
    
    var namespace: String = js.native
  }
  
  trait Ext extends StObject {
    
    var ext: OnPostHandler
    
    def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
    
    var response: Ranges
    
    var validate: Params
  }
  object Ext {
    
    inline def apply(
      ext: OnPostHandler,
      handler: (js.Any, js.Any) => js.Promise[js.Any],
      response: Ranges,
      validate: Params
    ): Ext = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], handler = js.Any.fromFunction2(handler), response = response.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ext]
    }
    
    extension [Self <: Ext](x: Self) {
      
      inline def setExt(value: OnPostHandler): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
      
      inline def setResponse(value: Ranges): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Params): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    def method(request: js.Any, h: js.Any): js.Any
  }
  object Method {
    
    inline def apply(method: (js.Any, js.Any) => js.Any): Method = {
      val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
    }
  }
  
  trait OnPostHandler extends StObject {
    
    var onPostHandler: Method
  }
  object OnPostHandler {
    
    inline def apply(onPostHandler: Method): OnPostHandler = {
      val __obj = js.Dynamic.literal(onPostHandler = onPostHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnPostHandler]
    }
    
    extension [Self <: OnPostHandler](x: Self) {
      
      inline def setOnPostHandler(value: Method): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var method: String
    
    var options: Ext
    
    var path: String
  }
  object Options {
    
    inline def apply(method: String, options: Ext, path: String): Options = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Ext): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: ObjectSchema[js.Any]
  }
  object Params {
    
    inline def apply(params: ObjectSchema[js.Any]): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setParams(value: ObjectSchema[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ranges extends StObject {
    
    var ranges: Boolean
  }
  object Ranges {
    
    inline def apply(ranges: Boolean): Ranges = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ranges]
    }
    
    extension [Self <: Ranges](x: Self) {
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    }
  }
}

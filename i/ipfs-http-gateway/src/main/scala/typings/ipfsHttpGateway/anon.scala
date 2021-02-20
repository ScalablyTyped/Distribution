package typings.ipfsHttpGateway

import typings.debug.mod.Debugger
import typings.joi.mod.ObjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CopyWithin extends StObject {
    
    var copyWithin: Boolean = js.native
    
    var entries: Boolean = js.native
    
    var fill: Boolean = js.native
    
    var find: Boolean = js.native
    
    var findIndex: Boolean = js.native
    
    var keys: Boolean = js.native
    
    var values: Boolean = js.native
  }
  object CopyWithin {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CopyWithinMutableBuilder[Self <: CopyWithin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyWithin(value: Boolean): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind(value: Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindIndex(value: Boolean): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait Ext extends StObject {
    
    var ext: OnPostHandler = js.native
    
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    var response: Ranges = js.native
    
    var validate: Params = js.native
  }
  object Ext {
    
    @scala.inline
    def apply(ext: OnPostHandler, handler: (js.Any, js.Any) => js.Promise[_], response: Ranges, validate: Params): Ext = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], handler = js.Any.fromFunction2(handler), response = response.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ext]
    }
    
    @scala.inline
    implicit class ExtMutableBuilder[Self <: Ext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExt(value: OnPostHandler): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResponse(value: Ranges): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: Params): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Method extends StObject {
    
    def method(request: js.Any, h: js.Any): js.Any = js.native
  }
  object Method {
    
    @scala.inline
    def apply(method: (js.Any, js.Any) => js.Any): Method = {
      val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OnPostHandler extends StObject {
    
    var onPostHandler: Method = js.native
  }
  object OnPostHandler {
    
    @scala.inline
    def apply(onPostHandler: Method): OnPostHandler = {
      val __obj = js.Dynamic.literal(onPostHandler = onPostHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnPostHandler]
    }
    
    @scala.inline
    implicit class OnPostHandlerMutableBuilder[Self <: OnPostHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPostHandler(value: Method): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var method: String = js.native
    
    var options: Ext = js.native
    
    var path: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(method: String, options: Ext, path: String): Options = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Ext): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Params extends StObject {
    
    var params: ObjectSchema[_] = js.native
  }
  object Params {
    
    @scala.inline
    def apply(params: ObjectSchema[_]): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: ObjectSchema[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ranges extends StObject {
    
    var ranges: Boolean = js.native
  }
  object Ranges {
    
    @scala.inline
    def apply(ranges: Boolean): Ranges = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ranges]
    }
    
    @scala.inline
    implicit class RangesMutableBuilder[Self <: Ranges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    }
  }
}

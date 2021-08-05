package typings.levelup

import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorValueCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear extends StObject {
    
    def clear(
      options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
      callback: ErrorCallback
    ): Unit
  }
  object Clear {
    
    inline def apply(
      clear: (/* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
    ): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction2(clear))
      __obj.asInstanceOf[Clear]
    }
    
    extension [Self <: Clear](x: Self) {
      
      inline def setClear(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
      ): Self = StObject.set(x, "clear", js.Any.fromFunction2(value))
    }
  }
  
  trait Del extends StObject {
    
    def del(
      key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
      options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
      callback: ErrorCallback
    ): Unit
  }
  object Del {
    
    inline def apply(
      del: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
    ): Del = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction3(del))
      __obj.asInstanceOf[Del]
    }
    
    extension [Self <: Del](x: Self) {
      
      inline def setDel(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
      ): Self = StObject.set(x, "del", js.Any.fromFunction3(value))
    }
  }
  
  trait Get extends StObject {
    
    def get(
      key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
      options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
      callback: ErrorValueCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
        ]
    ): Unit
  }
  object Get {
    
    inline def apply(
      get: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
        ]) => Unit
    ): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
              /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
    }
  }
  
  trait Put extends StObject {
    
    def put(
      key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any,
      options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
      cb: js.Any
    ): Unit
  }
  object Put {
    
    inline def apply(
      put: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Unit
    ): Put = {
      val __obj = js.Dynamic.literal(put = js.Any.fromFunction4(put))
      __obj.asInstanceOf[Put]
    }
    
    extension [Self <: Put](x: Self) {
      
      inline def setPut(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Unit
      ): Self = StObject.set(x, "put", js.Any.fromFunction4(value))
    }
  }
}

package typings.levelup

import org.scalablytyped.runtime.Instantiable0
import typings.abstractLeveldown.mod.ErrorValueCallback
import typings.levelErrors.mod.InitializationError
import typings.levelErrors.mod.LevelUPError
import typings.levelErrors.mod.NotFoundError
import typings.levelErrors.mod.OpenError
import typings.levelErrors.mod.ReadError
import typings.levelErrors.mod.WriteError
import typings.std.ErrorCallback
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
  
  trait EncodingError extends StObject {
    
    var EncodingError: Instantiable0[typings.levelErrors.mod.EncodingError]
    
    var InitializationError: Instantiable0[typings.levelErrors.mod.InitializationError]
    
    var LevelUPError: Instantiable0[typings.levelErrors.mod.LevelUPError]
    
    var NotFoundError: Instantiable0[typings.levelErrors.mod.NotFoundError]
    
    var OpenError: Instantiable0[typings.levelErrors.mod.OpenError]
    
    var ReadError: Instantiable0[typings.levelErrors.mod.ReadError]
    
    var WriteError: Instantiable0[typings.levelErrors.mod.WriteError]
  }
  object EncodingError {
    
    inline def apply(
      EncodingError: Instantiable0[typings.levelErrors.mod.EncodingError],
      InitializationError: Instantiable0[InitializationError],
      LevelUPError: Instantiable0[LevelUPError],
      NotFoundError: Instantiable0[NotFoundError],
      OpenError: Instantiable0[OpenError],
      ReadError: Instantiable0[ReadError],
      WriteError: Instantiable0[WriteError]
    ): EncodingError = {
      val __obj = js.Dynamic.literal(EncodingError = EncodingError.asInstanceOf[js.Any], InitializationError = InitializationError.asInstanceOf[js.Any], LevelUPError = LevelUPError.asInstanceOf[js.Any], NotFoundError = NotFoundError.asInstanceOf[js.Any], OpenError = OpenError.asInstanceOf[js.Any], ReadError = ReadError.asInstanceOf[js.Any], WriteError = WriteError.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingError]
    }
    
    extension [Self <: EncodingError](x: Self) {
      
      inline def setEncodingError(value: Instantiable0[typings.levelErrors.mod.EncodingError]): Self = StObject.set(x, "EncodingError", value.asInstanceOf[js.Any])
      
      inline def setInitializationError(value: Instantiable0[InitializationError]): Self = StObject.set(x, "InitializationError", value.asInstanceOf[js.Any])
      
      inline def setLevelUPError(value: Instantiable0[LevelUPError]): Self = StObject.set(x, "LevelUPError", value.asInstanceOf[js.Any])
      
      inline def setNotFoundError(value: Instantiable0[NotFoundError]): Self = StObject.set(x, "NotFoundError", value.asInstanceOf[js.Any])
      
      inline def setOpenError(value: Instantiable0[OpenError]): Self = StObject.set(x, "OpenError", value.asInstanceOf[js.Any])
      
      inline def setReadError(value: Instantiable0[ReadError]): Self = StObject.set(x, "ReadError", value.asInstanceOf[js.Any])
      
      inline def setWriteError(value: Instantiable0[WriteError]): Self = StObject.set(x, "WriteError", value.asInstanceOf[js.Any])
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
  
  trait GetMany extends StObject {
    
    def getMany(
      keys: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any
        ],
      options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
      callback: ErrorValueCallback[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
          ]
        ]
    ): Unit
  }
  object GetMany {
    
    inline def apply(
      getMany: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
          ]
        ]) => Unit
    ): GetMany = {
      val __obj = js.Dynamic.literal(getMany = js.Any.fromFunction3(getMany))
      __obj.asInstanceOf[GetMany]
    }
    
    extension [Self <: GetMany](x: Self) {
      
      inline def setGetMany(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
              js.Array[
                /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
              ]
            ]) => Unit
      ): Self = StObject.set(x, "getMany", js.Any.fromFunction3(value))
    }
  }
  
  trait Put extends StObject {
    
    def put(
      key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any,
      options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
      cb: Any
    ): Unit
  }
  object Put {
    
    inline def apply(
      put: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, Any) => Unit
    ): Put = {
      val __obj = js.Dynamic.literal(put = js.Any.fromFunction4(put))
      __obj.asInstanceOf[Put]
    }
    
    extension [Self <: Put](x: Self) {
      
      inline def setPut(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, Any) => Unit
      ): Self = StObject.set(x, "put", js.Any.fromFunction4(value))
    }
  }
}

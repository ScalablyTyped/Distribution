package typings.i18nextFsBackend

import typings.i18next.mod.BackendModule
import typings.i18next.mod.InitOptions
import typings.i18next.mod.ModuleType
import typings.i18next.mod.ReadCallback
import typings.i18next.mod.Services
import typings.i18nextFsBackend.i18nextFsBackendStrings.backend
import typings.i18nextFsBackend.mod.i18nextFsBackend.i18nextFsBackendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-fs-backend", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Backend {
    def this(services: Services, backendOptions: i18nextFsBackendOptions, i18nextOptions: InitOptions) = this()
    
    /* CompleteClass */
    @JSName("create")
    override def create_MBackend(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
    
    /* CompleteClass */
    override def init(services: Services, backendOptions: i18nextFsBackendOptions, i18nextOptions: InitOptions): Unit = js.native
    
    /* CompleteClass */
    override def queue(lng: String, namespace: String, key: String, fallbackValue: String, callback: Any): Unit = js.native
    
    /* CompleteClass */
    override def read(language: String, namespace: String, callback: ReadCallback): Unit = js.native
    
    /* CompleteClass */
    var `type`: ModuleType = js.native
    /* CompleteClass */
    @JSName("type")
    var type_Backend: backend = js.native
    /* CompleteClass */
    @JSName("type")
    var type_BackendModule: typings.i18next.i18nextStrings.backend = js.native
    
    /* CompleteClass */
    override def write(): Unit = js.native
    
    /* CompleteClass */
    override def writeFile(lng: String, namespace: String): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("i18next-fs-backend", "default.type")
    @js.native
    val `type`: backend = js.native
  }
  
  trait Backend
    extends StObject
       with BackendModule[i18nextFsBackendOptions] {
    
    @JSName("create")
    def create_MBackend(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit
    
    def queue(lng: String, namespace: String, key: String, fallbackValue: String, callback: Any): Unit
    
    @JSName("type")
    var type_Backend: backend
    
    def write(): Unit
    
    def writeFile(lng: String, namespace: String): Unit
  }
  object Backend {
    
    inline def apply(
      create: (js.Array[String], String, String, String) => Unit,
      init: (Services, i18nextFsBackendOptions, InitOptions) => Unit,
      queue: (String, String, String, String, Any) => Unit,
      read: (String, String, ReadCallback) => Unit,
      write: () => Unit,
      writeFile: (String, String) => Unit
    ): Backend = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), init = js.Any.fromFunction3(init), queue = js.Any.fromFunction5(queue), read = js.Any.fromFunction3(read), write = js.Any.fromFunction0(write), writeFile = js.Any.fromFunction2(writeFile))
      __obj.updateDynamic("type")("backend")
      __obj.asInstanceOf[Backend]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (js.Array[String], String, String, String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      inline def setQueue(value: (String, String, String, String, Any) => Unit): Self = StObject.set(x, "queue", js.Any.fromFunction5(value))
      
      inline def setType(value: backend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: () => Unit): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      
      inline def setWriteFile(value: (String, String) => Unit): Self = StObject.set(x, "writeFile", js.Any.fromFunction2(value))
    }
  }
  
  object i18next {
    
    trait InitOptions extends StObject {
      
      var backend: js.UndefOr[i18nextFsBackendOptions] = js.undefined
    }
    object InitOptions {
      
      inline def apply(): typings.i18nextFsBackend.mod.i18next.InitOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.i18nextFsBackend.mod.i18next.InitOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.i18nextFsBackend.mod.i18next.InitOptions] (val x: Self) extends AnyVal {
        
        inline def setBackend(value: i18nextFsBackendOptions): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
        
        inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      }
    }
  }
  
  object i18nextFsBackend {
    
    trait i18nextFsBackendOptions extends StObject {
      
      var addPath: js.UndefOr[String] = js.undefined
      
      var ident: js.UndefOr[Double] = js.undefined
      
      var loadPath: js.UndefOr[String | loadPathFunction] = js.undefined
      
      var parse: js.UndefOr[js.Function1[/* data */ String, Any]] = js.undefined
      
      var stringify: js.UndefOr[js.Function1[/* data */ Any, String]] = js.undefined
    }
    object i18nextFsBackendOptions {
      
      inline def apply(): i18nextFsBackendOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[i18nextFsBackendOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: i18nextFsBackendOptions] (val x: Self) extends AnyVal {
        
        inline def setAddPath(value: String): Self = StObject.set(x, "addPath", value.asInstanceOf[js.Any])
        
        inline def setAddPathUndefined: Self = StObject.set(x, "addPath", js.undefined)
        
        inline def setIdent(value: Double): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
        
        inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
        
        inline def setLoadPath(value: String | loadPathFunction): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
        
        inline def setLoadPathFunction2(value: (/* language */ String, /* namespace */ String) => String): Self = StObject.set(x, "loadPath", js.Any.fromFunction2(value))
        
        inline def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
        
        inline def setParse(value: /* data */ String => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
        
        inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
        
        inline def setStringify(value: /* data */ Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
        
        inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      }
    }
    
    type loadPathFunction = js.Function2[/* language */ String, /* namespace */ String, String]
  }
}

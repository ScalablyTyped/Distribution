package typings.i18nextFsBackend

import typings.i18next.mod.BackendModule
import typings.i18next.mod.InitOptions
import typings.i18next.mod.ReadCallback
import typings.i18next.mod.Services
import typings.i18nextFsBackend.i18nextFsBackendStrings.backend
import typings.i18nextFsBackend.mod.i18nextFsBackend.i18nextFsBackendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-fs-backend", JSImport.Default)
  @js.native
  class default protected () extends Backend {
    def this(services: Services, backendOptions: i18nextFsBackendOptions, i18nextOptions: InitOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("i18next-fs-backend", "default.type")
    @js.native
    val `type`: backend = js.native
  }
  
  @js.native
  trait Backend extends BackendModule[i18nextFsBackendOptions] {
    
    def queue(lng: String, namespace: String, key: String, fallbackValue: String, callback: js.Any): Unit = js.native
    
    @JSName("type")
    var type_Backend: backend = js.native
    
    def write(): Unit = js.native
    
    def writeFile(lng: String, namespace: String): Unit = js.native
  }
  object Backend {
    
    @scala.inline
    def apply(
      create: (js.Array[String], String, String, String) => Unit,
      init: (Services, i18nextFsBackendOptions, InitOptions) => Unit,
      queue: (String, String, String, String, js.Any) => Unit,
      read: (String, String, ReadCallback) => Unit,
      `type`: backend,
      write: () => Unit,
      writeFile: (String, String) => Unit
    ): Backend = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), init = js.Any.fromFunction3(init), queue = js.Any.fromFunction5(queue), read = js.Any.fromFunction3(read), write = js.Any.fromFunction0(write), writeFile = js.Any.fromFunction2(writeFile))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Backend]
    }
    
    @scala.inline
    implicit class BackendMutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueue(value: (String, String, String, String, js.Any) => Unit): Self = StObject.set(x, "queue", js.Any.fromFunction5(value))
      
      @scala.inline
      def setType(value: backend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: () => Unit): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWriteFile(value: (String, String) => Unit): Self = StObject.set(x, "writeFile", js.Any.fromFunction2(value))
    }
  }
  
  object i18next {
    
    @js.native
    trait InitOptions extends StObject {
      
      var backend: js.UndefOr[i18nextFsBackendOptions] = js.native
    }
    object InitOptions {
      
      @scala.inline
      def apply(): typings.i18nextFsBackend.mod.i18next.InitOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.i18nextFsBackend.mod.i18next.InitOptions]
      }
      
      @scala.inline
      implicit class InitOptionsMutableBuilder[Self <: typings.i18nextFsBackend.mod.i18next.InitOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackend(value: i18nextFsBackendOptions): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      }
    }
  }
  
  object i18nextFsBackend {
    
    @js.native
    trait i18nextFsBackendOptions extends StObject {
      
      var addPath: js.UndefOr[String] = js.native
      
      var ident: js.UndefOr[Double] = js.native
      
      var loadPath: js.UndefOr[String | loadPathFunction] = js.native
      
      var parse: js.UndefOr[js.Function1[/* data */ String, _]] = js.native
      
      var stringify: js.UndefOr[js.Function1[/* data */ js.Any, String]] = js.native
    }
    object i18nextFsBackendOptions {
      
      @scala.inline
      def apply(): i18nextFsBackendOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[i18nextFsBackendOptions]
      }
      
      @scala.inline
      implicit class i18nextFsBackendOptionsMutableBuilder[Self <: i18nextFsBackendOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddPath(value: String): Self = StObject.set(x, "addPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddPathUndefined: Self = StObject.set(x, "addPath", js.undefined)
        
        @scala.inline
        def setIdent(value: Double): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
        
        @scala.inline
        def setLoadPath(value: String | loadPathFunction): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadPathFunction2(value: (/* language */ String, /* namespace */ String) => String): Self = StObject.set(x, "loadPath", js.Any.fromFunction2(value))
        
        @scala.inline
        def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
        
        @scala.inline
        def setParse(value: /* data */ String => _): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
        
        @scala.inline
        def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
        
        @scala.inline
        def setStringify(value: /* data */ js.Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      }
    }
    
    type loadPathFunction = js.Function2[/* language */ String, /* namespace */ String, String]
  }
}

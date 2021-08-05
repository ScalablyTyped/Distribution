package typings.i18next.mod

import typings.i18next.i18nextStrings.backend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendModule[TOptions]
  extends StObject
     with Module {
  
  /** Save the missing translation */
  def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit
  
  def init(services: Services, backendOptions: TOptions, i18nextOptions: InitOptions): Unit
  
  def read(language: String, namespace: String, callback: ReadCallback): Unit
  
  /** Load multiple languages and namespaces. For backends supporting multiple resources loading */
  var readMulti: js.UndefOr[
    js.Function3[
      /* languages */ js.Array[String], 
      /* namespaces */ js.Array[String], 
      /* callback */ ReadCallback, 
      Unit
    ]
  ] = js.undefined
  
  /** Store the translation. For backends acting as cache layer */
  var save: js.UndefOr[
    js.Function3[/* language */ String, /* namespace */ String, /* data */ ResourceLanguage, Unit]
  ] = js.undefined
  
  @JSName("type")
  var type_BackendModule: backend
}
object BackendModule {
  
  inline def apply[TOptions](
    create: (js.Array[String], String, String, String) => Unit,
    init: (Services, TOptions, InitOptions) => Unit,
    read: (String, String, ReadCallback) => Unit
  ): BackendModule[TOptions] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), init = js.Any.fromFunction3(init), read = js.Any.fromFunction3(read))
    __obj.updateDynamic("type")("backend")
    __obj.asInstanceOf[BackendModule[TOptions]]
  }
  
  extension [Self <: BackendModule[?], TOptions](x: Self & BackendModule[TOptions]) {
    
    inline def setCreate(value: (js.Array[String], String, String, String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
    
    inline def setInit(value: (Services, TOptions, InitOptions) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String, ReadCallback) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    
    inline def setReadMulti(
      value: (/* languages */ js.Array[String], /* namespaces */ js.Array[String], /* callback */ ReadCallback) => Unit
    ): Self = StObject.set(x, "readMulti", js.Any.fromFunction3(value))
    
    inline def setReadMultiUndefined: Self = StObject.set(x, "readMulti", js.undefined)
    
    inline def setSave(value: (/* language */ String, /* namespace */ String, /* data */ ResourceLanguage) => Unit): Self = StObject.set(x, "save", js.Any.fromFunction3(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setType(value: backend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.ionicCliFramework

import typings.std.NonNullable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigMod {
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib/config", "BaseConfig")
  @js.native
  open class BaseConfig[T /* <: js.Object */] protected () extends StObject {
    def this(p: String) = this()
    def this(p: String, param1: BaseConfigOptions) = this()
    
    /* private */ var _getFile: Any = js.native
    
    /* private */ var _setFile: Any = js.native
    
    def c: T = js.native
    def c_=(value: T): Unit = js.native
    
    def file: Any = js.native
    
    def get[P /* <: /* keyof T */ String */](property: P): /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any = js.native
    def get[P /* <: /* keyof T */ String */](
      property: P,
      defaultValue: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
      ] = js.native
    
    val p: String = js.native
    
    /* protected */ val pathPrefix: js.Array[String] = js.native
    
    def provideDefaults(c: Partial[T]): T = js.native
    
    def set[P /* <: /* keyof T */ String */](
      property: P,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ): Unit = js.native
    
    /* protected */ val spaces: String | Double = js.native
    
    def unset[P /* <: /* keyof T */ String */](property: P): Unit = js.native
  }
  
  trait BaseConfigOptions extends StObject {
    
    /**
      * If specified, the class will operate on a nested object within the config
      * file navigated to by this path prefix, an array of object path keys.
      *
      * For example, to operate on `c` object within `{ a: { b: { c: {} } } }`,
      * use `pathPrefix` of `['a', 'b', 'c']`.
      */
    var pathPrefix: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The number of spaces to use when writing the JSON file.
      */
    var spaces: js.UndefOr[String | Double] = js.undefined
  }
  object BaseConfigOptions {
    
    inline def apply(): BaseConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseConfigOptions]
    }
    
    extension [Self <: BaseConfigOptions](x: Self) {
      
      inline def setPathPrefix(value: js.Array[String]): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setPathPrefixVarargs(value: String*): Self = StObject.set(x, "pathPrefix", js.Array(value*))
      
      inline def setSpaces(value: String | Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
}

package typings.lilconfig

import typings.lilconfig.mod.LilconfigResult
import typings.lilconfig.mod.Loaders
import typings.lilconfig.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config extends StObject {
    
    var config: Any
    
    var filepath: String
    
    var isEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(config: Any, filepath: String): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
    }
  }
  
  /* Inlined std.Partial<lilconfig.lilconfig.Options> */
  trait PartialOptions extends StObject {
    
    var ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.undefined
    
    var loaders: js.UndefOr[Loaders] = js.undefined
    
    var packageProp: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var searchPlaces: js.UndefOr[js.Array[String]] = js.undefined
    
    var stopDir: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setIgnoreEmptySearchPlaces(value: Boolean): Self = StObject.set(x, "ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptySearchPlacesUndefined: Self = StObject.set(x, "ignoreEmptySearchPlaces", js.undefined)
      
      inline def setLoaders(value: Loaders): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setPackageProp(value: String | js.Array[String]): Self = StObject.set(x, "packageProp", value.asInstanceOf[js.Any])
      
      inline def setPackagePropUndefined: Self = StObject.set(x, "packageProp", js.undefined)
      
      inline def setPackagePropVarargs(value: String*): Self = StObject.set(x, "packageProp", js.Array(value*))
      
      inline def setSearchPlaces(value: js.Array[String]): Self = StObject.set(x, "searchPlaces", value.asInstanceOf[js.Any])
      
      inline def setSearchPlacesUndefined: Self = StObject.set(x, "searchPlaces", js.undefined)
      
      inline def setSearchPlacesVarargs(value: String*): Self = StObject.set(x, "searchPlaces", js.Array(value*))
      
      inline def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      inline def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
      
      inline def setTransform(value: /* result */ LilconfigResult => LilconfigResult | js.Promise[LilconfigResult]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}

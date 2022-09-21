package typings.lilconfig

import typings.lilconfig.anon.Config
import typings.lilconfig.anon.PartialOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lilconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lilconfig", "defaultLoaders")
  @js.native
  val defaultLoaders: LoadersSync = js.native
  
  inline def lilconfig(name: String): AsyncSearcher = ^.asInstanceOf[js.Dynamic].applyDynamic("lilconfig")(name.asInstanceOf[js.Any]).asInstanceOf[AsyncSearcher]
  inline def lilconfig(name: String, options: PartialOptions): AsyncSearcher = (^.asInstanceOf[js.Dynamic].applyDynamic("lilconfig")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncSearcher]
  
  inline def lilconfigSync(name: String): SyncSearcher = ^.asInstanceOf[js.Dynamic].applyDynamic("lilconfigSync")(name.asInstanceOf[js.Any]).asInstanceOf[SyncSearcher]
  inline def lilconfigSync(name: String, options: OptionsSync): SyncSearcher = (^.asInstanceOf[js.Dynamic].applyDynamic("lilconfigSync")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SyncSearcher]
  
  @js.native
  trait AsyncSearcher extends StObject {
    
    def load(filepath: String): js.Promise[LilconfigResult] = js.native
    
    def search(): js.Promise[LilconfigResult] = js.native
    def search(searchFrom: String): js.Promise[LilconfigResult] = js.native
  }
  
  type LilconfigResult = Null | Config
  
  type Loader = LoaderSync | (js.Function2[/* filepath */ String, /* content */ String, js.Promise[LoaderResult]])
  
  type LoaderResult = Any
  
  type LoaderSync = js.Function2[/* filepath */ String, /* content */ String, LoaderResult]
  
  type Loaders = Record[String, Loader]
  
  type LoadersSync = Record[String, LoaderSync]
  
  trait Options
    extends StObject
       with OptionsBase {
    
    var loaders: js.UndefOr[Loaders] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLoaders(value: Loaders): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setTransform(value: /* result */ LilconfigResult => LilconfigResult | js.Promise[LilconfigResult]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait OptionsBase extends StObject {
    
    var ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.undefined
    
    var packageProp: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var searchPlaces: js.UndefOr[js.Array[String]] = js.undefined
    
    var stopDir: js.UndefOr[String] = js.undefined
  }
  object OptionsBase {
    
    inline def apply(): OptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsBase]
    }
    
    extension [Self <: OptionsBase](x: Self) {
      
      inline def setIgnoreEmptySearchPlaces(value: Boolean): Self = StObject.set(x, "ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptySearchPlacesUndefined: Self = StObject.set(x, "ignoreEmptySearchPlaces", js.undefined)
      
      inline def setPackageProp(value: String | js.Array[String]): Self = StObject.set(x, "packageProp", value.asInstanceOf[js.Any])
      
      inline def setPackagePropUndefined: Self = StObject.set(x, "packageProp", js.undefined)
      
      inline def setPackagePropVarargs(value: String*): Self = StObject.set(x, "packageProp", js.Array(value*))
      
      inline def setSearchPlaces(value: js.Array[String]): Self = StObject.set(x, "searchPlaces", value.asInstanceOf[js.Any])
      
      inline def setSearchPlacesUndefined: Self = StObject.set(x, "searchPlaces", js.undefined)
      
      inline def setSearchPlacesVarargs(value: String*): Self = StObject.set(x, "searchPlaces", js.Array(value*))
      
      inline def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      inline def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
  
  trait OptionsSync
    extends StObject
       with OptionsBase {
    
    var loaders: js.UndefOr[LoadersSync] = js.undefined
    
    var transform: js.UndefOr[TransformSync] = js.undefined
  }
  object OptionsSync {
    
    inline def apply(): OptionsSync = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSync]
    }
    
    extension [Self <: OptionsSync](x: Self) {
      
      inline def setLoaders(value: LoadersSync): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setTransform(value: /* result */ LilconfigResult => LilconfigResult): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait SyncSearcher extends StObject {
    
    def load(filepath: String): LilconfigResult = js.native
    
    def search(): LilconfigResult = js.native
    def search(searchFrom: String): LilconfigResult = js.native
  }
  
  type Transform = TransformSync | (js.Function1[/* result */ LilconfigResult, js.Promise[LilconfigResult]])
  
  type TransformSync = js.Function1[/* result */ LilconfigResult, LilconfigResult]
}

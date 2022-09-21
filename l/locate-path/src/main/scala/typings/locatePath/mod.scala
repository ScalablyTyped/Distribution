package typings.locatePath

import typings.locatePath.locatePathStrings.directory
import typings.locatePath.locatePathStrings.file
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("locate-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def locatePath(paths: js.Iterable[String]): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("locatePath")(paths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def locatePath(paths: js.Iterable[String], options: AsyncOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("locatePath")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def locatePathSync(paths: js.Iterable[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("locatePathSync")(paths.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def locatePathSync(paths: js.Iterable[String], options: Options): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("locatePathSync")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait AsyncOptions
    extends StObject
       with Options {
    
    /**
    	The number of concurrently pending promises.
    	Minimum: `1`
    	@default Infinity
    	*/
    val concurrency: js.UndefOr[Double] = js.undefined
    
    /**
    	Preserve `paths` order when searching.
    	Disable this to improve performance if you don't care about the order.
    	@default true
    	*/
    val preserveOrder: js.UndefOr[Boolean] = js.undefined
  }
  object AsyncOptions {
    
    inline def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    extension [Self <: AsyncOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      inline def setPreserveOrderUndefined: Self = StObject.set(x, "preserveOrder", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    	Allow symbolic links to match if they point to the requested path type.
    	@default true
    	*/
    val allowSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The current working directory.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[URL | String] = js.undefined
    
    /**
    	The type of path to match.
    	@default 'file'
    	*/
    val `type`: js.UndefOr[file | directory] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowSymlinks(value: Boolean): Self = StObject.set(x, "allowSymlinks", value.asInstanceOf[js.Any])
      
      inline def setAllowSymlinksUndefined: Self = StObject.set(x, "allowSymlinks", js.undefined)
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setType(value: file | directory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

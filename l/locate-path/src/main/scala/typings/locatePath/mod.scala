package typings.locatePath

import typings.locatePath.locatePathStrings.directory
import typings.locatePath.locatePathStrings.file
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the first path that exists on disk of multiple paths.
  	@param paths - Paths to check.
  	@returns The first path that exists or `undefined` if none exists.
  	@example
  	```
  	import locatePath = require('locate-path');
  	const files = [
  		'unicorn.png',
  		'rainbow.png', // Only this one actually exists on disk
  		'pony.png'
  	];
  	(async () => {
  		console(await locatePath(files));
  		//=> 'rainbow'
  	})();
  	```
  	*/
  @JSImport("locate-path", JSImport.Namespace)
  @js.native
  def apply(paths: Iterable[String]): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("locate-path", JSImport.Namespace)
  @js.native
  def apply(paths: Iterable[String], options: AsyncOptions): js.Promise[js.UndefOr[String]] = js.native
  
  /**
  	Synchronously get the first path that exists on disk of multiple paths.
  	@param paths - Paths to check.
  	@returns The first path that exists or `undefined` if none exists.
  	*/
  @JSImport("locate-path", "sync")
  @js.native
  def sync(paths: Iterable[String]): js.UndefOr[String] = js.native
  @JSImport("locate-path", "sync")
  @js.native
  def sync(paths: Iterable[String], options: Options): js.UndefOr[String] = js.native
  
  @js.native
  trait AsyncOptions extends Options {
    
    /**
    		Number of concurrently pending promises. Minimum: `1`.
    		@default Infinity
    		*/
    val concurrency: js.UndefOr[Double] = js.native
    
    /**
    		Preserve `paths` order when searching.
    		Disable this to improve performance if you don't care about the order.
    		@default true
    		*/
    val preserveOrder: js.UndefOr[Boolean] = js.native
  }
  object AsyncOptions {
    
    @scala.inline
    def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    @scala.inline
    implicit class AsyncOptionsMutableBuilder[Self <: AsyncOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveOrderUndefined: Self = StObject.set(x, "preserveOrder", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Allow symbolic links to match if they point to the requested path type.
    		@default true
    		*/
    val allowSymlinks: js.UndefOr[Boolean] = js.native
    
    /**
    		Current working directory.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.native
    
    /**
    		Type of path to match.
    		@default 'file'
    		*/
    val `type`: js.UndefOr[file | directory] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSymlinks(value: Boolean): Self = StObject.set(x, "allowSymlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSymlinksUndefined: Self = StObject.set(x, "allowSymlinks", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setType(value: file | directory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

package typings.gulpCached

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-cached", JSImport.Namespace)
  @js.native
  val ^ : IGulpCached = js.native
  
  type ICacheStore = StringDictionary[js.Object]
  
  @js.native
  trait IGulpCached extends StObject {
    
    /**
      * Creates a new cache hash or uses an existing one.
      */
    def apply(name: String): ReadWriteStream = js.native
    def apply(name: String, options: IOptions): ReadWriteStream = js.native
    
    /**
      * Cache store.
      */
    var caches: ICacheStore = js.native
  }
  
  @js.native
  trait IOptions extends StObject {
    
    /**
      * Uses md5 instead of storing the whole file contents.
      * @default false
      */
    var optimizeMemory: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptimizeMemory(value: Boolean): Self = StObject.set(x, "optimizeMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeMemoryUndefined: Self = StObject.set(x, "optimizeMemory", js.undefined)
    }
  }
  
  type _To = IGulpCached
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpCached = ^
}

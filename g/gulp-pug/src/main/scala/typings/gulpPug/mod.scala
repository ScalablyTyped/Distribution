package typings.gulpPug

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a stream that compiles Vinyl files as Pug.
    */
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-pug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Any options from [Pug's API](https://pugjs.org/api/reference.html) in addition to `pug`'s own options.
    */
  trait Options
    extends StObject
       with typings.pug.mod.Options {
    
    /**
      * Compile Pug to JavaScript code.
      */
    var client: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Same as `opts.locals`.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Locals to compile the Pug with. You can also provide locals through the `data` field of the file object,
      * e.g. with [`gulp-data`](https://npmjs.com/gulp-data). They will be merged with `opts.locals`.
      */
    var locals: js.UndefOr[Any] = js.undefined
    
    /**
      * A custom instance of Pug for `gulp-pug` to use.
      */
    var pug: js.UndefOr[Any] = js.undefined
    
    /**
      * Display name of file from stream that is being compiled.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClient(value: Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLocals(value: Any): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setPug(value: Any): Self = StObject.set(x, "pug", value.asInstanceOf[js.Any])
      
      inline def setPugUndefined: Self = StObject.set(x, "pug", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}

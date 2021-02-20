package typings.gulpPug

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a stream that compiles Vinyl files as Pug.
    */
  @JSImport("gulp-pug", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("gulp-pug", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transform = js.native
  
  /**
    * Any options from [Pug's API](https://pugjs.org/api/reference.html) in addition to `pug`'s own options.
    */
  @js.native
  trait Options
    extends typings.pug.mod.Options {
    
    /**
      * Compile Pug to JavaScript code.
      */
    var client: js.UndefOr[Boolean] = js.native
    
    /**
      * Same as `opts.locals`.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * Locals to compile the Pug with. You can also provide locals through the `data` field of the file object,
      * e.g. with [`gulp-data`](https://npmjs.com/gulp-data). They will be merged with `opts.locals`.
      */
    var locals: js.UndefOr[js.Any] = js.native
    
    /**
      * A custom instance of Pug for `gulp-pug` to use.
      */
    var pug: js.UndefOr[js.Any] = js.native
    
    /**
      * Display name of file from stream that is being compiled.
      */
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setClient(value: Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setLocals(value: js.Any): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setPug(value: js.Any): Self = StObject.set(x, "pug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPugUndefined: Self = StObject.set(x, "pug", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}

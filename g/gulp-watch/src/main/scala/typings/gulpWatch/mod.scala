package typings.gulpWatch

import typings.gulpWatch.anon.Fileeventaddchangeunlink
import typings.node.NodeJS.ReadWriteStream
import typings.vinylFs.mod.SrcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: String): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: String, callback: Cb): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: String, options: js.UndefOr[scala.Nothing], callback: Cb): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: String, options: IOptions): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: String, options: IOptions, callback: Cb): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: js.Array[String]): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: js.Array[String], callback: Cb): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: js.Array[String], options: js.UndefOr[scala.Nothing], callback: Cb): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: js.Array[String], options: IOptions): IWatchStream = js.native
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  def apply(glob: js.Array[String], options: IOptions, callback: Cb): IWatchStream = js.native
  
  type Cb = js.Function1[/* file */ Fileeventaddchangeunlink, Unit]
  
  @js.native
  trait IOptions extends SrcOptions {
    
    var events: js.UndefOr[js.Array[String]] = js.native
    
    var ignoreInitial: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var readDelay: js.UndefOr[Double] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreInitial(value: Boolean): Self = StObject.set(x, "ignoreInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreInitialUndefined: Self = StObject.set(x, "ignoreInitial", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReadDelay(value: Double): Self = StObject.set(x, "readDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadDelayUndefined: Self = StObject.set(x, "readDelay", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait IWatchStream extends ReadWriteStream {
    
    def add(path: String): ReadWriteStream = js.native
    def add(path: js.Array[String]): ReadWriteStream = js.native
    
    def close(): ReadWriteStream = js.native
    
    def unwatch(path: String): ReadWriteStream = js.native
    def unwatch(path: js.Array[String]): ReadWriteStream = js.native
  }
}

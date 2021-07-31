package typings.gulpWatch

import typings.gulpWatch.anon.Fileeventaddchangeunlink
import typings.node.NodeJS.ReadWriteStream
import typings.vinylFs.mod.SrcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(glob: String): IWatchStream = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: String, callback: Cb): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: String, options: Unit, callback: Cb): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: String, options: IOptions): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: String, options: IOptions, callback: Cb): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: js.Array[String]): IWatchStream = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: js.Array[String], callback: Cb): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: js.Array[String], options: Unit, callback: Cb): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: js.Array[String], options: IOptions): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  @scala.inline
  def apply(glob: js.Array[String], options: IOptions, callback: Cb): IWatchStream = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IWatchStream]
  
  @JSImport("gulp-watch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Cb = js.Function1[/* file */ Fileeventaddchangeunlink, Unit]
  
  trait IOptions
    extends StObject
       with SrcOptions {
    
    var events: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreInitial: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var readDelay: js.UndefOr[Double] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
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
  trait IWatchStream
    extends StObject
       with ReadWriteStream {
    
    def add(path: String): ReadWriteStream = js.native
    def add(path: js.Array[String]): ReadWriteStream = js.native
    
    def close(): ReadWriteStream = js.native
    
    def unwatch(path: String): ReadWriteStream = js.native
    def unwatch(path: js.Array[String]): ReadWriteStream = js.native
  }
}

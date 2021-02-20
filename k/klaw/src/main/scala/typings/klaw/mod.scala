package typings.klaw

import typings.klaw.klawStrings.close
import typings.klaw.klawStrings.data
import typings.klaw.klawStrings.end
import typings.klaw.klawStrings.error
import typings.klaw.klawStrings.readable
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("klaw", JSImport.Namespace)
  @js.native
  def apply(root: String): Walker = js.native
  @JSImport("klaw", JSImport.Namespace)
  @js.native
  def apply(root: String, options: Options): Walker = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.klaw.klawStrings.close
    - typings.klaw.klawStrings.data
    - typings.klaw.klawStrings.end
    - typings.klaw.klawStrings.error
    - typings.klaw.klawStrings.pause
    - typings.klaw.klawStrings.readable
    - typings.klaw.klawStrings.resume
  */
  trait Event extends StObject
  object Event {
    
    @scala.inline
    def close: typings.klaw.klawStrings.close = "close".asInstanceOf[typings.klaw.klawStrings.close]
    
    @scala.inline
    def data: typings.klaw.klawStrings.data = "data".asInstanceOf[typings.klaw.klawStrings.data]
    
    @scala.inline
    def end: typings.klaw.klawStrings.end = "end".asInstanceOf[typings.klaw.klawStrings.end]
    
    @scala.inline
    def error: typings.klaw.klawStrings.error = "error".asInstanceOf[typings.klaw.klawStrings.error]
    
    @scala.inline
    def pause: typings.klaw.klawStrings.pause = "pause".asInstanceOf[typings.klaw.klawStrings.pause]
    
    @scala.inline
    def readable: typings.klaw.klawStrings.readable = "readable".asInstanceOf[typings.klaw.klawStrings.readable]
    
    @scala.inline
    def resume: typings.klaw.klawStrings.resume = "resume".asInstanceOf[typings.klaw.klawStrings.resume]
  }
  
  @js.native
  trait Item extends StObject {
    
    var path: String = js.native
    
    var stats: Stats = js.native
  }
  object Item {
    
    @scala.inline
    def apply(path: String, stats: Stats): Item = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends ReadableOptions {
    
    var depthLimit: js.UndefOr[Double] = js.native
    
    // fs or mock-fs
    var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
    
    var fs: js.UndefOr[js.Any] = js.native
    
    var pathSorter: js.UndefOr[js.Function2[/* pathA */ String, /* pathB */ String, Double]] = js.native
    
    var preserveSymlinks: js.UndefOr[Boolean] = js.native
    
    var queueMethod: js.UndefOr[QueueMethod] = js.native
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
      def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
      
      @scala.inline
      def setFilter(value: /* path */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setPathSorter(value: (/* pathA */ String, /* pathB */ String) => Double): Self = StObject.set(x, "pathSorter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPathSorterUndefined: Self = StObject.set(x, "pathSorter", js.undefined)
      
      @scala.inline
      def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      @scala.inline
      def setQueueMethod(value: QueueMethod): Self = StObject.set(x, "queueMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueMethodUndefined: Self = StObject.set(x, "queueMethod", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.klaw.klawStrings.shift
    - typings.klaw.klawStrings.pop
  */
  trait QueueMethod extends StObject
  object QueueMethod {
    
    @scala.inline
    def pop: typings.klaw.klawStrings.pop = "pop".asInstanceOf[typings.klaw.klawStrings.pop]
    
    @scala.inline
    def shift: typings.klaw.klawStrings.shift = "shift".asInstanceOf[typings.klaw.klawStrings.shift]
  }
  
  @js.native
  trait Walker extends Readable {
    
    def on(event: Event, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* item */ Item, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  }
}

package typings.ignoreWalk

import org.scalablytyped.runtime.StringDictionary
import typings.ignoreWalk.anon.Follow
import typings.ignoreWalk.ignoreWalkStrings.done
import typings.ignoreWalk.ignoreWalkStrings.error
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(options: Unit, callback: js.Function1[/* results */ js.Array[String], Unit]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(options: WalkerOptions): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(options: WalkerOptions, callback: js.Function1[/* results */ js.Array[String], Unit]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("ignore-walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ignore-walk", "Walker")
  @js.native
  class Walker () extends EventEmitter {
    def this(opts: WalkerOptions) = this()
    
    def addIgnoreFile(file: String, `then`: js.Function0[Unit]): Unit = js.native
    
    def addIgnoreFiles(): Unit = js.native
    
    @JSName("addListener")
    def addListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var basename: String = js.native
    
    def emit(ev: String, data: js.Any): Boolean = js.native
    
    var entries: js.Array[String] = js.native
    
    def filterEntries(): Unit = js.native
    
    def filterEntry(entry: String, partial: Boolean): Boolean = js.native
    
    var follow: Boolean = js.native
    
    var ignoreFiles: js.Array[String] = js.native
    
    var ignoreRules: StringDictionary[String] = js.native
    
    var includeEmpty: Boolean = js.native
    
    def isIgnoreFile(e: String): Boolean = js.native
    
    def onReadIgnoreFile(file: String, data: String, `then`: js.Function0[Unit]): Unit = js.native
    
    def onReaddir(entries: js.Array[String]): Unit = js.native
    
    @JSName("on")
    def on_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    def onstat(st: Stats, entry: String, file: Boolean, dir: Boolean, `then`: js.Function0[Unit]): Unit = js.native
    
    var parent: Walker | WalkerSync | Null = js.native
    
    var path: String = js.native
    
    @JSName("prependListener")
    def prependListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var result: Set[String] | js.Array[String] = js.native
    
    var root: String = js.native
    
    var sawError: Boolean = js.native
    
    def sort(a: String, b: String): Double = js.native
    
    def start(): this.type = js.native
    
    def stat(entry: String, file: Boolean, dir: Boolean, the: js.Function0[Unit]): Unit = js.native
    
    def walker(entry: String, `then`: js.Function0[Unit]): Unit = js.native
    
    def walkerOpt(entry: String): Follow = js.native
  }
  
  @JSImport("ignore-walk", "WalkerSync")
  @js.native
  class WalkerSync () extends Walker {
    def this(opts: WalkerOptions) = this()
  }
  
  @scala.inline
  def sync(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(options: WalkerOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait WalkerOptions extends StObject {
    
    var follow: js.UndefOr[Boolean] = js.undefined
    
    var ignoreFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var includeEmpty: js.UndefOr[Boolean] = js.undefined
    
    var parent: js.UndefOr[Walker | WalkerSync | Null] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object WalkerOptions {
    
    @scala.inline
    def apply(): WalkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkerOptions]
    }
    
    @scala.inline
    implicit class WalkerOptionsMutableBuilder[Self <: WalkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setIgnoreFiles(value: js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      @scala.inline
      def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value :_*))
      
      @scala.inline
      def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEmptyUndefined: Self = StObject.set(x, "includeEmpty", js.undefined)
      
      @scala.inline
      def setParent(value: Walker | WalkerSync): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}

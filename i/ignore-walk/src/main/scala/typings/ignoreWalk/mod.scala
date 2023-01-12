package typings.ignoreWalk

import org.scalablytyped.runtime.StringDictionary
import typings.ignoreWalk.anon.Dir
import typings.ignoreWalk.anon.Entry
import typings.ignoreWalk.ignoreWalkStrings.done
import typings.ignoreWalk.ignoreWalkStrings.error
import typings.node.eventsMod.EventEmitter
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(options: Unit, callback: js.Function1[/* results */ js.Array[String], Unit]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(options: WalkerOptions): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(options: WalkerOptions, callback: js.Function1[/* results */ js.Array[String], Unit]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("ignore-walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ignore-walk", "Walker")
  @js.native
  open class Walker () extends EventEmitter {
    def this(opts: WalkerOptions) = this()
    
    def addIgnoreFile(file: String, `then`: js.Function0[Unit]): Unit = js.native
    
    def addIgnoreFiles(): Unit = js.native
    
    @JSName("addListener")
    def addListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var basename: String = js.native
    
    def emit(ev: String, data: Any): Boolean = js.native
    
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
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def onstat(opts: Dir, `then`: js.Function0[Unit]): Unit = js.native
    
    var parent: Walker | WalkerSync | Null = js.native
    
    var path: String = js.native
    
    @JSName("prependListener")
    def prependListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var result: Set[String] | js.Array[String] = js.native
    
    var root: String = js.native
    
    var sawError: Boolean = js.native
    
    def sort(a: String, b: String): Double = js.native
    
    def start(): this.type = js.native
    
    def stat(opts: Entry, `then`: js.Function0[Unit]): Unit = js.native
    
    def walker(entry: String, opts: Unit, `then`: js.Function0[Unit]): Unit = js.native
    def walker(entry: String, opts: WalkerOptions, `then`: js.Function0[Unit]): Unit = js.native
    
    def walkerOpt(entry: String): ConcreteWalkerOptions = js.native
    def walkerOpt(entry: String, opts: WalkerOptions): ConcreteWalkerOptions = js.native
  }
  
  @JSImport("ignore-walk", "WalkerSync")
  @js.native
  open class WalkerSync () extends Walker {
    def this(opts: WalkerOptions) = this()
  }
  
  inline def sync(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Array[String]]
  inline def sync(options: WalkerOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait ConcreteWalkerOptions
    extends StObject
       with WalkerOptions {
    
    @JSName("follow")
    var follow_ConcreteWalkerOptions: Boolean
    
    @JSName("ignoreFiles")
    var ignoreFiles_ConcreteWalkerOptions: js.Array[String]
    
    @JSName("includeEmpty")
    var includeEmpty_ConcreteWalkerOptions: Boolean
    
    @JSName("parent")
    var parent_ConcreteWalkerOptions: Walker | WalkerSync
    
    @JSName("path")
    var path_ConcreteWalkerOptions: String
  }
  object ConcreteWalkerOptions {
    
    inline def apply(
      follow: Boolean,
      ignoreFiles: js.Array[String],
      includeEmpty: Boolean,
      parent: Walker | WalkerSync,
      path: String
    ): ConcreteWalkerOptions = {
      val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], includeEmpty = includeEmpty.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteWalkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConcreteWalkerOptions] (val x: Self) extends AnyVal {
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFiles(value: js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value*))
      
      inline def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Walker | WalkerSync): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait WalkerOptions extends StObject {
    
    var follow: js.UndefOr[Boolean] = js.undefined
    
    var ignoreFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var includeEmpty: js.UndefOr[Boolean] = js.undefined
    
    var isSymbolicLink: js.UndefOr[Boolean] = js.undefined
    
    var parent: js.UndefOr[Walker | WalkerSync | Null] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object WalkerOptions {
    
    inline def apply(): WalkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkerOptions] (val x: Self) extends AnyVal {
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setIgnoreFiles(value: js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value*))
      
      inline def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyUndefined: Self = StObject.set(x, "includeEmpty", js.undefined)
      
      inline def setIsSymbolicLink(value: Boolean): Self = StObject.set(x, "isSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setIsSymbolicLinkUndefined: Self = StObject.set(x, "isSymbolicLink", js.undefined)
      
      inline def setParent(value: Walker | WalkerSync): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}

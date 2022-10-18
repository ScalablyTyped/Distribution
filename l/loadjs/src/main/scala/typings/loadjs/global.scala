package typings.loadjs

import typings.loadjs.anon.FnCall
import typings.loadjs.anon.LoadOptionsreturnPromiset
import typings.loadjs.mod.LoadOptions
import typings.loadjs.mod.LoadedFn
import typings.loadjs.mod.ReadyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object loadjs {
    
    inline def apply(files: String, bundleIdOrLoaded: String): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleIdOrLoaded.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: String, bundleIdOrLoaded: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleIdOrLoaded.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: String, bundleIdOrLoaded: LoadedFn): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleIdOrLoaded.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: String, bundleId: String, optionsOrCallback: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleId.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: String, bundleId: String, optionsOrCallback: LoadedFn): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleId.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: String, bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply(files: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply(files: js.Array[String], bundleIdOrLoaded: String): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleIdOrLoaded.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: js.Array[String], bundleIdOrLoaded: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleIdOrLoaded.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: js.Array[String], bundleIdOrLoaded: LoadedFn): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleIdOrLoaded.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleId.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadedFn): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleId.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(files: js.Array[String], bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], bundleId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply(files: js.Array[String], options: LoadOptionsreturnPromiset): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSGlobal("loadjs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def done(bundleId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(bundleId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isDefined(bundleId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(bundleId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def ready(bundleIds: String, optionsOrCallback: LoadedFn): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[FnCall]
    inline def ready(bundleIds: String, optionsOrCallback: ReadyOptions): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[FnCall]
    inline def ready(bundleIds: js.Array[String], optionsOrCallback: LoadedFn): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[FnCall]
    inline def ready(bundleIds: js.Array[String], optionsOrCallback: ReadyOptions): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[FnCall]
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
}

package typings.loadjs

import typings.loadjs.anon.LoadOptionsreturnPromiset
import typings.loadjs.anon.Typeofloadjs
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("loadjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def done(bundleId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(bundleId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isDefined(bundleId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(bundleId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ready(bundleIds: String, optionsOrCallback: LoadedFn): Typeofloadjs = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Typeofloadjs]
  inline def ready(bundleIds: String, optionsOrCallback: ReadyOptions): Typeofloadjs = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Typeofloadjs]
  inline def ready(bundleIds: js.Array[String], optionsOrCallback: LoadedFn): Typeofloadjs = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Typeofloadjs]
  inline def ready(bundleIds: js.Array[String], optionsOrCallback: ReadyOptions): Typeofloadjs = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(bundleIds.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Typeofloadjs]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  trait LoadOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.undefined
    
    // Arguments provided are different in case of returnPromise: true / false
    var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
    
    var numRetries: js.UndefOr[Double] = js.undefined
    
    var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBefore(value: (/* path */ String, /* scriptEl */ HTMLElement) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setError(value: /* depsNotFound */ js.Array[String] => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNumRetries(value: Double): Self = StObject.set(x, "numRetries", value.asInstanceOf[js.Any])
      
      inline def setNumRetriesUndefined: Self = StObject.set(x, "numRetries", js.undefined)
      
      inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  type LoadedFn = js.Function0[Unit]
  
  trait ReadyOptions extends StObject {
    
    var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
    
    var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ReadyOptions {
    
    inline def apply(): ReadyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadyOptions]
    }
    
    extension [Self <: ReadyOptions](x: Self) {
      
      inline def setError(value: /* depsNotFound */ js.Array[String] => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}

package typings.loadjs

import typings.loadjs.loadjsBooleans.`true`
import typings.loadjs.mod.LoadOptions
import typings.loadjs.mod.LoadedFn
import typings.loadjs.mod.ReadyOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined loadjs.loadjs.LoadOptions & {  returnPromise :true} */
  trait LoadOptionsreturnPromiset extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.undefined
    
    // Arguments provided are different in case of returnPromise: true / false
    var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
    
    var numRetries: js.UndefOr[Double] = js.undefined
    
    var returnPromise: `true`
    
    var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object LoadOptionsreturnPromiset {
    
    inline def apply(): LoadOptionsreturnPromiset = {
      val __obj = js.Dynamic.literal(returnPromise = true)
      __obj.asInstanceOf[LoadOptionsreturnPromiset]
    }
    
    extension [Self <: LoadOptionsreturnPromiset](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBefore(value: (/* path */ String, /* scriptEl */ HTMLElement) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setError(value: /* depsNotFound */ js.Array[String] => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNumRetries(value: Double): Self = StObject.set(x, "numRetries", value.asInstanceOf[js.Any])
      
      inline def setNumRetriesUndefined: Self = StObject.set(x, "numRetries", js.undefined)
      
      inline def setReturnPromise(value: `true`): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  @js.native
  trait Typeofloadjs extends StObject {
    
    def apply(files: String, bundleIdOrLoaded: String): Unit = js.native
    def apply(files: String, bundleIdOrLoaded: LoadOptions): Unit = js.native
    def apply(files: String, bundleIdOrLoaded: LoadedFn): Unit = js.native
    def apply(files: String, bundleId: String, optionsOrCallback: LoadOptions): Unit = js.native
    def apply(files: String, bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
    def apply(files: String, bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
    def apply(files: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
    def apply(files: js.Array[String], bundleIdOrLoaded: String): Unit = js.native
    def apply(files: js.Array[String], bundleIdOrLoaded: LoadOptions): Unit = js.native
    def apply(files: js.Array[String], bundleIdOrLoaded: LoadedFn): Unit = js.native
    def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadOptions): Unit = js.native
    def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
    def apply(files: js.Array[String], bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
    def apply(files: js.Array[String], options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
    
    def done(bundleId: String): Unit = js.native
    
    def isDefined(bundleId: String): Boolean = js.native
    
    def ready(bundleIds: String, optionsOrCallback: LoadedFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
    def ready(bundleIds: String, optionsOrCallback: ReadyOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
    def ready(bundleIds: js.Array[String], optionsOrCallback: LoadedFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
    def ready(bundleIds: js.Array[String], optionsOrCallback: ReadyOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
    
    def reset(): Unit = js.native
  }
}

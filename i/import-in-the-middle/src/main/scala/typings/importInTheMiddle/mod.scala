package typings.importInTheMiddle

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("import-in-the-middle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("import-in-the-middle", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Hook {
    def this(hookFn: HookFn) = this()
    def this(modules: js.Array[String], hookFn: HookFn) = this()
    /**
      * Creates a hook to be run on any already loaded modules and any that will
      * be loaded in the future. It will be run once per loaded module. If
      * statically imported, any variables bound directly to exported items will
      * be re-bound if those items are re-assigned in the hook function.
      * @param {Array<string>} [modules] A list of modules to run this hook on. If
      * omitted, it will run on every import everywhere.
      * @param {Options} [options] An options object. If omitted, the default is
      * `{ internals: false }`. If internals is true, then the hook will operate
      * on internal modules of packages in node_modules. Otherwise it will not,
      * unless they are mentioned specifically in the modules array.
      * @param {HookFunction} hookFn The function to be run on each module.
      */
    def this(modules: js.Array[String], options: Options, hookFn: HookFn) = this()
    
    /**
      * Disables this hook. It will no longer be run against any subsequently
      * loaded modules.
      */
    /* CompleteClass */
    override def unhook(): Unit = js.native
  }
  
  inline def addHook(hookFn: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(hookFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeHook(hookFn: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHook")(hookFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Hook extends StObject {
    
    /**
      * Disables this hook. It will no longer be run against any subsequently
      * loaded modules.
      */
    def unhook(): Unit
  }
  object Hook {
    
    inline def apply(unhook: () => Unit): Hook = {
      val __obj = js.Dynamic.literal(unhook = js.Any.fromFunction0(unhook))
      __obj.asInstanceOf[Hook]
    }
    
    extension [Self <: Hook](x: Self) {
      
      inline def setUnhook(value: () => Unit): Self = StObject.set(x, "unhook", js.Any.fromFunction0(value))
    }
  }
  
  type HookFn = js.Function3[/* exported */ Namespace, /* name */ String, /* baseDir */ String | Unit, Any]
  
  type HookFunction = js.Function2[/* url */ String, /* exported */ Namespace, Unit]
  
  type Namespace = StringDictionary[Any]
  
  trait Options extends StObject {
    
    var internals: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInternals(value: Boolean): Self = StObject.set(x, "internals", value.asInstanceOf[js.Any])
      
      inline def setInternalsUndefined: Self = StObject.set(x, "internals", js.undefined)
    }
  }
}

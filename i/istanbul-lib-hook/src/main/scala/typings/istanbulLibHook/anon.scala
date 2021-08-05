package typings.istanbulLibHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRequireOptions> */
  trait PartialHookRequireOptions extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var postLoadHook: js.UndefOr[js.Function1[/* filename */ String, Unit]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PartialHookRequireOptions {
    
    inline def apply(): PartialHookRequireOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHookRequireOptions]
    }
    
    extension [Self <: PartialHookRequireOptions](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setPostLoadHook(value: /* filename */ String => Unit): Self = StObject.set(x, "postLoadHook", js.Any.fromFunction1(value))
      
      inline def setPostLoadHookUndefined: Self = StObject.set(x, "postLoadHook", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRunInContextOptions> */
  trait PartialHookRunInContextOp extends StObject {
    
    var coverageVariable: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PartialHookRunInContextOp {
    
    inline def apply(): PartialHookRunInContextOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHookRunInContextOp]
    }
    
    extension [Self <: PartialHookRunInContextOp](x: Self) {
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.Options> */
  trait PartialOptions extends StObject {
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}

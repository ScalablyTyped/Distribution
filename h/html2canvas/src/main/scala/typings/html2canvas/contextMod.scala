package typings.html2canvas

import typings.html2canvas.boundsMod.Bounds
import typings.html2canvas.cacheStorageMod.Cache
import typings.html2canvas.cacheStorageMod.ResourceOptions
import typings.html2canvas.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("html2canvas/dist/types/core/context", "Context")
  @js.native
  open class Context protected () extends StObject {
    def this(options: ContextOptions, windowBounds: Bounds) = this()
    
    val cache: Cache = js.native
    
    /* private */ val instanceName: Any = js.native
    
    val logger: Logger = js.native
    
    var windowBounds: Bounds = js.native
  }
  /* static members */
  object Context {
    
    @JSImport("html2canvas/dist/types/core/context", "Context")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("html2canvas/dist/types/core/context", "Context.instanceCount")
    @js.native
    def instanceCount: Any = js.native
    inline def instanceCount_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(x.asInstanceOf[js.Any])
  }
  
  trait ContextOptions
    extends StObject
       with ResourceOptions {
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var logging: Boolean
  }
  object ContextOptions {
    
    inline def apply(allowTaint: Boolean, imageTimeout: Double, logging: Boolean, useCORS: Boolean): ContextOptions = {
      val __obj = js.Dynamic.literal(allowTaint = allowTaint.asInstanceOf[js.Any], imageTimeout = imageTimeout.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], useCORS = useCORS.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextOptions]
    }
    
    extension [Self <: ContextOptions](x: Self) {
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    }
  }
}

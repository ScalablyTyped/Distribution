package typings.jestFakeTimers

import typings.jestFakeTimers.mod.TimerConfig
import typings.jestMessageUtil.mod.StackTraceConfig
import typings.jestMock.mod.ModuleMocker
import typings.jestTypes.mod.ProjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config[TimerRef] extends StObject {
    
    var config: StackTraceConfig
    
    var global: /* globalThis */ Any
    
    var maxLoops: js.UndefOr[Double] = js.undefined
    
    var moduleMocker: ModuleMocker
    
    var timerConfig: TimerConfig[TimerRef]
  }
  object Config {
    
    inline def apply[TimerRef](
      config: StackTraceConfig,
      global: /* globalThis */ Any,
      moduleMocker: ModuleMocker,
      timerConfig: TimerConfig[TimerRef]
    ): Config[TimerRef] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], timerConfig = timerConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[TimerRef]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config[?], TimerRef] (val x: Self & Config[TimerRef]) extends AnyVal {
      
      inline def setConfig(value: StackTraceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: /* globalThis */ Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setMaxLoops(value: Double): Self = StObject.set(x, "maxLoops", value.asInstanceOf[js.Any])
      
      inline def setMaxLoopsUndefined: Self = StObject.set(x, "maxLoops", js.undefined)
      
      inline def setModuleMocker(value: ModuleMocker): Self = StObject.set(x, "moduleMocker", value.asInstanceOf[js.Any])
      
      inline def setTimerConfig(value: TimerConfig[TimerRef]): Self = StObject.set(x, "timerConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait Global extends StObject {
    
    var config: ProjectConfig
    
    var global: /* globalThis */ Any
  }
  object Global {
    
    inline def apply(config: ProjectConfig, global: /* globalThis */ Any): Global = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: /* globalThis */ Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
}

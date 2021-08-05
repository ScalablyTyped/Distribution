package typings.jestFakeTimers

import typings.jestFakeTimers.jestFakeTimersMod.TimerConfig
import typings.jestMessageUtil.mod.StackTraceConfig
import typings.jestMock.mod.ModuleMocker
import typings.node.NodeJS.Global
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config[TimerRef] extends StObject {
    
    var config: StackTraceConfig
    
    var global: Global
    
    var maxLoops: js.UndefOr[Double] = js.undefined
    
    var moduleMocker: ModuleMocker
    
    var timerConfig: TimerConfig[TimerRef]
  }
  object Config {
    
    inline def apply[TimerRef](
      config: StackTraceConfig,
      global: Global,
      moduleMocker: ModuleMocker,
      timerConfig: TimerConfig[TimerRef]
    ): Config[TimerRef] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], timerConfig = timerConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[TimerRef]]
    }
    
    extension [Self <: Config[?], TimerRef](x: Self & Config[TimerRef]) {
      
      inline def setConfig(value: StackTraceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: Global): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setMaxLoops(value: Double): Self = StObject.set(x, "maxLoops", value.asInstanceOf[js.Any])
      
      inline def setMaxLoopsUndefined: Self = StObject.set(x, "maxLoops", js.undefined)
      
      inline def setModuleMocker(value: ModuleMocker): Self = StObject.set(x, "moduleMocker", value.asInstanceOf[js.Any])
      
      inline def setTimerConfig(value: TimerConfig[TimerRef]): Self = StObject.set(x, "timerConfig", value.asInstanceOf[js.Any])
    }
  }
}

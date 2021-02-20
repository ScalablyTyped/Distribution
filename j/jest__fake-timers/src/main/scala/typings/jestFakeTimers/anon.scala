package typings.jestFakeTimers

import typings.jestFakeTimers.jestFakeTimersMod.TimerConfig
import typings.jestMessageUtil.mod.StackTraceConfig
import typings.jestMock.mod.ModuleMocker
import typings.node.NodeJS.Global
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Config[TimerRef] extends StObject {
    
    var config: StackTraceConfig = js.native
    
    var global: Global = js.native
    
    var maxLoops: js.UndefOr[Double] = js.native
    
    var moduleMocker: ModuleMocker = js.native
    
    var timerConfig: TimerConfig[TimerRef] = js.native
  }
  object Config {
    
    @scala.inline
    def apply[TimerRef](
      config: StackTraceConfig,
      global: Global,
      moduleMocker: ModuleMocker,
      timerConfig: TimerConfig[TimerRef]
    ): Config[TimerRef] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], timerConfig = timerConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[TimerRef]]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config[_], TimerRef] (val x: Self with Config[TimerRef]) extends AnyVal {
      
      @scala.inline
      def setConfig(value: StackTraceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: Global): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLoops(value: Double): Self = StObject.set(x, "maxLoops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLoopsUndefined: Self = StObject.set(x, "maxLoops", js.undefined)
      
      @scala.inline
      def setModuleMocker(value: ModuleMocker): Self = StObject.set(x, "moduleMocker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimerConfig(value: TimerConfig[TimerRef]): Self = StObject.set(x, "timerConfig", value.asInstanceOf[js.Any])
    }
  }
}

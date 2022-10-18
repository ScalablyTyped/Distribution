package typings.hummerEnv

import typings.hummerEnv.hummerEnvStrings.end
import typings.hummerEnv.hummerEnvStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAnimation[V] extends StObject {
  
  /**
    * @summary 动画延时（单位：秒）
    */
  var delay: Double
  
  /**
    * @summary 动画持续时间（单位：秒）
    */
  var duration: Double
  
  /**
    * @summary 动画运动速率曲线
    */
  var easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
  
  /**
    * 动画执行开始或结束时的回调
    *
    * @param event 事件类型（'start' 或 'end'）
    * @param callback 事件回调
    */
  def on(event: start | end, cb: js.Function0[Unit]): Unit
  
  /**
    * @summary 动画次数 <0: 无限次 0、1: 动画做1次 2: 动画做2次
    */
  var repeatCount: Double
  
  /**
    * @summary 属性值
    */
  var value: V
}
object BasicAnimation {
  
  inline def apply[V](
    delay: Double,
    duration: Double,
    easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any,
    on: (start | end, js.Function0[Unit]) => Unit,
    repeatCount: Double,
    value: V
  ): BasicAnimation[V] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), repeatCount = repeatCount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAnimation[V]]
  }
  
  extension [Self <: BasicAnimation[?], V](x: Self & BasicAnimation[V]) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
    ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setOn(value: (start | end, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

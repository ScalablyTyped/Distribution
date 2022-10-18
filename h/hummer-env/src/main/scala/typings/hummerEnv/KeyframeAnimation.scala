package typings.hummerEnv

import typings.hummerEnv.anon.Easing
import typings.hummerEnv.hummerEnvStrings.end
import typings.hummerEnv.hummerEnvStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeAnimation[V] extends StObject {
  
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
    * @summary 关键帧
    */
  var keyframes: js.Array[Easing[V]]
  
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
}
object KeyframeAnimation {
  
  inline def apply[V](
    delay: Double,
    duration: Double,
    easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any,
    keyframes: js.Array[Easing[V]],
    on: (start | end, js.Function0[Unit]) => Unit,
    repeatCount: Double
  ): KeyframeAnimation[V] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), repeatCount = repeatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframeAnimation[V]]
  }
  
  extension [Self <: KeyframeAnimation[?], V](x: Self & KeyframeAnimation[V]) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
    ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setKeyframes(value: js.Array[Easing[V]]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesVarargs(value: Easing[V]*): Self = StObject.set(x, "keyframes", js.Array(value*))
    
    inline def setOn(value: (start | end, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
  }
}

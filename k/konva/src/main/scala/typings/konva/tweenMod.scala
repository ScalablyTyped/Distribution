package typings.konva

import typings.konva.animationMod.Animation
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tweenMod {
  
  object Easings {
    
    @JSImport("konva/types/Tween", "Easings.BackEaseIn")
    @js.native
    def BackEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.BackEaseInOut")
    @js.native
    def BackEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.BackEaseOut")
    @js.native
    def BackEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.BounceEaseIn")
    @js.native
    def BounceEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.BounceEaseInOut")
    @js.native
    def BounceEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.BounceEaseOut")
    @js.native
    def BounceEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.EaseIn")
    @js.native
    def EaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.EaseInOut")
    @js.native
    def EaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.EaseOut")
    @js.native
    def EaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.ElasticEaseIn")
    @js.native
    def ElasticEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.ElasticEaseInOut")
    @js.native
    def ElasticEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.ElasticEaseOut")
    @js.native
    def ElasticEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.Linear")
    @js.native
    def Linear(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.StrongEaseIn")
    @js.native
    def StrongEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.StrongEaseInOut")
    @js.native
    def StrongEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Tween", "Easings.StrongEaseOut")
    @js.native
    def StrongEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  }
  
  @JSImport("konva/types/Tween", "Tween")
  @js.native
  class Tween protected () extends StObject {
    def this(config: TweenConfig) = this()
    
    def _addAttr(key: js.Any, end: js.Any): Unit = js.native
    
    def _addListeners(): Unit = js.native
    
    var _id: Double = js.native
    
    def _tweenFunc(i: js.Any): Unit = js.native
    
    var anim: Animation = js.native
    
    def destroy(): Unit = js.native
    
    def finish(): this.type = js.native
    
    var node: Node[NodeConfig] = js.native
    
    var onFinish: js.Function = js.native
    
    var onReset: js.Function = js.native
    
    var onUpdate: js.Function = js.native
    
    def pause(): this.type = js.native
    
    def play(): this.type = js.native
    
    def reset(): this.type = js.native
    
    def reverse(): this.type = js.native
    
    def seek(t: js.Any): this.type = js.native
    
    var tween: TweenEngine = js.native
  }
  /* static members */
  object Tween {
    
    @JSImport("konva/types/Tween", "Tween")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("konva/types/Tween", "Tween.attrs")
    @js.native
    def attrs: js.Object = js.native
    @scala.inline
    def attrs_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attrs")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/Tween", "Tween.tweens")
    @js.native
    def tweens: js.Object = js.native
    @scala.inline
    def tweens_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tweens")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TweenConfig extends NodeConfig {
    
    var duration: js.UndefOr[Double] = js.native
    
    var node: Node[NodeConfig] = js.native
    
    var onFinish: js.UndefOr[js.Function] = js.native
    
    var onUpdate: js.UndefOr[js.Function] = js.native
  }
  object TweenConfig {
    
    @scala.inline
    def apply(node: Node[NodeConfig]): TweenConfig = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenConfig]
    }
    
    @scala.inline
    implicit class TweenConfigMutableBuilder[Self <: TweenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setNode(value: Node[NodeConfig]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFinish(value: js.Function): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  @js.native
  trait TweenEngine extends StObject {
    
    var _change: Double = js.native
    
    var _finish: Double = js.native
    
    var _pos: Double = js.native
    
    var _position: Double = js.native
    
    var _startTime: Double = js.native
    
    var _time: Double = js.native
    
    var begin: Double = js.native
    
    var duration: Double = js.native
    
    def finish(): Unit = js.native
    
    def fire(str: js.Any): Unit = js.native
    
    var func: js.Function = js.native
    
    def getPosition(t: js.Any): js.Any = js.native
    
    def getTime(): Double = js.native
    
    def getTimer(): Double = js.native
    
    def onEnterFrame(): Unit = js.native
    
    var onFinish: js.Function = js.native
    
    var onPause: js.Function = js.native
    
    var onPlay: js.Function = js.native
    
    var onReset: js.Function = js.native
    
    var onReverse: js.Function = js.native
    
    var onUpdate: js.Function = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    var prevPos: Double = js.native
    
    var prop: String = js.native
    
    var propFunc: js.Function = js.native
    
    def reset(): Unit = js.native
    
    def reverse(): Unit = js.native
    
    def seek(t: js.Any): Unit = js.native
    
    def setPosition(p: js.Any): Unit = js.native
    
    def setTime(t: js.Any): Unit = js.native
    
    var state: Double = js.native
    
    def update(): Unit = js.native
    
    var yoyo: Boolean = js.native
  }
  object TweenEngine {
    
    @scala.inline
    def apply(
      _change: Double,
      _finish: Double,
      _pos: Double,
      _position: Double,
      _startTime: Double,
      _time: Double,
      begin: Double,
      duration: Double,
      finish: () => Unit,
      fire: js.Any => Unit,
      func: js.Function,
      getPosition: js.Any => js.Any,
      getTime: () => Double,
      getTimer: () => Double,
      onEnterFrame: () => Unit,
      onFinish: js.Function,
      onPause: js.Function,
      onPlay: js.Function,
      onReset: js.Function,
      onReverse: js.Function,
      onUpdate: js.Function,
      pause: () => Unit,
      play: () => Unit,
      prevPos: Double,
      prop: String,
      propFunc: js.Function,
      reset: () => Unit,
      reverse: () => Unit,
      seek: js.Any => Unit,
      setPosition: js.Any => Unit,
      setTime: js.Any => Unit,
      state: Double,
      update: () => Unit,
      yoyo: Boolean
    ): TweenEngine = {
      val __obj = js.Dynamic.literal(_change = _change.asInstanceOf[js.Any], _finish = _finish.asInstanceOf[js.Any], _pos = _pos.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _startTime = _startTime.asInstanceOf[js.Any], _time = _time.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), fire = js.Any.fromFunction1(fire), func = func.asInstanceOf[js.Any], getPosition = js.Any.fromFunction1(getPosition), getTime = js.Any.fromFunction0(getTime), getTimer = js.Any.fromFunction0(getTimer), onEnterFrame = js.Any.fromFunction0(onEnterFrame), onFinish = onFinish.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onReverse = onReverse.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), prevPos = prevPos.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], propFunc = propFunc.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), reverse = js.Any.fromFunction0(reverse), seek = js.Any.fromFunction1(seek), setPosition = js.Any.fromFunction1(setPosition), setTime = js.Any.fromFunction1(setTime), state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), yoyo = yoyo.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenEngine]
    }
    
    @scala.inline
    implicit class TweenEngineMutableBuilder[Self <: TweenEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFire(value: js.Any => Unit): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunc(value: js.Function): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPosition(value: js.Any => js.Any): Self = StObject.set(x, "getPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTimer(value: () => Double): Self = StObject.set(x, "getTimer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnterFrame(value: () => Unit): Self = StObject.set(x, "onEnterFrame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFinish(value: js.Function): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPause(value: js.Function): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlay(value: js.Function): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReset(value: js.Function): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReverse(value: js.Function): Self = StObject.set(x, "onReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevPos(value: Double): Self = StObject.set(x, "prevPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropFunc(value: js.Function): Self = StObject.set(x, "propFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReverse(value: () => Unit): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSeek(value: js.Any => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPosition(value: js.Any => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTime(value: js.Any => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_change(value: Double): Self = StObject.set(x, "_change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_finish(value: Double): Self = StObject.set(x, "_finish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pos(value: Double): Self = StObject.set(x, "_pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_position(value: Double): Self = StObject.set(x, "_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_startTime(value: Double): Self = StObject.set(x, "_startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_time(value: Double): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    }
  }
}

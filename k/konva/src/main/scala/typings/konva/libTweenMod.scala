package typings.konva

import typings.konva.libAnimationMod.Animation
import typings.konva.libNodeMod.Node
import typings.konva.libNodeMod.NodeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTweenMod {
  
  object Easings {
    
    @JSImport("konva/lib/Tween", "Easings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def BackEaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def BackEaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def BackEaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def BounceEaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def BounceEaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def BounceEaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def EaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def EaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def EaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def ElasticEaseIn(t: Any, b: Any, c: Any, d: Any, a: Any, p: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def ElasticEaseInOut(t: Any, b: Any, c: Any, d: Any, a: Any, p: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def ElasticEaseOut(t: Any, b: Any, c: Any, d: Any, a: Any, p: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def Linear(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def StrongEaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def StrongEaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def StrongEaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("konva/lib/Tween", "Tween")
  @js.native
  open class Tween protected () extends StObject {
    def this(config: TweenConfig) = this()
    
    def _addAttr(key: Any, end: Any): Unit = js.native
    
    def _addListeners(): Unit = js.native
    
    var _id: Double = js.native
    
    def _tweenFunc(i: Any): Unit = js.native
    
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
    
    def seek(t: Any): this.type = js.native
    
    var tween: TweenEngine = js.native
  }
  /* static members */
  object Tween {
    
    @JSImport("konva/lib/Tween", "Tween")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("konva/lib/Tween", "Tween.attrs")
    @js.native
    def attrs: js.Object = js.native
    inline def attrs_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attrs")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Tween", "Tween.tweens")
    @js.native
    def tweens: js.Object = js.native
    inline def tweens_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tweens")(x.asInstanceOf[js.Any])
  }
  
  trait TweenConfig
    extends StObject
       with NodeConfig {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var node: Node[NodeConfig]
    
    var onFinish: js.UndefOr[js.Function] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function] = js.undefined
  }
  object TweenConfig {
    
    inline def apply(node: Node[NodeConfig]): TweenConfig = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenConfig]
    }
    
    extension [Self <: TweenConfig](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setNode(value: Node[NodeConfig]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnFinish(value: js.Function): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  trait TweenEngine extends StObject {
    
    var _change: Double
    
    var _finish: Double
    
    var _pos: Double
    
    var _position: Double
    
    var _startTime: Double
    
    var _time: Double
    
    var begin: Double
    
    var duration: Double
    
    def finish(): Unit
    
    def fire(str: Any): Unit
    
    var func: js.Function
    
    def getPosition(t: Any): Any
    
    def getTime(): Double
    
    def getTimer(): Double
    
    def onEnterFrame(): Unit
    
    var onFinish: js.Function
    
    var onPause: js.Function
    
    var onPlay: js.Function
    
    var onReset: js.Function
    
    var onReverse: js.Function
    
    var onUpdate: js.Function
    
    def pause(): Unit
    
    def play(): Unit
    
    var prevPos: Double
    
    var prop: String
    
    var propFunc: js.Function
    
    def reset(): Unit
    
    def reverse(): Unit
    
    def seek(t: Any): Unit
    
    def setPosition(p: Any): Unit
    
    def setTime(t: Any): Unit
    
    var state: Double
    
    def update(): Unit
    
    var yoyo: Boolean
  }
  object TweenEngine {
    
    inline def apply(
      _change: Double,
      _finish: Double,
      _pos: Double,
      _position: Double,
      _startTime: Double,
      _time: Double,
      begin: Double,
      duration: Double,
      finish: () => Unit,
      fire: Any => Unit,
      func: js.Function,
      getPosition: Any => Any,
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
      seek: Any => Unit,
      setPosition: Any => Unit,
      setTime: Any => Unit,
      state: Double,
      update: () => Unit,
      yoyo: Boolean
    ): TweenEngine = {
      val __obj = js.Dynamic.literal(_change = _change.asInstanceOf[js.Any], _finish = _finish.asInstanceOf[js.Any], _pos = _pos.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _startTime = _startTime.asInstanceOf[js.Any], _time = _time.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), fire = js.Any.fromFunction1(fire), func = func.asInstanceOf[js.Any], getPosition = js.Any.fromFunction1(getPosition), getTime = js.Any.fromFunction0(getTime), getTimer = js.Any.fromFunction0(getTimer), onEnterFrame = js.Any.fromFunction0(onEnterFrame), onFinish = onFinish.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onReverse = onReverse.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), prevPos = prevPos.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], propFunc = propFunc.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), reverse = js.Any.fromFunction0(reverse), seek = js.Any.fromFunction1(seek), setPosition = js.Any.fromFunction1(setPosition), setTime = js.Any.fromFunction1(setTime), state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), yoyo = yoyo.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenEngine]
    }
    
    extension [Self <: TweenEngine](x: Self) {
      
      inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setFire(value: Any => Unit): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
      
      inline def setFunc(value: js.Function): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setGetPosition(value: Any => Any): Self = StObject.set(x, "getPosition", js.Any.fromFunction1(value))
      
      inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      inline def setGetTimer(value: () => Double): Self = StObject.set(x, "getTimer", js.Any.fromFunction0(value))
      
      inline def setOnEnterFrame(value: () => Unit): Self = StObject.set(x, "onEnterFrame", js.Any.fromFunction0(value))
      
      inline def setOnFinish(value: js.Function): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      inline def setOnPause(value: js.Function): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPlay(value: js.Function): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      inline def setOnReset(value: js.Function): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      inline def setOnReverse(value: js.Function): Self = StObject.set(x, "onReverse", value.asInstanceOf[js.Any])
      
      inline def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setPrevPos(value: Double): Self = StObject.set(x, "prevPos", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropFunc(value: js.Function): Self = StObject.set(x, "propFunc", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setReverse(value: () => Unit): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setSeek(value: Any => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      
      inline def setSetPosition(value: Any => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      inline def setSetTime(value: Any => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
      
      inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      inline def set_change(value: Double): Self = StObject.set(x, "_change", value.asInstanceOf[js.Any])
      
      inline def set_finish(value: Double): Self = StObject.set(x, "_finish", value.asInstanceOf[js.Any])
      
      inline def set_pos(value: Double): Self = StObject.set(x, "_pos", value.asInstanceOf[js.Any])
      
      inline def set_position(value: Double): Self = StObject.set(x, "_position", value.asInstanceOf[js.Any])
      
      inline def set_startTime(value: Double): Self = StObject.set(x, "_startTime", value.asInstanceOf[js.Any])
      
      inline def set_time(value: Double): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    }
  }
}

package typings.konva.tweenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenEngine extends js.Object {
  
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
  implicit class TweenEngineOps[Self <: TweenEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_change(value: Double): Self = this.set("_change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_finish(value: Double): Self = this.set("_finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pos(value: Double): Self = this.set("_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_position(value: Double): Self = this.set("_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startTime(value: Double): Self = this.set("_startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_time(value: Double): Self = this.set("_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBegin(value: Double): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinish(value: () => Unit): Self = this.set("finish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFire(value: js.Any => Unit): Self = this.set("fire", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFunc(value: js.Function): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPosition(value: js.Any => js.Any): Self = this.set("getPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTime(value: () => Double): Self = this.set("getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimer(value: () => Double): Self = this.set("getTimer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnterFrame(value: () => Unit): Self = this.set("onEnterFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFinish(value: js.Function): Self = this.set("onFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPause(value: js.Function): Self = this.set("onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlay(value: js.Function): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReset(value: js.Function): Self = this.set("onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReverse(value: js.Function): Self = this.set("onReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdate(value: js.Function): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevPos(value: Double): Self = this.set("prevPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropFunc(value: js.Function): Self = this.set("propFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverse(value: () => Unit): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: js.Any => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosition(value: js.Any => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTime(value: js.Any => Unit): Self = this.set("setTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
  }
}

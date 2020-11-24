package typings.ionicCore.recognizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanRecognizer extends js.Object {
  
  def detect(x: Double, y: Double): Boolean = js.native
  
  def getDirection(): Double = js.native
  
  def isGesture(): Boolean = js.native
  
  def start(x: Double, y: Double): Unit = js.native
}
object PanRecognizer {
  
  @scala.inline
  def apply(
    detect: (Double, Double) => Boolean,
    getDirection: () => Double,
    isGesture: () => Boolean,
    start: (Double, Double) => Unit
  ): PanRecognizer = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction2(detect), getDirection = js.Any.fromFunction0(getDirection), isGesture = js.Any.fromFunction0(isGesture), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[PanRecognizer]
  }
  
  @scala.inline
  implicit class PanRecognizerOps[Self <: PanRecognizer] (val x: Self) extends AnyVal {
    
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
    def setDetect(value: (Double, Double) => Boolean): Self = this.set("detect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDirection(value: () => Double): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsGesture(value: () => Boolean): Self = this.set("isGesture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: (Double, Double) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
  }
}

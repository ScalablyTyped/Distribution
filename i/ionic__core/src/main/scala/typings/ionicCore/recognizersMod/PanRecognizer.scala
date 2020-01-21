package typings.ionicCore.recognizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanRecognizer extends js.Object {
  def detect(x: Double, y: Double): Boolean
  def getDirection(): Double
  def isGesture(): Boolean
  def start(x: Double, y: Double): Unit
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
}


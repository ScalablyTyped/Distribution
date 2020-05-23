package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fn extends js.Object {
  var circles: Double
  var dur: Double
  def fn(): Style
}

object Fn {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: () => Style): Fn = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[Fn]
  }
}


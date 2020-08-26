package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ColorType extends js.Object

object _ColorType {
  @scala.inline
  def GradientColorObject(stops: js.Array[GradientColorStopObject]): _ColorType = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorType]
  }
  @scala.inline
  def PatternObject(pattern: PatternOptionsObject): _ColorType = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorType]
  }
}


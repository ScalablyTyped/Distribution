package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcnxcc extends js.Object {
  def get_channel_count(sclient: String, pvname: String): Double
  def set_max_channels(sclient: String, max_chan: Double): Double
  def set_max_credit(sclient: String, scredit: String, scps: String, initp: Double, finishp: Double): Double
  def set_max_time(sclient: String, max_secs: Double): Double
  def terminate_all(sclient: String): Double
  def update_max_time(sclient: String, secs: Double): Double
}

object Typeofcnxcc {
  @scala.inline
  def apply(
    get_channel_count: (String, String) => Double,
    set_max_channels: (String, Double) => Double,
    set_max_credit: (String, String, String, Double, Double) => Double,
    set_max_time: (String, Double) => Double,
    terminate_all: String => Double,
    update_max_time: (String, Double) => Double
  ): Typeofcnxcc = {
    val __obj = js.Dynamic.literal(get_channel_count = js.Any.fromFunction2(get_channel_count), set_max_channels = js.Any.fromFunction2(set_max_channels), set_max_credit = js.Any.fromFunction5(set_max_credit), set_max_time = js.Any.fromFunction2(set_max_time), terminate_all = js.Any.fromFunction1(terminate_all), update_max_time = js.Any.fromFunction2(update_max_time))
    __obj.asInstanceOf[Typeofcnxcc]
  }
}


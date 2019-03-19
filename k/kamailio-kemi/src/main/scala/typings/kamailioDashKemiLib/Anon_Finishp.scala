package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Finishp extends js.Object {
  def get_channel_count(sclient: java.lang.String, pvname: java.lang.String): scala.Double
  def set_max_channels(sclient: java.lang.String, max_chan: scala.Double): scala.Double
  def set_max_credit(
    sclient: java.lang.String,
    scredit: java.lang.String,
    scps: java.lang.String,
    initp: scala.Double,
    finishp: scala.Double
  ): scala.Double
  def set_max_time(sclient: java.lang.String, max_secs: scala.Double): scala.Double
  def terminate_all(sclient: java.lang.String): scala.Double
  def update_max_time(sclient: java.lang.String, secs: scala.Double): scala.Double
}

object Anon_Finishp {
  @scala.inline
  def apply(
    get_channel_count: (java.lang.String, java.lang.String) => scala.Double,
    set_max_channels: (java.lang.String, scala.Double) => scala.Double,
    set_max_credit: (java.lang.String, java.lang.String, java.lang.String, scala.Double, scala.Double) => scala.Double,
    set_max_time: (java.lang.String, scala.Double) => scala.Double,
    terminate_all: java.lang.String => scala.Double,
    update_max_time: (java.lang.String, scala.Double) => scala.Double
  ): Anon_Finishp = {
    val __obj = js.Dynamic.literal(get_channel_count = js.Any.fromFunction2(get_channel_count), set_max_channels = js.Any.fromFunction2(set_max_channels), set_max_credit = js.Any.fromFunction5(set_max_credit), set_max_time = js.Any.fromFunction2(set_max_time), terminate_all = js.Any.fromFunction1(terminate_all), update_max_time = js.Any.fromFunction2(update_max_time))
  
    __obj.asInstanceOf[Anon_Finishp]
  }
}


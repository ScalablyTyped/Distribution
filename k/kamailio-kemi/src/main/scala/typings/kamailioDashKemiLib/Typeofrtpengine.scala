package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrtpengine extends js.Object {
  def rtpengine_answer(flags: java.lang.String): scala.Double
  def rtpengine_answer0(): scala.Double
  def rtpengine_delete(flags: java.lang.String): scala.Double
  def rtpengine_delete0(): scala.Double
  def rtpengine_manage(flags: java.lang.String): scala.Double
  def rtpengine_manage0(): scala.Double
  def rtpengine_offer(flags: java.lang.String): scala.Double
  def rtpengine_offer0(): scala.Double
  def set_rtpengine_set(r1: scala.Double): scala.Double
  // This function is the sibling function to set_rtpengine_set().
  // The original module function is declared as set_rtpengine_set(setid[, setid2]).
  // In KEMI set_rtpengine_set() takes only the first parameter and set_rtpengine_set2() allows for the second optional parameter to be passed.
  // Please review the documentation for set_rtpengine_set() for more information.
  def set_rtpengine_set2(r1: scala.Double, r2: scala.Double): scala.Double
  def start_recording(): scala.Double
  def stop_recording(): scala.Double
}

object Typeofrtpengine {
  @scala.inline
  def apply(
    rtpengine_answer: java.lang.String => scala.Double,
    rtpengine_answer0: () => scala.Double,
    rtpengine_delete: java.lang.String => scala.Double,
    rtpengine_delete0: () => scala.Double,
    rtpengine_manage: java.lang.String => scala.Double,
    rtpengine_manage0: () => scala.Double,
    rtpengine_offer: java.lang.String => scala.Double,
    rtpengine_offer0: () => scala.Double,
    set_rtpengine_set: scala.Double => scala.Double,
    set_rtpengine_set2: (scala.Double, scala.Double) => scala.Double,
    start_recording: () => scala.Double,
    stop_recording: () => scala.Double
  ): Typeofrtpengine = {
    val __obj = js.Dynamic.literal(rtpengine_answer = js.Any.fromFunction1(rtpengine_answer), rtpengine_answer0 = js.Any.fromFunction0(rtpengine_answer0), rtpengine_delete = js.Any.fromFunction1(rtpengine_delete), rtpengine_delete0 = js.Any.fromFunction0(rtpengine_delete0), rtpengine_manage = js.Any.fromFunction1(rtpengine_manage), rtpengine_manage0 = js.Any.fromFunction0(rtpengine_manage0), rtpengine_offer = js.Any.fromFunction1(rtpengine_offer), rtpengine_offer0 = js.Any.fromFunction0(rtpengine_offer0), set_rtpengine_set = js.Any.fromFunction1(set_rtpengine_set), set_rtpengine_set2 = js.Any.fromFunction2(set_rtpengine_set2), start_recording = js.Any.fromFunction0(start_recording), stop_recording = js.Any.fromFunction0(stop_recording))
  
    __obj.asInstanceOf[Typeofrtpengine]
  }
}


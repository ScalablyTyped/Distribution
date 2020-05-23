package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipcapture extends js.Object {
  def float2int(_val: String, _coof: String): Double
  def report_capture(_table: String): Double
  def report_capture_cid(_table: String, _cid: String): Double
  def report_capture_data(_table: String, _cid: String, _data: String): Double
  def sip_capture(): Double
  def sip_capture_forward(puri: String): Double
  def sip_capture_mode(_table: String, _cmdata: String): Double
  def sip_capture_table(_table: String): Double
}

object Typeofsipcapture {
  @scala.inline
  def apply(
    float2int: (String, String) => Double,
    report_capture: String => Double,
    report_capture_cid: (String, String) => Double,
    report_capture_data: (String, String, String) => Double,
    sip_capture: () => Double,
    sip_capture_forward: String => Double,
    sip_capture_mode: (String, String) => Double,
    sip_capture_table: String => Double
  ): Typeofsipcapture = {
    val __obj = js.Dynamic.literal(float2int = js.Any.fromFunction2(float2int), report_capture = js.Any.fromFunction1(report_capture), report_capture_cid = js.Any.fromFunction2(report_capture_cid), report_capture_data = js.Any.fromFunction3(report_capture_data), sip_capture = js.Any.fromFunction0(sip_capture), sip_capture_forward = js.Any.fromFunction1(sip_capture_forward), sip_capture_mode = js.Any.fromFunction2(sip_capture_mode), sip_capture_table = js.Any.fromFunction1(sip_capture_table))
    __obj.asInstanceOf[Typeofsipcapture]
  }
}


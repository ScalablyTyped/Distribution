package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipcapture extends js.Object {
  def float2int(_val: java.lang.String, _coof: java.lang.String): scala.Double
  def report_capture(_table: java.lang.String): scala.Double
  def report_capture_cid(_table: java.lang.String, _cid: java.lang.String): scala.Double
  def report_capture_data(_table: java.lang.String, _cid: java.lang.String, _data: java.lang.String): scala.Double
  def sip_capture(): scala.Double
  def sip_capture_forward(puri: java.lang.String): scala.Double
  def sip_capture_mode(_table: java.lang.String, _cmdata: java.lang.String): scala.Double
  def sip_capture_table(_table: java.lang.String): scala.Double
}

object Typeofsipcapture {
  @scala.inline
  def apply(
    float2int: (java.lang.String, java.lang.String) => scala.Double,
    report_capture: java.lang.String => scala.Double,
    report_capture_cid: (java.lang.String, java.lang.String) => scala.Double,
    report_capture_data: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    sip_capture: () => scala.Double,
    sip_capture_forward: java.lang.String => scala.Double,
    sip_capture_mode: (java.lang.String, java.lang.String) => scala.Double,
    sip_capture_table: java.lang.String => scala.Double
  ): Typeofsipcapture = {
    val __obj = js.Dynamic.literal(float2int = js.Any.fromFunction2(float2int), report_capture = js.Any.fromFunction1(report_capture), report_capture_cid = js.Any.fromFunction2(report_capture_cid), report_capture_data = js.Any.fromFunction3(report_capture_data), sip_capture = js.Any.fromFunction0(sip_capture), sip_capture_forward = js.Any.fromFunction1(sip_capture_forward), sip_capture_mode = js.Any.fromFunction2(sip_capture_mode), sip_capture_table = js.Any.fromFunction1(sip_capture_table))
  
    __obj.asInstanceOf[Typeofsipcapture]
  }
}


package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sipcapture {
  
  @JSGlobal("KSR.sipcapture")
  @js.native
  val ^ : js.Any = js.native
  
  inline def float2int(_val: String, _coof: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("float2int")(_val.asInstanceOf[js.Any], _coof.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reportCapture(_table: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("report_capture")(_table.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def reportCaptureCid(_table: String, _cid: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("report_capture_cid")(_table.asInstanceOf[js.Any], _cid.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reportCaptureData(_table: String, _cid: String, _data: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("report_capture_data")(_table.asInstanceOf[js.Any], _cid.asInstanceOf[js.Any], _data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sipCapture(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sip_capture")().asInstanceOf[Double]
  
  inline def sipCaptureForward(puri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sip_capture_forward")(puri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sipCaptureMode(_table: String, _cmdata: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sip_capture_mode")(_table.asInstanceOf[js.Any], _cmdata.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sipCaptureTable(_table: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sip_capture_table")(_table.asInstanceOf[js.Any]).asInstanceOf[Double]
}

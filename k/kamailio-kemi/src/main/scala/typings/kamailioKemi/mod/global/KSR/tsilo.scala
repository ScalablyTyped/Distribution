package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsilo {
  
  @JSGlobal("KSR.tsilo")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tsAppend(_table: String, _ruri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ts_append")(_table.asInstanceOf[js.Any], _ruri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tsAppendTo(tindex: Double, tlabel: Double, _table: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ts_append_to")(tindex.asInstanceOf[js.Any], tlabel.asInstanceOf[js.Any], _table.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tsAppendToUri(tindex: Double, tlabel: Double, _table: String, _uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ts_append_to_uri")(tindex.asInstanceOf[js.Any], tlabel.asInstanceOf[js.Any], _table.asInstanceOf[js.Any], _uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tsStore(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ts_store")().asInstanceOf[Double]
  
  @scala.inline
  def tsStoreUri(puri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ts_store_uri")(puri.asInstanceOf[js.Any]).asInstanceOf[Double]
}

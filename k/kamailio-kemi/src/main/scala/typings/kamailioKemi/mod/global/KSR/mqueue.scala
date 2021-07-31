package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mqueue {
  
  @JSGlobal("KSR.mqueue")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mqAdd(mq: String, key: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mq_add")(mq.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def mqFetch(mq: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mq_fetch")(mq.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def mqPvFree(mq: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mq_pv_free")(mq.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def mqSize(mq: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mq_size")(mq.asInstanceOf[js.Any]).asInstanceOf[Double]
}

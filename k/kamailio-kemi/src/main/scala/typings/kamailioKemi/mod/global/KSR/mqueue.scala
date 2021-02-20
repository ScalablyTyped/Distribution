package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mqueue {
  
  @JSGlobal("KSR.mqueue.mq_add")
  @js.native
  def mqAdd(mq: String, key: String, `val`: String): Double = js.native
  
  @JSGlobal("KSR.mqueue.mq_fetch")
  @js.native
  def mqFetch(mq: String): Double = js.native
  
  @JSGlobal("KSR.mqueue.mq_pv_free")
  @js.native
  def mqPvFree(mq: String): Double = js.native
  
  @JSGlobal("KSR.mqueue.mq_size")
  @js.native
  def mqSize(mq: String): Double = js.native
}

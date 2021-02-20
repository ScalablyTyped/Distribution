package typings.javascriptBignum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("SchemeNumber")
  @js.native
  def SchemeNumber: typings.javascriptBignum.SchemeNumber = js.native
  @scala.inline
  def SchemeNumber_=(x: SchemeNumber): Unit = js.Dynamic.global.updateDynamic("SchemeNumber")(x.asInstanceOf[js.Any])
  
  @JSGlobal("VERSION")
  @js.native
  def VERSION: js.Array[Double] = js.native
  @scala.inline
  def VERSION_=(x: js.Array[Double]): Unit = js.Dynamic.global.updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  @JSGlobal("maxIntegerDigits")
  @js.native
  def maxIntegerDigits: Double = js.native
  @scala.inline
  def maxIntegerDigits_=(x: Double): Unit = js.Dynamic.global.updateDynamic("maxIntegerDigits")(x.asInstanceOf[js.Any])
  
  @JSGlobal("raise")
  @js.native
  def raise(conditionType: String, message: String, irritants: js.Any*): Unit = js.native
}

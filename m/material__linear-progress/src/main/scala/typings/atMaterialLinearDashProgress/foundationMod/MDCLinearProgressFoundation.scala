package typings.atMaterialLinearDashProgress.foundationMod

import typings.atMaterialLinearDashProgress.adapterMod.MDCLinearProgressAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCLinearProgressFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCLinearProgressAdapter] {
  def close(): Unit = js.native
  def open(): Unit = js.native
  def setBuffer(value: Double): Unit = js.native
  def setDeterminate(isDeterminate: Boolean): Unit = js.native
  def setProgress(value: Double): Unit = js.native
  def setReverse(isReversed: Boolean): Unit = js.native
}


package typings.jupyterlabRunning.mod.IRunningSessions

import typings.jupyterlabUiComponents.mod.LabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A running item.
  */
trait IRunningItem extends js.Object {
  var labelTitle: js.UndefOr[js.Function0[String]] = js.undefined
  def icon(): LabIcon
  def label(): String
  def open(): Unit
  def shutdown(): Unit
}

object IRunningItem {
  @scala.inline
  def apply(
    icon: () => LabIcon,
    label: () => String,
    open: () => Unit,
    shutdown: () => Unit,
    labelTitle: () => String = null
  ): IRunningItem = {
    val __obj = js.Dynamic.literal(icon = js.Any.fromFunction0(icon), label = js.Any.fromFunction0(label), open = js.Any.fromFunction0(open), shutdown = js.Any.fromFunction0(shutdown))
    if (labelTitle != null) __obj.updateDynamic("labelTitle")(js.Any.fromFunction0(labelTitle))
    __obj.asInstanceOf[IRunningItem]
  }
}


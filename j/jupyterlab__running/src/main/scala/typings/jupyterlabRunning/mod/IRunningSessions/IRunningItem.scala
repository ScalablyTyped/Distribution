package typings.jupyterlabRunning.mod.IRunningSessions

import typings.jupyterlabUiComponents.mod.LabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A running item.
  */
@js.native
trait IRunningItem extends js.Object {
  
  def icon(): LabIcon = js.native
  
  def label(): String = js.native
  
  var labelTitle: js.UndefOr[js.Function0[String]] = js.native
  
  def open(): Unit = js.native
  
  def shutdown(): Unit = js.native
}
object IRunningItem {
  
  @scala.inline
  def apply(icon: () => LabIcon, label: () => String, open: () => Unit, shutdown: () => Unit): IRunningItem = {
    val __obj = js.Dynamic.literal(icon = js.Any.fromFunction0(icon), label = js.Any.fromFunction0(label), open = js.Any.fromFunction0(open), shutdown = js.Any.fromFunction0(shutdown))
    __obj.asInstanceOf[IRunningItem]
  }
  
  @scala.inline
  implicit class IRunningItemOps[Self <: IRunningItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIcon(value: () => LabIcon): Self = this.set("icon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabel(value: () => String): Self = this.set("label", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShutdown(value: () => Unit): Self = this.set("shutdown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabelTitle(value: () => String): Self = this.set("labelTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLabelTitle: Self = this.set("labelTitle", js.undefined)
  }
}

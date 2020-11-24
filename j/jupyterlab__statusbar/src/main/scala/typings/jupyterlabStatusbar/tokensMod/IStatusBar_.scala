package typings.jupyterlabStatusbar.tokensMod

import typings.jupyterlabStatusbar.tokensMod.IStatusBar.IItem
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStatusBar_ extends js.Object {
  
  /**
    * Register a new status item.
    *
    * @param id - a unique id for the status item.
    *
    * @param options - The options for how to add the status item.
    *
    * @returns an `IDisposable` that can be disposed to remove the item.
    */
  def registerStatusItem(id: String, statusItem: IItem): IDisposable = js.native
}
object IStatusBar_ {
  
  @scala.inline
  def apply(registerStatusItem: (String, IItem) => IDisposable): IStatusBar_ = {
    val __obj = js.Dynamic.literal(registerStatusItem = js.Any.fromFunction2(registerStatusItem))
    __obj.asInstanceOf[IStatusBar_]
  }
  
  @scala.inline
  implicit class IStatusBar_Ops[Self <: IStatusBar_] (val x: Self) extends AnyVal {
    
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
    def setRegisterStatusItem(value: (String, IItem) => IDisposable): Self = this.set("registerStatusItem", js.Any.fromFunction2(value))
  }
}

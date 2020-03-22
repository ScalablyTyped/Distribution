package typings.jupyterlabStatusbar.tokensMod

import typings.jupyterlabStatusbar.tokensMod.IStatusBar.IItem
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def registerStatusItem(id: String, statusItem: IItem): IDisposable
}

object IStatusBar_ {
  @scala.inline
  def apply(registerStatusItem: (String, IItem) => IDisposable): IStatusBar_ = {
    val __obj = js.Dynamic.literal(registerStatusItem = js.Any.fromFunction2(registerStatusItem))
  
    __obj.asInstanceOf[IStatusBar_]
  }
}


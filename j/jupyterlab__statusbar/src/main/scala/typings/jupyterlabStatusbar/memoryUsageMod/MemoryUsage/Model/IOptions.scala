package typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a MemoryUsage model.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The refresh rate (in ms) for querying the server.
    */
  var refreshRate: Double = js.native
}
object IOptions {
  
  @scala.inline
  def apply(refreshRate: Double): IOptions = {
    val __obj = js.Dynamic.literal(refreshRate = refreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setRefreshRate(value: Double): Self = this.set("refreshRate", value.asInstanceOf[js.Any])
  }
}

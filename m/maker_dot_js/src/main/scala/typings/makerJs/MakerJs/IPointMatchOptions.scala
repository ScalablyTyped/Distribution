package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options when matching points
  */
@js.native
trait IPointMatchOptions extends js.Object {
  
  /**
    * Max distance to consider two points as the same.
    */
  var pointMatchingDistance: js.UndefOr[Double] = js.native
}
object IPointMatchOptions {
  
  @scala.inline
  def apply(): IPointMatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPointMatchOptions]
  }
  
  @scala.inline
  implicit class IPointMatchOptionsOps[Self <: IPointMatchOptions] (val x: Self) extends AnyVal {
    
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
    def setPointMatchingDistance(value: Double): Self = this.set("pointMatchingDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointMatchingDistance: Self = this.set("pointMatchingDistance", js.undefined)
  }
}

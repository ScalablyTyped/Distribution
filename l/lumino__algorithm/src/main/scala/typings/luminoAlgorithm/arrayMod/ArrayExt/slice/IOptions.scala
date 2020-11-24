package typings.luminoAlgorithm.arrayMod.ArrayExt.slice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the `slice` function.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The starting index of the slice, inclusive.
    *
    * Negative values are taken as an offset from the end
    * of the array.
    *
    * The default is `0` if `step > 0` else `n - 1`.
    */
  var start: js.UndefOr[Double] = js.native
  
  /**
    * The step value for the slice.
    *
    * This must not be `0`.
    *
    * The default is `1`.
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * The stopping index of the slice, exclusive.
    *
    * Negative values are taken as an offset from the end
    * of the array.
    *
    * The default is `n` if `step > 0` else `-n - 1`.
    */
  var stop: js.UndefOr[Double] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
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
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStop(value: Double): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
}

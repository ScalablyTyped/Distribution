package typings.makerJs.MakerJs

import typings.makerJs.MakerJs.measure.Atlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.combine.
  */
@js.native
trait ICombineOptions extends IPointMatchOptions {
  
  /**
    * Point which is known to be outside of the model.
    */
  var farPoint: js.UndefOr[IPoint] = js.native
  
  /**
    * Cached measurements for model A.
    */
  var measureA: js.UndefOr[Atlas] = js.native
  
  /**
    * Cached measurements for model B.
    */
  var measureB: js.UndefOr[Atlas] = js.native
  
  /**
    * Flag to remove paths which are not part of a loop.
    */
  var trimDeadEnds: js.UndefOr[Boolean] = js.native
}
object ICombineOptions {
  
  @scala.inline
  def apply(): ICombineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICombineOptions]
  }
  
  @scala.inline
  implicit class ICombineOptionsOps[Self <: ICombineOptions] (val x: Self) extends AnyVal {
    
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
    def setFarPoint(value: IPoint): Self = this.set("farPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFarPoint: Self = this.set("farPoint", js.undefined)
    
    @scala.inline
    def setMeasureA(value: Atlas): Self = this.set("measureA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureA: Self = this.set("measureA", js.undefined)
    
    @scala.inline
    def setMeasureB(value: Atlas): Self = this.set("measureB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureB: Self = this.set("measureB", js.undefined)
    
    @scala.inline
    def setTrimDeadEnds(value: Boolean): Self = this.set("trimDeadEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimDeadEnds: Self = this.set("trimDeadEnds", js.undefined)
  }
}

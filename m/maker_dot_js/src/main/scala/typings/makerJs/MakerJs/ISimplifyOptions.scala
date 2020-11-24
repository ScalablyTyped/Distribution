package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.simplify()
  */
@js.native
trait ISimplifyOptions extends js.Object {
  
  /**
    * Optional
    */
  var pointMatchingDistance: js.UndefOr[Double] = js.native
  
  /**
    * Optional
    */
  var scalarMatchingDistance: js.UndefOr[Double] = js.native
}
object ISimplifyOptions {
  
  @scala.inline
  def apply(): ISimplifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimplifyOptions]
  }
  
  @scala.inline
  implicit class ISimplifyOptionsOps[Self <: ISimplifyOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setScalarMatchingDistance(value: Double): Self = this.set("scalarMatchingDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalarMatchingDistance: Self = this.set("scalarMatchingDistance", js.undefined)
  }
}

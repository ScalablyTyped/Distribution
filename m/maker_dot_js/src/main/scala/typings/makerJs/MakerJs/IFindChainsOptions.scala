package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.findLoops.
  */
@js.native
trait IFindChainsOptions extends IPointMatchOptions {
  
  /**
    * Flag to separate chains by layers.
    */
  var byLayers: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to not recurse models, look only within current model's immediate paths.
    */
  var shallow: js.UndefOr[Boolean] = js.native
}
object IFindChainsOptions {
  
  @scala.inline
  def apply(): IFindChainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindChainsOptions]
  }
  
  @scala.inline
  implicit class IFindChainsOptionsOps[Self <: IFindChainsOptions] (val x: Self) extends AnyVal {
    
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
    def setByLayers(value: Boolean): Self = this.set("byLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByLayers: Self = this.set("byLayers", js.undefined)
    
    @scala.inline
    def setShallow(value: Boolean): Self = this.set("shallow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShallow: Self = this.set("shallow", js.undefined)
  }
}

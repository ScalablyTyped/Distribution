package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to path.intersection()
  */
@js.native
trait IPathIntersectionBaseOptions extends js.Object {
  
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var excludeTangents: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var out_AreOverlapped: js.UndefOr[Boolean] = js.native
}
object IPathIntersectionBaseOptions {
  
  @scala.inline
  def apply(): IPathIntersectionBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathIntersectionBaseOptions]
  }
  
  @scala.inline
  implicit class IPathIntersectionBaseOptionsOps[Self <: IPathIntersectionBaseOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludeTangents(value: Boolean): Self = this.set("excludeTangents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeTangents: Self = this.set("excludeTangents", js.undefined)
    
    @scala.inline
    def setOut_AreOverlapped(value: Boolean): Self = this.set("out_AreOverlapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOut_AreOverlapped: Self = this.set("out_AreOverlapped", js.undefined)
  }
}

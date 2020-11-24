package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to path.intersection()
  */
@js.native
trait IPathIntersectionOptions extends IPathIntersectionBaseOptions {
  
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var path1Offset: js.UndefOr[IPoint] = js.native
  
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var path2Offset: js.UndefOr[IPoint] = js.native
}
object IPathIntersectionOptions {
  
  @scala.inline
  def apply(): IPathIntersectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathIntersectionOptions]
  }
  
  @scala.inline
  implicit class IPathIntersectionOptionsOps[Self <: IPathIntersectionOptions] (val x: Self) extends AnyVal {
    
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
    def setPath1Offset(value: IPoint): Self = this.set("path1Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath1Offset: Self = this.set("path1Offset", js.undefined)
    
    @scala.inline
    def setPath2Offset(value: IPoint): Self = this.set("path2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath2Offset: Self = this.set("path2Offset", js.undefined)
  }
}

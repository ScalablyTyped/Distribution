package typings.jointjs.anon

import typings.jointjs.jointjsStrings.bbox
import typings.jointjs.jointjsStrings.bottomLeft
import typings.jointjs.jointjsStrings.bottomMiddle
import typings.jointjs.jointjsStrings.center
import typings.jointjs.jointjsStrings.corner
import typings.jointjs.jointjsStrings.leftMiddle
import typings.jointjs.jointjsStrings.origin
import typings.jointjs.jointjsStrings.rightMiddle
import typings.jointjs.jointjsStrings.topMiddle
import typings.jointjs.jointjsStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBy extends js.Object {
  
  var searchBy: js.UndefOr[
    bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox
  ] = js.native
}
object SearchBy {
  
  @scala.inline
  def apply(): SearchBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBy]
  }
  
  @scala.inline
  implicit class SearchByOps[Self <: SearchBy] (val x: Self) extends AnyVal {
    
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
    def setSearchBy(
      value: bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox
    ): Self = this.set("searchBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBy: Self = this.set("searchBy", js.undefined)
  }
}

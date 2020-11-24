package typings.javascriptAstar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagonal extends js.Object {
  
  var diagonal: js.UndefOr[Boolean] = js.native
}
object Diagonal {
  
  @scala.inline
  def apply(): Diagonal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diagonal]
  }
  
  @scala.inline
  implicit class DiagonalOps[Self <: Diagonal] (val x: Self) extends AnyVal {
    
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
    def setDiagonal(value: Boolean): Self = this.set("diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagonal: Self = this.set("diagonal", js.undefined)
  }
}

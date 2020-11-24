package typings.jsplumb.anon

import typings.jsplumb.mod.ContinuousAnchorFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Faces extends js.Object {
  
  var faces: js.UndefOr[js.Array[ContinuousAnchorFace]] = js.native
}
object Faces {
  
  @scala.inline
  def apply(): Faces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Faces]
  }
  
  @scala.inline
  implicit class FacesOps[Self <: Faces] (val x: Self) extends AnyVal {
    
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
    def setFacesVarargs(value: ContinuousAnchorFace*): Self = this.set("faces", js.Array(value :_*))
    
    @scala.inline
    def setFaces(value: js.Array[ContinuousAnchorFace]): Self = this.set("faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaces: Self = this.set("faces", js.undefined)
  }
}

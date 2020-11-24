package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CourseMaterialSet extends js.Object {
  
  /** Materials attached to this set. */
  var materials: js.UndefOr[js.Array[CourseMaterial]] = js.native
  
  /** Title for this set. */
  var title: js.UndefOr[String] = js.native
}
object CourseMaterialSet {
  
  @scala.inline
  def apply(): CourseMaterialSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseMaterialSet]
  }
  
  @scala.inline
  implicit class CourseMaterialSetOps[Self <: CourseMaterialSet] (val x: Self) extends AnyVal {
    
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
    def setMaterialsVarargs(value: CourseMaterial*): Self = this.set("materials", js.Array(value :_*))
    
    @scala.inline
    def setMaterials(value: js.Array[CourseMaterial]): Self = this.set("materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterials: Self = this.set("materials", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

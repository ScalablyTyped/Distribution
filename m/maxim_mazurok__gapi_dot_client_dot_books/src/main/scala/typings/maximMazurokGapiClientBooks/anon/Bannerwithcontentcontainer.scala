package typings.maximMazurokGapiClientBooks.anon

import typings.maximMazurokGapiClientBooks.gapi.client.books.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bannerwithcontentcontainer extends js.Object {
  
  var banner_with_content_container: js.UndefOr[FillColorArgb] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var totalVolumes: js.UndefOr[Double] = js.native
  
  var uid: js.UndefOr[String] = js.native
  
  var volumes: js.UndefOr[js.Array[Volume]] = js.native
}
object Bannerwithcontentcontainer {
  
  @scala.inline
  def apply(): Bannerwithcontentcontainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bannerwithcontentcontainer]
  }
  
  @scala.inline
  implicit class BannerwithcontentcontainerOps[Self <: Bannerwithcontentcontainer] (val x: Self) extends AnyVal {
    
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
    def setBanner_with_content_container(value: FillColorArgb): Self = this.set("banner_with_content_container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanner_with_content_container: Self = this.set("banner_with_content_container", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTotalVolumes(value: Double): Self = this.set("totalVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalVolumes: Self = this.set("totalVolumes", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
}

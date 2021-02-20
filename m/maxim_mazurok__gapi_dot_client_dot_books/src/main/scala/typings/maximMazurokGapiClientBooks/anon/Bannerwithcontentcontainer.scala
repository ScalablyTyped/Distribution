package typings.maximMazurokGapiClientBooks.anon

import typings.maximMazurokGapiClientBooks.gapi.client.books.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bannerwithcontentcontainer extends StObject {
  
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
  implicit class BannerwithcontentcontainerMutableBuilder[Self <: Bannerwithcontentcontainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanner_with_content_container(value: FillColorArgb): Self = StObject.set(x, "banner_with_content_container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBanner_with_content_containerUndefined: Self = StObject.set(x, "banner_with_content_container", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTotalVolumes(value: Double): Self = StObject.set(x, "totalVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalVolumesUndefined: Self = StObject.set(x, "totalVolumes", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}

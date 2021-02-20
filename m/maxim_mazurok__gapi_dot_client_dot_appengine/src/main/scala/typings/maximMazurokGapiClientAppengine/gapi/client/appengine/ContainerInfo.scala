package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerInfo extends StObject {
  
  /**
    * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: "gcr.io/my-project/image:tag" or
    * "gcr.io/my-project/image@digest"
    */
  var image: js.UndefOr[String] = js.native
}
object ContainerInfo {
  
  @scala.inline
  def apply(): ContainerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerInfo]
  }
  
  @scala.inline
  implicit class ContainerInfoMutableBuilder[Self <: ContainerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}

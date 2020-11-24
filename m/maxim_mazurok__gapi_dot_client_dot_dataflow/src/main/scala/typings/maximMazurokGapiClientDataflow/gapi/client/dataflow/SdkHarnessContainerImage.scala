package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdkHarnessContainerImage extends js.Object {
  
  /** A docker container image that resides in Google Container Registry. */
  var containerImage: js.UndefOr[String] = js.native
  
  /**
    * If true, recommends the Dataflow service to use only one core per SDK container instance with this image. If false (or unset) recommends using more than one core per SDK container
    * instance with this image for efficiency. Note that Dataflow service may choose to override this property if needed.
    */
  var useSingleCorePerContainer: js.UndefOr[Boolean] = js.native
}
object SdkHarnessContainerImage {
  
  @scala.inline
  def apply(): SdkHarnessContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkHarnessContainerImage]
  }
  
  @scala.inline
  implicit class SdkHarnessContainerImageOps[Self <: SdkHarnessContainerImage] (val x: Self) extends AnyVal {
    
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
    def setContainerImage(value: String): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("containerImage", js.undefined)
    
    @scala.inline
    def setUseSingleCorePerContainer(value: Boolean): Self = this.set("useSingleCorePerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSingleCorePerContainer: Self = this.set("useSingleCorePerContainer", js.undefined)
  }
}

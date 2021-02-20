package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdkHarnessContainerImage extends StObject {
  
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
  implicit class SdkHarnessContainerImageMutableBuilder[Self <: SdkHarnessContainerImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    @scala.inline
    def setUseSingleCorePerContainer(value: Boolean): Self = StObject.set(x, "useSingleCorePerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSingleCorePerContainerUndefined: Self = StObject.set(x, "useSingleCorePerContainer", js.undefined)
  }
}

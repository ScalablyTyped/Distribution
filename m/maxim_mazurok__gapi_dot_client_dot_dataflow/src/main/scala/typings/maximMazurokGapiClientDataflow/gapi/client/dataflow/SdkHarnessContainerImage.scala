package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkHarnessContainerImage extends StObject {
  
  /** A docker container image that resides in Google Container Registry. */
  var containerImage: js.UndefOr[String] = js.undefined
  
  /**
    * If true, recommends the Dataflow service to use only one core per SDK container instance with this image. If false (or unset) recommends using more than one core per SDK container
    * instance with this image for efficiency. Note that Dataflow service may choose to override this property if needed.
    */
  var useSingleCorePerContainer: js.UndefOr[Boolean] = js.undefined
}
object SdkHarnessContainerImage {
  
  inline def apply(): SdkHarnessContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkHarnessContainerImage]
  }
  
  extension [Self <: SdkHarnessContainerImage](x: Self) {
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setUseSingleCorePerContainer(value: Boolean): Self = StObject.set(x, "useSingleCorePerContainer", value.asInstanceOf[js.Any])
    
    inline def setUseSingleCorePerContainerUndefined: Self = StObject.set(x, "useSingleCorePerContainer", js.undefined)
  }
}

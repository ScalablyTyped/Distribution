package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkHarnessContainerImage extends StObject {
  
  /**
    * The set of capabilities enumerated in the above Environment proto. See also
    * [beam_runner_api.proto](https://github.com/apache/beam/blob/master/model/pipeline/src/main/proto/org/apache/beam/model/pipeline/v1/beam_runner_api.proto)
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A docker container image that resides in Google Container Registry. */
  var containerImage: js.UndefOr[String] = js.undefined
  
  /** Environment ID for the Beam runner API proto Environment that corresponds to the current SDK Harness. */
  var environmentId: js.UndefOr[String] = js.undefined
  
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
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setUseSingleCorePerContainer(value: Boolean): Self = StObject.set(x, "useSingleCorePerContainer", value.asInstanceOf[js.Any])
    
    inline def setUseSingleCorePerContainerUndefined: Self = StObject.set(x, "useSingleCorePerContainer", js.undefined)
  }
}

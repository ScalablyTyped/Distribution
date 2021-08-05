package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1beta1ImageDetails extends StObject {
  
  /** Required. Immutable. The child image derived from the base image. */
  var derivedImage: js.UndefOr[Derived] = js.undefined
}
object GrafeasV1beta1ImageDetails {
  
  inline def apply(): GrafeasV1beta1ImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1ImageDetails]
  }
  
  extension [Self <: GrafeasV1beta1ImageDetails](x: Self) {
    
    inline def setDerivedImage(value: Derived): Self = StObject.set(x, "derivedImage", value.asInstanceOf[js.Any])
    
    inline def setDerivedImageUndefined: Self = StObject.set(x, "derivedImage", js.undefined)
  }
}

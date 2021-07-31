package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1beta1PackageDetails extends StObject {
  
  /** Required. Where the package was installed. */
  var installation: js.UndefOr[Installation] = js.undefined
}
object GrafeasV1beta1PackageDetails {
  
  @scala.inline
  def apply(): GrafeasV1beta1PackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1PackageDetails]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1PackageDetailsMutableBuilder[Self <: GrafeasV1beta1PackageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallation(value: Installation): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
  }
}

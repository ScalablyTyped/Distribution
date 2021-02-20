package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a package occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1PackageDetails extends StObject {
  
  /**
    * Required. Where the package was installed.
    */
  var installation: js.UndefOr[SchemaInstallation] = js.native
}
object SchemaGrafeasV1beta1PackageDetails {
  
  @scala.inline
  def apply(): SchemaGrafeasV1beta1PackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1PackageDetails]
  }
  
  @scala.inline
  implicit class SchemaGrafeasV1beta1PackageDetailsMutableBuilder[Self <: SchemaGrafeasV1beta1PackageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallation(value: SchemaInstallation): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
  }
}

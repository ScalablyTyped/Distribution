package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEffectiveGuestPolicySourcedPackageRepository extends StObject {
  
  /**
    * A software package repository to configure on the VM instance.
    */
  var packageRepository: js.UndefOr[SchemaPackageRepository] = js.undefined
  
  /**
    * Name of the guest policy providing this config.
    */
  var source: js.UndefOr[String | Null] = js.undefined
}
object SchemaEffectiveGuestPolicySourcedPackageRepository {
  
  inline def apply(): SchemaEffectiveGuestPolicySourcedPackageRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEffectiveGuestPolicySourcedPackageRepository]
  }
  
  extension [Self <: SchemaEffectiveGuestPolicySourcedPackageRepository](x: Self) {
    
    inline def setPackageRepository(value: SchemaPackageRepository): Self = StObject.set(x, "packageRepository", value.asInstanceOf[js.Any])
    
    inline def setPackageRepositoryUndefined: Self = StObject.set(x, "packageRepository", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1beta1ImageDetails extends StObject {
  
  /**
    * Required. Immutable. The child image derived from the base image.
    */
  var derivedImage: js.UndefOr[SchemaDerived] = js.undefined
}
object SchemaGrafeasV1beta1ImageDetails {
  
  inline def apply(): SchemaGrafeasV1beta1ImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1ImageDetails]
  }
  
  extension [Self <: SchemaGrafeasV1beta1ImageDetails](x: Self) {
    
    inline def setDerivedImage(value: SchemaDerived): Self = StObject.set(x, "derivedImage", value.asInstanceOf[js.Any])
    
    inline def setDerivedImageUndefined: Self = StObject.set(x, "derivedImage", js.undefined)
  }
}

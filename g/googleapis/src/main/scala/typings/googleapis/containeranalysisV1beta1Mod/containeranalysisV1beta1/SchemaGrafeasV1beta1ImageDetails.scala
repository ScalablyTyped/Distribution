package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of an image occurrence.
  */
trait SchemaGrafeasV1beta1ImageDetails extends StObject {
  
  /**
    * Required. Immutable. The child image derived from the base image.
    */
  var derivedImage: js.UndefOr[SchemaDerived] = js.undefined
}
object SchemaGrafeasV1beta1ImageDetails {
  
  @scala.inline
  def apply(): SchemaGrafeasV1beta1ImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1ImageDetails]
  }
  
  @scala.inline
  implicit class SchemaGrafeasV1beta1ImageDetailsMutableBuilder[Self <: SchemaGrafeasV1beta1ImageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDerivedImage(value: SchemaDerived): Self = StObject.set(x, "derivedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivedImageUndefined: Self = StObject.set(x, "derivedImage", js.undefined)
  }
}

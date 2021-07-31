package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected start or end of a structural component.
  */
trait SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak extends StObject {
  
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreakMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

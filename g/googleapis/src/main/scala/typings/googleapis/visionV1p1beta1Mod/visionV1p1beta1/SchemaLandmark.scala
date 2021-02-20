package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A face-specific landmark (for example, a face feature).
  */
@js.native
trait SchemaLandmark extends StObject {
  
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
  
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaLandmark {
  
  @scala.inline
  def apply(): SchemaLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLandmark]
  }
  
  @scala.inline
  implicit class SchemaLandmarkMutableBuilder[Self <: SchemaLandmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

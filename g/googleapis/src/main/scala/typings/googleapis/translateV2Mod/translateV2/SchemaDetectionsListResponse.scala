package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDetectionsListResponse extends StObject {
  
  /**
    * A detections contains detection results of several text
    */
  var detections: js.UndefOr[js.Array[SchemaDetectionsResource]] = js.native
}
object SchemaDetectionsListResponse {
  
  @scala.inline
  def apply(): SchemaDetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectionsListResponse]
  }
  
  @scala.inline
  implicit class SchemaDetectionsListResponseMutableBuilder[Self <: SchemaDetectionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetections(value: js.Array[SchemaDetectionsResource]): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    @scala.inline
    def setDetectionsVarargs(value: SchemaDetectionsResource*): Self = StObject.set(x, "detections", js.Array(value :_*))
  }
}

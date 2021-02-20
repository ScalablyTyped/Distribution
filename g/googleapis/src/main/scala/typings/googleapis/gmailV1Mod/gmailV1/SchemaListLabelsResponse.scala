package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListLabelsResponse extends StObject {
  
  /**
    * List of labels.
    */
  var labels: js.UndefOr[js.Array[SchemaLabel]] = js.native
}
object SchemaListLabelsResponse {
  
  @scala.inline
  def apply(): SchemaListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLabelsResponse]
  }
  
  @scala.inline
  implicit class SchemaListLabelsResponseMutableBuilder[Self <: SchemaListLabelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: js.Array[SchemaLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaLabel*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}

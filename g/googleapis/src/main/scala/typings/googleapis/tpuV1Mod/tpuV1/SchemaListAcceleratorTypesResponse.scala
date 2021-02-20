package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListAcceleratorTypes.
  */
@js.native
trait SchemaListAcceleratorTypesResponse extends StObject {
  
  /**
    * The listed nodes.
    */
  var acceleratorTypes: js.UndefOr[js.Array[SchemaAcceleratorType]] = js.native
  
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListAcceleratorTypesResponse {
  
  @scala.inline
  def apply(): SchemaListAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAcceleratorTypesResponse]
  }
  
  @scala.inline
  implicit class SchemaListAcceleratorTypesResponseMutableBuilder[Self <: SchemaListAcceleratorTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypes(value: js.Array[SchemaAcceleratorType]): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: SchemaAcceleratorType*): Self = StObject.set(x, "acceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

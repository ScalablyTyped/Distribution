package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListAcceleratorTypes.
  */
@js.native
trait SchemaListAcceleratorTypesResponse extends js.Object {
  
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
  implicit class SchemaListAcceleratorTypesResponseOps[Self <: SchemaListAcceleratorTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: SchemaAcceleratorType*): Self = this.set("acceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setAcceleratorTypes(value: js.Array[SchemaAcceleratorType]): Self = this.set("acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorTypes: Self = this.set("acceleratorTypes", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}

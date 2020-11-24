package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListOperationsResponse is the result of ListOperationsRequest.
  */
@js.native
trait SchemaListOperationsResponse extends js.Object {
  
  /**
    * If any zones are listed here, the list of operations returned may be
    * missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of operations in the project in the specified zone.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
}
object SchemaListOperationsResponse {
  
  @scala.inline
  def apply(): SchemaListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOperationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListOperationsResponseOps[Self <: SchemaListOperationsResponse] (val x: Self) extends AnyVal {
    
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
    def setMissingZonesVarargs(value: String*): Self = this.set("missingZones", js.Array(value :_*))
    
    @scala.inline
    def setMissingZones(value: js.Array[String]): Self = this.set("missingZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingZones: Self = this.set("missingZones", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: SchemaOperation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: js.Array[SchemaOperation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
}

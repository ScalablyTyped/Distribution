package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMetadataResult extends js.Object {
  
  var metadataObjects: js.Array[MetadataObject] = js.native
  
  var organizationNamespace: String = js.native
  
  var partialSaveAllowed: Boolean = js.native
  
  var testRequired: Boolean = js.native
}
object DescribeMetadataResult {
  
  @scala.inline
  def apply(
    metadataObjects: js.Array[MetadataObject],
    organizationNamespace: String,
    partialSaveAllowed: Boolean,
    testRequired: Boolean
  ): DescribeMetadataResult = {
    val __obj = js.Dynamic.literal(metadataObjects = metadataObjects.asInstanceOf[js.Any], organizationNamespace = organizationNamespace.asInstanceOf[js.Any], partialSaveAllowed = partialSaveAllowed.asInstanceOf[js.Any], testRequired = testRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMetadataResult]
  }
  
  @scala.inline
  implicit class DescribeMetadataResultOps[Self <: DescribeMetadataResult] (val x: Self) extends AnyVal {
    
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
    def setMetadataObjectsVarargs(value: MetadataObject*): Self = this.set("metadataObjects", js.Array(value :_*))
    
    @scala.inline
    def setMetadataObjects(value: js.Array[MetadataObject]): Self = this.set("metadataObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationNamespace(value: String): Self = this.set("organizationNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialSaveAllowed(value: Boolean): Self = this.set("partialSaveAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRequired(value: Boolean): Self = this.set("testRequired", value.asInstanceOf[js.Any])
  }
}

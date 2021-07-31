package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetadataResult extends StObject {
  
  var metadataObjects: js.Array[MetadataObject]
  
  var organizationNamespace: String
  
  var partialSaveAllowed: Boolean
  
  var testRequired: Boolean
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
  implicit class DescribeMetadataResultMutableBuilder[Self <: DescribeMetadataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadataObjects(value: js.Array[MetadataObject]): Self = StObject.set(x, "metadataObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataObjectsVarargs(value: MetadataObject*): Self = StObject.set(x, "metadataObjects", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationNamespace(value: String): Self = StObject.set(x, "organizationNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialSaveAllowed(value: Boolean): Self = StObject.set(x, "partialSaveAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRequired(value: Boolean): Self = StObject.set(x, "testRequired", value.asInstanceOf[js.Any])
  }
}

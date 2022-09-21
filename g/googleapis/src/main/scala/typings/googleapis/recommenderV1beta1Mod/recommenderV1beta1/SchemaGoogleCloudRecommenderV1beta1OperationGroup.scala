package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1OperationGroup extends StObject {
  
  /**
    * List of operations across one or more resources that belong to this group. Loosely based on RFC6902 and should be performed in the order they appear.
    */
  var operations: js.UndefOr[js.Array[SchemaGoogleCloudRecommenderV1beta1Operation]] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1OperationGroup {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1OperationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1OperationGroup]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1OperationGroup](x: Self) {
    
    inline def setOperations(value: js.Array[SchemaGoogleCloudRecommenderV1beta1Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaGoogleCloudRecommenderV1beta1Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}

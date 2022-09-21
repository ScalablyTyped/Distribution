package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnrolledService extends StObject {
  
  /**
    * The product for which Access Approval will be enrolled. Allowed values are listed below (case-sensitive): &lt;ol&gt;   &lt;li&gt;all&lt;/li&gt;   &lt;li&gt;appengine.googleapis.com&lt;/li&gt;   &lt;li&gt;bigquery.googleapis.com&lt;/li&gt;   &lt;li&gt;bigtable.googleapis.com&lt;/li&gt;   &lt;li&gt;cloudkms.googleapis.com&lt;/li&gt;   &lt;li&gt;compute.googleapis.com&lt;/li&gt;   &lt;li&gt;dataflow.googleapis.com&lt;/li&gt;   &lt;li&gt;iam.googleapis.com&lt;/li&gt;   &lt;li&gt;pubsub.googleapis.com&lt;/li&gt;   &lt;li&gt;storage.googleapis.com&lt;/li&gt; &lt;ol&gt;
    */
  var cloudProduct: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The enrollment level of the service.
    */
  var enrollmentLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnrolledService {
  
  inline def apply(): SchemaEnrolledService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnrolledService]
  }
  
  extension [Self <: SchemaEnrolledService](x: Self) {
    
    inline def setCloudProduct(value: String): Self = StObject.set(x, "cloudProduct", value.asInstanceOf[js.Any])
    
    inline def setCloudProductNull: Self = StObject.set(x, "cloudProduct", null)
    
    inline def setCloudProductUndefined: Self = StObject.set(x, "cloudProduct", js.undefined)
    
    inline def setEnrollmentLevel(value: String): Self = StObject.set(x, "enrollmentLevel", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentLevelNull: Self = StObject.set(x, "enrollmentLevel", null)
    
    inline def setEnrollmentLevelUndefined: Self = StObject.set(x, "enrollmentLevel", js.undefined)
  }
}

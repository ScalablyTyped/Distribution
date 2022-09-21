package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionTemplateSpec extends StObject {
  
  /**
    * Optional. Optional metadata for this Execution, including labels and annotations. The following annotation keys set properties of the created execution: * `run.googleapis.com/cloudsql-instances` sets Cloud SQL connections. Multiple values should be comma separated. * `run.googleapis.com/vpc-access-connector` sets a Serverless VPC Access connector. * `run.googleapis.com/vpc-access-egress` sets VPC egress. Supported values are `all-traffic`, `all` (deprecated), and `private-ranges-only`. `all-traffic` and `all` provide the same functionality. `all` is deprecated but will continue to be supported. Prefer `all-traffic`.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.undefined
  
  /**
    * Required. ExecutionSpec holds the desired configuration for executions of this job.
    */
  var spec: js.UndefOr[SchemaExecutionSpec] = js.undefined
}
object SchemaExecutionTemplateSpec {
  
  inline def apply(): SchemaExecutionTemplateSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionTemplateSpec]
  }
  
  extension [Self <: SchemaExecutionTemplateSpec](x: Self) {
    
    inline def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: SchemaExecutionSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}

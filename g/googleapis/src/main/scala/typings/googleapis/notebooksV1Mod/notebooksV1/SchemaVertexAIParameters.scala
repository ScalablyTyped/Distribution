package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVertexAIParameters extends StObject {
  
  /**
    * Environment variables. At most 100 environment variables can be specified and unique. Example: GCP_BUCKET=gs://my-bucket/samples/
    */
  var env: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The full name of the Compute Engine [network](/compute/docs/networks-and-firewalls#networks) to which the Job should be peered. For example, `projects/12345/global/networks/myVPC`. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert) is of the form `projects/{project\}/global/networks/{network\}`. Where {project\} is a project number, as in `12345`, and {network\} is a network name. Private services access must already be configured for the network. If left unspecified, the job is not peered with any network.
    */
  var network: js.UndefOr[String | Null] = js.undefined
}
object SchemaVertexAIParameters {
  
  inline def apply(): SchemaVertexAIParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVertexAIParameters]
  }
  
  extension [Self <: SchemaVertexAIParameters](x: Self) {
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvNull: Self = StObject.set(x, "env", null)
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}

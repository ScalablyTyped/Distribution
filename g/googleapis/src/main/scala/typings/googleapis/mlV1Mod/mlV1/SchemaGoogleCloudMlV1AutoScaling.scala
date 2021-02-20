package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for automatically scaling a model.
  */
@js.native
trait SchemaGoogleCloudMlV1AutoScaling extends StObject {
  
  /**
    * Optional. The minimum number of nodes to allocate for this model. These
    * nodes are always up, starting from the time the model is deployed.
    * Therefore, the cost of operating this model will be at least `rate` *
    * `min_nodes` * number of hours since last billing cycle, where `rate` is
    * the cost per node-hour as documented in the [pricing
    * guide](/ml-engine/docs/pricing), even if no predictions are performed.
    * There is additional cost for each prediction performed.  Unlike manual
    * scaling, if the load gets too heavy for the nodes that are up, the
    * service will automatically add nodes to handle the increased load as well
    * as scale back as traffic drops, always maintaining at least `min_nodes`.
    * You will be charged for the time in which additional nodes are used.  If
    * not specified, `min_nodes` defaults to 0, in which case, when traffic to
    * a model stops (and after a cool-down period), nodes will be shut down and
    * no charges will be incurred until traffic to the model resumes.  You can
    * set `min_nodes` when creating the model version, and you can also update
    * `min_nodes` for an existing version: &lt;pre&gt; update_body.json: {
    * &#39;autoScaling&#39;: {     &#39;minNodes&#39;: 5   } } &lt;/pre&gt;
    * HTTP request: &lt;pre&gt; PATCH
    * https://ml.googleapis.com/v1/{name=projects/x/models/x/versions/ *}?update_mask=autoScaling.minNodes
    * -d @./update_body.json &lt;/pre&gt;
    */
  var minNodes: js.UndefOr[Double] = js.native
}
object SchemaGoogleCloudMlV1AutoScaling {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1AutoScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1AutoScaling]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1AutoScalingMutableBuilder[Self <: SchemaGoogleCloudMlV1AutoScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinNodes(value: Double): Self = StObject.set(x, "minNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodesUndefined: Self = StObject.set(x, "minNodes", js.undefined)
  }
}

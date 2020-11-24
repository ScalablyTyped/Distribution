package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the size bounds of an instance group, including its
  * proportional size to other groups.
  */
@js.native
trait SchemaInstanceGroupAutoscalingPolicyConfig extends js.Object {
  
  /**
    * Optional. Maximum number of instances for this group. Required for
    * primary workers. Note that by default, clusters will not use secondary
    * workers. Required for secondary workers if the minimum secondary
    * instances is set.Primary workers - Bounds: [min_instances, ). Required.
    * Secondary workers - Bounds: [min_instances, ). Default: 0.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Minimum number of instances for this group.Primary workers -
    * Bounds: 2, max_instances. Default: 2. Secondary workers - Bounds: 0,
    * max_instances. Default: 0.
    */
  var minInstances: js.UndefOr[Double] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object SchemaInstanceGroupAutoscalingPolicyConfig {
  
  @scala.inline
  def apply(): SchemaInstanceGroupAutoscalingPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupAutoscalingPolicyConfig]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupAutoscalingPolicyConfigOps[Self <: SchemaInstanceGroupAutoscalingPolicyConfig] (val x: Self) extends AnyVal {
    
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
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
    
    @scala.inline
    def setMinInstances(value: Double): Self = this.set("minInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinInstances: Self = this.set("minInstances", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}

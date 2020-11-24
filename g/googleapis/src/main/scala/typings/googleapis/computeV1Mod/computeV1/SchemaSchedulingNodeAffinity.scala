package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Affinity: the configuration of desired nodes onto which this Instance
  * could be scheduled.
  */
@js.native
trait SchemaSchedulingNodeAffinity extends js.Object {
  
  /**
    * Corresponds to the label key of Node resource.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Defines the operation of node selection.
    */
  var operator: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to the label values of Node resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaSchedulingNodeAffinity {
  
  @scala.inline
  def apply(): SchemaSchedulingNodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingNodeAffinity]
  }
  
  @scala.inline
  implicit class SchemaSchedulingNodeAffinityOps[Self <: SchemaSchedulingNodeAffinity] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}

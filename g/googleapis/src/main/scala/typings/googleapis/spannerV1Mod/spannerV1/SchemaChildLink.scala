package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata associated with a parent-child relationship appearing in a
  * PlanNode.
  */
@js.native
trait SchemaChildLink extends js.Object {
  
  /**
    * The node to which the link points.
    */
  var childIndex: js.UndefOr[Double] = js.native
  
  /**
    * The type of the link. For example, in Hash Joins this could be used to
    * distinguish between the build child and the probe child, or in the case
    * of the child being an output variable, to represent the tag associated
    * with the output variable.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Only present if the child node is SCALAR and corresponds to an output
    * variable of the parent node. The field carries the name of the output
    * variable. For example, a `TableScan` operator that reads rows from a
    * table will have child links to the `SCALAR` nodes representing the output
    * variables created for each column that is read by the operator. The
    * corresponding `variable` fields will be set to the variable names
    * assigned to the columns.
    */
  var variable: js.UndefOr[String] = js.native
}
object SchemaChildLink {
  
  @scala.inline
  def apply(): SchemaChildLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChildLink]
  }
  
  @scala.inline
  implicit class SchemaChildLinkOps[Self <: SchemaChildLink] (val x: Self) extends AnyVal {
    
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
    def setChildIndex(value: Double): Self = this.set("childIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildIndex: Self = this.set("childIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVariable(value: String): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}

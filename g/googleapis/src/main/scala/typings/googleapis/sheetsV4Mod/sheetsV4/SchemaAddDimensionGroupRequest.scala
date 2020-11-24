package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a group over the specified range.  If the requested range is a
  * superset of the range of an existing group G, then the depth of G is
  * incremented and this new group G&#39; has the depth of that group. For
  * example, a group [C:D, depth 1] + [B:E] results in groups [B:E, depth 1]
  * and [C:D, depth 2]. If the requested range is a subset of the range of an
  * existing group G, then the depth of the new group G&#39; becomes one
  * greater than the depth of G. For example, a group [B:E, depth 1] + [C:D]
  * results in groups [B:E, depth 1] and [C:D, depth 2]. If the requested range
  * starts before and ends within, or starts within and ends after, the range
  * of an existing group G, then the range of the existing group G becomes the
  * union of the ranges, and the new group G&#39; has depth one greater than
  * the depth of G and range as the intersection of the ranges. For example, a
  * group [B:D, depth 1] + [C:E] results in groups [B:E, depth 1] and [C:D,
  * depth 2].
  */
@js.native
trait SchemaAddDimensionGroupRequest extends js.Object {
  
  /**
    * The range over which to create a group.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.native
}
object SchemaAddDimensionGroupRequest {
  
  @scala.inline
  def apply(): SchemaAddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDimensionGroupRequest]
  }
  
  @scala.inline
  implicit class SchemaAddDimensionGroupRequestOps[Self <: SchemaAddDimensionGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: SchemaDimensionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}

package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metric value representing a list of integers.
  */
@js.native
trait SchemaIntegerList extends js.Object {
  
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[SchemaSplitInt64]] = js.native
}
object SchemaIntegerList {
  
  @scala.inline
  def apply(): SchemaIntegerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerList]
  }
  
  @scala.inline
  implicit class SchemaIntegerListOps[Self <: SchemaIntegerList] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: SchemaSplitInt64*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[SchemaSplitInt64]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
  }
}

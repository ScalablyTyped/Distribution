package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sorts data in rows based on a sort order per column.
  */
@js.native
trait SchemaSortRangeRequest extends StObject {
  
  /**
    * The range to sort.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
}
object SchemaSortRangeRequest {
  
  @scala.inline
  def apply(): SchemaSortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaSortRangeRequestMutableBuilder[Self <: SchemaSortRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSortSpecs(value: js.Array[SchemaSortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SchemaSortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
  }
}

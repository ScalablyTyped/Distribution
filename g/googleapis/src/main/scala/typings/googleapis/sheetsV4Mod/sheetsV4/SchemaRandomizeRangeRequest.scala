package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Randomizes the order of the rows in a range.
  */
@js.native
trait SchemaRandomizeRangeRequest extends StObject {
  
  /**
    * The range to randomize.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaRandomizeRangeRequest {
  
  @scala.inline
  def apply(): SchemaRandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRandomizeRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaRandomizeRangeRequestMutableBuilder[Self <: SchemaRandomizeRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}

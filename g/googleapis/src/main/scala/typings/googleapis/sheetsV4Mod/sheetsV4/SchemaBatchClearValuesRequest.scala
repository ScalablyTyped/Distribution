package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for clearing more than one range of values in a spreadsheet.
  */
@js.native
trait SchemaBatchClearValuesRequest extends StObject {
  
  /**
    * The ranges to clear, in A1 notation.
    */
  var ranges: js.UndefOr[js.Array[String]] = js.native
}
object SchemaBatchClearValuesRequest {
  
  @scala.inline
  def apply(): SchemaBatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchClearValuesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchClearValuesRequestMutableBuilder[Self <: SchemaBatchClearValuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}

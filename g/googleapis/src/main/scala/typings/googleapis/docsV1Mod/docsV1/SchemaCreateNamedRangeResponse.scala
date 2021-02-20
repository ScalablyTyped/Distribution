package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating a named range.
  */
@js.native
trait SchemaCreateNamedRangeResponse extends StObject {
  
  /**
    * The ID of the created named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}
object SchemaCreateNamedRangeResponse {
  
  @scala.inline
  def apply(): SchemaCreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNamedRangeResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateNamedRangeResponseMutableBuilder[Self <: SchemaCreateNamedRangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}

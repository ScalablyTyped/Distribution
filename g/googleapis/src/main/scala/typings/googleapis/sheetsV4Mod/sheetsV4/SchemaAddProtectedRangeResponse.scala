package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a new protected range.
  */
@js.native
trait SchemaAddProtectedRangeResponse extends StObject {
  
  /**
    * The newly added protected range.
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.native
}
object SchemaAddProtectedRangeResponse {
  
  @scala.inline
  def apply(): SchemaAddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProtectedRangeResponse]
  }
  
  @scala.inline
  implicit class SchemaAddProtectedRangeResponseMutableBuilder[Self <: SchemaAddProtectedRangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectedRange(value: SchemaProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}

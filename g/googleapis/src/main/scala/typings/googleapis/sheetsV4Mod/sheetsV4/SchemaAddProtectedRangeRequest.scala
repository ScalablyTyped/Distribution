package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a new protected range.
  */
trait SchemaAddProtectedRangeRequest extends StObject {
  
  /**
    * The protected range to be added. The protectedRangeId field is optional;
    * if one is not set, an id will be randomly generated. (It is an error to
    * specify the ID of a range that already exists.)
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.undefined
}
object SchemaAddProtectedRangeRequest {
  
  @scala.inline
  def apply(): SchemaAddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaAddProtectedRangeRequestMutableBuilder[Self <: SchemaAddProtectedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectedRange(value: SchemaProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}

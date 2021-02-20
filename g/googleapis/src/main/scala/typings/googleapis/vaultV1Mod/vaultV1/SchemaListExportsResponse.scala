package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The holds for a matter.
  */
@js.native
trait SchemaListExportsResponse extends StObject {
  
  /**
    * The list of exports.
    */
  var exports: js.UndefOr[js.Array[SchemaExport]] = js.native
  
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListExportsResponse {
  
  @scala.inline
  def apply(): SchemaListExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExportsResponse]
  }
  
  @scala.inline
  implicit class SchemaListExportsResponseMutableBuilder[Self <: SchemaListExportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExports(value: js.Array[SchemaExport]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: SchemaExport*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the list of matters.
  */
@js.native
trait SchemaListMattersResponse extends StObject {
  
  /**
    * List of matters.
    */
  var matters: js.UndefOr[js.Array[SchemaMatter]] = js.native
  
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListMattersResponse {
  
  @scala.inline
  def apply(): SchemaListMattersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMattersResponse]
  }
  
  @scala.inline
  implicit class SchemaListMattersResponseMutableBuilder[Self <: SchemaListMattersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatters(value: js.Array[SchemaMatter]): Self = StObject.set(x, "matters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMattersUndefined: Self = StObject.set(x, "matters", js.undefined)
    
    @scala.inline
    def setMattersVarargs(value: SchemaMatter*): Self = StObject.set(x, "matters", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

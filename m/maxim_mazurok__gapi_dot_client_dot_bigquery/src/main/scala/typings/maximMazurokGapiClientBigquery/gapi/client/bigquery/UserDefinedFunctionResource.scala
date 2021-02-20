package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedFunctionResource extends StObject {
  
  /**
    * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same
    * code.
    */
  var inlineCode: js.UndefOr[String] = js.native
  
  /** [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path). */
  var resourceUri: js.UndefOr[String] = js.native
}
object UserDefinedFunctionResource {
  
  @scala.inline
  def apply(): UserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionResource]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionResourceMutableBuilder[Self <: UserDefinedFunctionResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineCode(value: String): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
    
    @scala.inline
    def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}

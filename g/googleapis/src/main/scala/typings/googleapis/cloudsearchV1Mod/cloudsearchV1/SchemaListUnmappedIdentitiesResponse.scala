package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUnmappedIdentitiesResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var unmappedIdentities: js.UndefOr[js.Array[SchemaUnmappedIdentity]] = js.undefined
}
object SchemaListUnmappedIdentitiesResponse {
  
  @scala.inline
  def apply(): SchemaListUnmappedIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUnmappedIdentitiesResponse]
  }
  
  @scala.inline
  implicit class SchemaListUnmappedIdentitiesResponseMutableBuilder[Self <: SchemaListUnmappedIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnmappedIdentities(value: js.Array[SchemaUnmappedIdentity]): Self = StObject.set(x, "unmappedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedIdentitiesUndefined: Self = StObject.set(x, "unmappedIdentities", js.undefined)
    
    @scala.inline
    def setUnmappedIdentitiesVarargs(value: SchemaUnmappedIdentity*): Self = StObject.set(x, "unmappedIdentities", js.Array(value :_*))
  }
}

package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Building List Response object in Directory API.
  */
@js.native
trait SchemaBuildings extends StObject {
  
  /**
    * The Buildings in this page of results.
    */
  var buildings: js.UndefOr[js.Array[SchemaBuilding]] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaBuildings {
  
  @scala.inline
  def apply(): SchemaBuildings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildings]
  }
  
  @scala.inline
  implicit class SchemaBuildingsMutableBuilder[Self <: SchemaBuildings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildings(value: js.Array[SchemaBuilding]): Self = StObject.set(x, "buildings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingsUndefined: Self = StObject.set(x, "buildings", js.undefined)
    
    @scala.inline
    def setBuildingsVarargs(value: SchemaBuilding*): Self = StObject.set(x, "buildings", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

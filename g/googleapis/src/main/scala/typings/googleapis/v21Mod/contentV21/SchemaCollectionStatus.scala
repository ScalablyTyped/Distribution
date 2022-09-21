package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectionStatus extends StObject {
  
  /**
    * A list of all issues associated with the collection.
    */
  var collectionLevelIssuses: js.UndefOr[js.Array[SchemaCollectionStatusItemLevelIssue]] = js.undefined
  
  /**
    * Date on which the collection has been created in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time, and offset, for example "2020-01-02T09:00:00+01:00" or "2020-01-02T09:00:00Z"
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The intended destinations for the collection.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaCollectionStatusDestinationStatus]] = js.undefined
  
  /**
    * Required. The ID of the collection for which status is reported.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date on which the collection has been last updated in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time, and offset, for example "2020-01-02T09:00:00+01:00" or "2020-01-02T09:00:00Z"
    */
  var lastUpdateDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaCollectionStatus {
  
  inline def apply(): SchemaCollectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionStatus]
  }
  
  extension [Self <: SchemaCollectionStatus](x: Self) {
    
    inline def setCollectionLevelIssuses(value: js.Array[SchemaCollectionStatusItemLevelIssue]): Self = StObject.set(x, "collectionLevelIssuses", value.asInstanceOf[js.Any])
    
    inline def setCollectionLevelIssusesUndefined: Self = StObject.set(x, "collectionLevelIssuses", js.undefined)
    
    inline def setCollectionLevelIssusesVarargs(value: SchemaCollectionStatusItemLevelIssue*): Self = StObject.set(x, "collectionLevelIssuses", js.Array(value*))
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDestinationStatuses(value: js.Array[SchemaCollectionStatusDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    inline def setDestinationStatusesVarargs(value: SchemaCollectionStatusDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdateDate(value: String): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateNull: Self = StObject.set(x, "lastUpdateDate", null)
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
  }
}

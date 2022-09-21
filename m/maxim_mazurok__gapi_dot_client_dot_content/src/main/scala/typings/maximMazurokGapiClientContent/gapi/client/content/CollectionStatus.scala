package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionStatus extends StObject {
  
  /** A list of all issues associated with the collection. */
  var collectionLevelIssuses: js.UndefOr[js.Array[CollectionStatusItemLevelIssue]] = js.undefined
  
  /**
    * Date on which the collection has been created in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time, and offset, for example "2020-01-02T09:00:00+01:00" or
    * "2020-01-02T09:00:00Z"
    */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /** The intended destinations for the collection. */
  var destinationStatuses: js.UndefOr[js.Array[CollectionStatusDestinationStatus]] = js.undefined
  
  /** Required. The ID of the collection for which status is reported. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Date on which the collection has been last updated in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time, and offset, for example "2020-01-02T09:00:00+01:00" or
    * "2020-01-02T09:00:00Z"
    */
  var lastUpdateDate: js.UndefOr[String] = js.undefined
}
object CollectionStatus {
  
  inline def apply(): CollectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionStatus]
  }
  
  extension [Self <: CollectionStatus](x: Self) {
    
    inline def setCollectionLevelIssuses(value: js.Array[CollectionStatusItemLevelIssue]): Self = StObject.set(x, "collectionLevelIssuses", value.asInstanceOf[js.Any])
    
    inline def setCollectionLevelIssusesUndefined: Self = StObject.set(x, "collectionLevelIssuses", js.undefined)
    
    inline def setCollectionLevelIssusesVarargs(value: CollectionStatusItemLevelIssue*): Self = StObject.set(x, "collectionLevelIssuses", js.Array(value*))
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDestinationStatuses(value: js.Array[CollectionStatusDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    inline def setDestinationStatusesVarargs(value: CollectionStatusDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdateDate(value: String): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
  }
}

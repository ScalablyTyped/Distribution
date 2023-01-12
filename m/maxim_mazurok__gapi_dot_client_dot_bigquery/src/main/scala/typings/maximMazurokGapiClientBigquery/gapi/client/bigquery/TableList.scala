package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableList extends StObject {
  
  /** A hash of this page of results. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The type of list. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Tables in the requested dataset. */
  var tables: js.UndefOr[js.Array[typings.maximMazurokGapiClientBigquery.anon.Clustering]] = js.undefined
  
  /** The total number of tables in the dataset. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object TableList {
  
  inline def apply(): TableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableList] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTables(value: js.Array[typings.maximMazurokGapiClientBigquery.anon.Clustering]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: typings.maximMazurokGapiClientBigquery.anon.Clustering*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}

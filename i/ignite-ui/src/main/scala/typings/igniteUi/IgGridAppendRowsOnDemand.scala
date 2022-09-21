package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridAppendRowsOnDemand
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested chunk index
    *
    */
  var chunkIndexUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * Default number of records per chunk
    *
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested chunk size
    *
    */
  var chunkSizeUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * Current chunk index position
    *
    */
  var currentChunkIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Initial chunk index position
    *
    */
  var defaultChunkIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    *             Specifies caption text for the "load more data" button. Use option [locale.loadMoreDataButtonText](ui.iggridappendrowsondemand#options:locale.loadMoreDataButtonText).
    */
  var loadMoreDataButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * denotes the append rows on demand request method
    *
    *
    * Valid values:
    * "auto" new record will be appended to the grid while the user scrolls the scrollbar
    * "button" a button will be rendered at the bottom of the grid. The user should press it to load more rows
    */
  var loadTrigger: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[IgGridAppendRowsOnDemandLocale] = js.undefined
  
  /**
    * The property in the response that will hold the total number of records in the data source
    *
    */
  var recordCountKey: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the requested rows are returned from the remote endpoint, but before grid data rebinds
    */
  var rowsRequested: js.UndefOr[RowsRequestedEvent] = js.undefined
  
  /**
    * Event fired before the rows are requested from the remote endpoint.
    * Return false in order to cancel requesting of rows.
    */
  var rowsRequesting: js.UndefOr[RowsRequestingEvent] = js.undefined
  
  /**
    * Defines local or remote type of appending rows on demand in igGrid
    *
    *
    * Valid values:
    * "remote" request data from the remote endpoint
    * "local" loading data on the client-side
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IgGridAppendRowsOnDemand {
  
  inline def apply(): IgGridAppendRowsOnDemand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridAppendRowsOnDemand]
  }
  
  extension [Self <: IgGridAppendRowsOnDemand](x: Self) {
    
    inline def setChunkIndexUrlKey(value: String): Self = StObject.set(x, "chunkIndexUrlKey", value.asInstanceOf[js.Any])
    
    inline def setChunkIndexUrlKeyUndefined: Self = StObject.set(x, "chunkIndexUrlKey", js.undefined)
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setChunkSizeUrlKey(value: String): Self = StObject.set(x, "chunkSizeUrlKey", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUrlKeyUndefined: Self = StObject.set(x, "chunkSizeUrlKey", js.undefined)
    
    inline def setCurrentChunkIndex(value: Double): Self = StObject.set(x, "currentChunkIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentChunkIndexUndefined: Self = StObject.set(x, "currentChunkIndex", js.undefined)
    
    inline def setDefaultChunkIndex(value: Double): Self = StObject.set(x, "defaultChunkIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultChunkIndexUndefined: Self = StObject.set(x, "defaultChunkIndex", js.undefined)
    
    inline def setLoadMoreDataButtonText(value: String): Self = StObject.set(x, "loadMoreDataButtonText", value.asInstanceOf[js.Any])
    
    inline def setLoadMoreDataButtonTextUndefined: Self = StObject.set(x, "loadMoreDataButtonText", js.undefined)
    
    inline def setLoadTrigger(value: String): Self = StObject.set(x, "loadTrigger", value.asInstanceOf[js.Any])
    
    inline def setLoadTriggerUndefined: Self = StObject.set(x, "loadTrigger", js.undefined)
    
    inline def setLocale(value: IgGridAppendRowsOnDemandLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRecordCountKey(value: String): Self = StObject.set(x, "recordCountKey", value.asInstanceOf[js.Any])
    
    inline def setRecordCountKeyUndefined: Self = StObject.set(x, "recordCountKey", js.undefined)
    
    inline def setRowsRequested(value: (/* event */ Event, /* ui */ RowsRequestedEventUIParam) => Unit): Self = StObject.set(x, "rowsRequested", js.Any.fromFunction2(value))
    
    inline def setRowsRequestedUndefined: Self = StObject.set(x, "rowsRequested", js.undefined)
    
    inline def setRowsRequesting(value: (/* event */ Event, /* ui */ RowsRequestingEventUIParam) => Unit): Self = StObject.set(x, "rowsRequesting", js.Any.fromFunction2(value))
    
    inline def setRowsRequestingUndefined: Self = StObject.set(x, "rowsRequesting", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

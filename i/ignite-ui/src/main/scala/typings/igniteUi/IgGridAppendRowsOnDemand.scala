package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridAppendRowsOnDemand
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested chunk index
    *
    */
  var chunkIndexUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Default number of records per chunk
    *
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested chunk size
    *
    */
  var chunkSizeUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Current chunk index position
    *
    */
  var currentChunkIndex: js.UndefOr[Double] = js.native
  
  /**
    * Initial chunk index position
    *
    */
  var defaultChunkIndex: js.UndefOr[Double] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    *             Specifies caption text for the "load more data" button. Use option [locale.loadMoreDataButtonText](ui.iggridappendrowsondemand#options:locale.loadMoreDataButtonText).
    */
  var loadMoreDataButtonText: js.UndefOr[String] = js.native
  
  /**
    * denotes the append rows on demand request method
    *
    *
    * Valid values:
    * "auto" new record will be appended to the grid while the user scrolls the scrollbar
    * "button" a button will be rendered at the bottom of the grid. The user should press it to load more rows
    */
  var loadTrigger: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[IgGridAppendRowsOnDemandLocale] = js.native
  
  /**
    * The property in the response that will hold the total number of records in the data source
    *
    */
  var recordCountKey: js.UndefOr[String] = js.native
  
  /**
    * Event fired after the requested rows are returned from the remote endpoint, but before grid data rebinds
    */
  var rowsRequested: js.UndefOr[RowsRequestedEvent] = js.native
  
  /**
    * Event fired before the rows are requested from the remote endpoint.
    * Return false in order to cancel requesting of rows.
    */
  var rowsRequesting: js.UndefOr[RowsRequestingEvent] = js.native
  
  /**
    * Defines local or remote type of appending rows on demand in igGrid
    *
    *
    * Valid values:
    * "remote" request data from the remote endpoint
    * "local" loading data on the client-side
    */
  var `type`: js.UndefOr[String] = js.native
}
object IgGridAppendRowsOnDemand {
  
  @scala.inline
  def apply(): IgGridAppendRowsOnDemand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridAppendRowsOnDemand]
  }
  
  @scala.inline
  implicit class IgGridAppendRowsOnDemandOps[Self <: IgGridAppendRowsOnDemand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunkIndexUrlKey(value: String): Self = this.set("chunkIndexUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkIndexUrlKey: Self = this.set("chunkIndexUrlKey", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setChunkSizeUrlKey(value: String): Self = this.set("chunkSizeUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSizeUrlKey: Self = this.set("chunkSizeUrlKey", js.undefined)
    
    @scala.inline
    def setCurrentChunkIndex(value: Double): Self = this.set("currentChunkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentChunkIndex: Self = this.set("currentChunkIndex", js.undefined)
    
    @scala.inline
    def setDefaultChunkIndex(value: Double): Self = this.set("defaultChunkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChunkIndex: Self = this.set("defaultChunkIndex", js.undefined)
    
    @scala.inline
    def setLoadMoreDataButtonText(value: String): Self = this.set("loadMoreDataButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMoreDataButtonText: Self = this.set("loadMoreDataButtonText", js.undefined)
    
    @scala.inline
    def setLoadTrigger(value: String): Self = this.set("loadTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadTrigger: Self = this.set("loadTrigger", js.undefined)
    
    @scala.inline
    def setLocale(value: IgGridAppendRowsOnDemandLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setRecordCountKey(value: String): Self = this.set("recordCountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountKey: Self = this.set("recordCountKey", js.undefined)
    
    @scala.inline
    def setRowsRequested(value: (/* event */ Event, /* ui */ RowsRequestedEventUIParam) => Unit): Self = this.set("rowsRequested", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRowsRequested: Self = this.set("rowsRequested", js.undefined)
    
    @scala.inline
    def setRowsRequesting(value: (/* event */ Event, /* ui */ RowsRequestingEventUIParam) => Unit): Self = this.set("rowsRequesting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRowsRequesting: Self = this.set("rowsRequesting", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

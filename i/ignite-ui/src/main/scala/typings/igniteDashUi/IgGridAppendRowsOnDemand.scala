package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridAppendRowsOnDemand
  extends /**
	 * Option for igGridAppendRowsOnDemand
	 */
/* optionName */ StringDictionary[js.Any] {
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
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridAppendRowsOnDemand
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    chunkIndexUrlKey: String = null,
    chunkSize: Int | Double = null,
    chunkSizeUrlKey: String = null,
    currentChunkIndex: Int | Double = null,
    defaultChunkIndex: Int | Double = null,
    loadMoreDataButtonText: String = null,
    loadTrigger: String = null,
    locale: IgGridAppendRowsOnDemandLocale = null,
    recordCountKey: String = null,
    rowsRequested: (/* event */ Event, /* ui */ RowsRequestedEventUIParam) => Unit = null,
    rowsRequesting: (/* event */ Event, /* ui */ RowsRequestingEventUIParam) => Unit = null,
    `type`: String = null
  ): IgGridAppendRowsOnDemand = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (chunkIndexUrlKey != null) __obj.updateDynamic("chunkIndexUrlKey")(chunkIndexUrlKey)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (chunkSizeUrlKey != null) __obj.updateDynamic("chunkSizeUrlKey")(chunkSizeUrlKey)
    if (currentChunkIndex != null) __obj.updateDynamic("currentChunkIndex")(currentChunkIndex.asInstanceOf[js.Any])
    if (defaultChunkIndex != null) __obj.updateDynamic("defaultChunkIndex")(defaultChunkIndex.asInstanceOf[js.Any])
    if (loadMoreDataButtonText != null) __obj.updateDynamic("loadMoreDataButtonText")(loadMoreDataButtonText)
    if (loadTrigger != null) __obj.updateDynamic("loadTrigger")(loadTrigger)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (recordCountKey != null) __obj.updateDynamic("recordCountKey")(recordCountKey)
    if (rowsRequested != null) __obj.updateDynamic("rowsRequested")(js.Any.fromFunction2(rowsRequested))
    if (rowsRequesting != null) __obj.updateDynamic("rowsRequesting")(js.Any.fromFunction2(rowsRequesting))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IgGridAppendRowsOnDemand]
  }
}


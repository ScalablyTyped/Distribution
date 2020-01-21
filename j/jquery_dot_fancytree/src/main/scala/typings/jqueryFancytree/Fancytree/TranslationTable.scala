package typings.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationTable extends js.Object {
  /**
    * "Load error!"
    */
  var loadError: js.UndefOr[String] = js.undefined
  /**
    * "Loading..."  // &#8230; would be escaped when escapeTitles is true
    */
  var loading: js.UndefOr[String] = js.undefined
  /**
    * "More..."
    */
  var moreData: js.UndefOr[String] = js.undefined
  /**
    * "No data."
    */
  var noData: js.UndefOr[String] = js.undefined
}

object TranslationTable {
  @scala.inline
  def apply(loadError: String = null, loading: String = null, moreData: String = null, noData: String = null): TranslationTable = {
    val __obj = js.Dynamic.literal()
    if (loadError != null) __obj.updateDynamic("loadError")(loadError.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (moreData != null) __obj.updateDynamic("moreData")(moreData.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationTable]
  }
}


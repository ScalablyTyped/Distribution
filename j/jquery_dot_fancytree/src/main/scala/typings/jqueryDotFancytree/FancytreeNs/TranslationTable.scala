package typings.jqueryDotFancytree.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationTable extends js.Object {
  /**
    * "Load error!"
    */
  var loadError: String
  /**
    * "Loading..."  // &#8230; would be escaped when escapeTitles is true
    */
  var loading: String
  /**
    * "More..."
    */
  var moreData: String
  /**
    * "No data."
    */
  var noData: String
}

object TranslationTable {
  @scala.inline
  def apply(loadError: String, loading: String, moreData: String, noData: String): TranslationTable = {
    val __obj = js.Dynamic.literal(loadError = loadError, loading = loading, moreData = moreData, noData = noData)
  
    __obj.asInstanceOf[TranslationTable]
  }
}


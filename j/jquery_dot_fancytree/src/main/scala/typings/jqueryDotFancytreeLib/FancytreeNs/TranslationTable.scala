package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationTable extends js.Object {
  /**
    * "Load error!"
    */
  var loadError: java.lang.String
  /**
    * "Loading..."  // &#8230; would be escaped when escapeTitles is true
    */
  var loading: java.lang.String
  /**
    * "More..."
    */
  var moreData: java.lang.String
  /**
    * "No data."
    */
  var noData: java.lang.String
}

object TranslationTable {
  @scala.inline
  def apply(
    loadError: java.lang.String,
    loading: java.lang.String,
    moreData: java.lang.String,
    noData: java.lang.String
  ): TranslationTable = {
    val __obj = js.Dynamic.literal(loadError = loadError, loading = loading, moreData = moreData, noData = noData)
  
    __obj.asInstanceOf[TranslationTable]
  }
}


package typings
package atJupyterlabExtensionmanagerLib.libQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchResult extends js.Object {
  /**
    * A collection of search results.
    */
  var objects: js.Array[atJupyterlabExtensionmanagerLib.Anon_Flags]
  /**
    * Timestamp of the search result creation.
    */
  var time: java.lang.String
  /**
    * The total number of objects found by the search.
    *
    * This can be greater than the number of objects due
    * to pagination of the search results.
    */
  var total: scala.Double
}

object ISearchResult {
  @scala.inline
  def apply(
    objects: js.Array[atJupyterlabExtensionmanagerLib.Anon_Flags],
    time: java.lang.String,
    total: scala.Double
  ): ISearchResult = {
    val __obj = js.Dynamic.literal(objects = objects, time = time, total = total)
  
    __obj.asInstanceOf[ISearchResult]
  }
}


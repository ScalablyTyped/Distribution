package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends Base {
  var searchResultClass: java.lang.String
  def callback(): scala.Unit
  def getCallback(): js.Function0[scala.Unit]
  def getQueryMethod(): js.Function0[scala.Unit]
  def getSearchResultClass(): java.lang.String
  def query(
    queryStr: java.lang.String,
    callback: js.Function0[scala.Unit],
    queryMethod: js.Function0[scala.Unit]
  ): js.Array[_]
  def queryMethod(): scala.Unit
  def setCallback(newCallback: js.Function0[scala.Unit]): scala.Unit
  def setQueryMethod(newQueryMethod: js.Function0[scala.Unit]): scala.Unit
  def setSearchResultClass(newElementClass: java.lang.String): scala.Unit
}


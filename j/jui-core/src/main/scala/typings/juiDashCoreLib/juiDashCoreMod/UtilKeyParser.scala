package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilKeyParser extends js.Object {
  def changeIndex(index: java.lang.String, targetIndex: java.lang.String, rootIndex: java.lang.String): java.lang.String
  def getIndexList(index: java.lang.String): scala.Boolean
  def getNextIndex(index: java.lang.String): java.lang.String
  def getParentIndex(index: java.lang.String): java.lang.String
  def isIndexDepth(index: java.lang.String): scala.Boolean
}

object UtilKeyParser {
  @scala.inline
  def apply(
    changeIndex: js.Function3[java.lang.String, java.lang.String, java.lang.String, java.lang.String],
    getIndexList: js.Function1[java.lang.String, scala.Boolean],
    getNextIndex: js.Function1[java.lang.String, java.lang.String],
    getParentIndex: js.Function1[java.lang.String, java.lang.String],
    isIndexDepth: js.Function1[java.lang.String, scala.Boolean]
  ): UtilKeyParser = {
    val __obj = js.Dynamic.literal(changeIndex = changeIndex, getIndexList = getIndexList, getNextIndex = getNextIndex, getParentIndex = getParentIndex, isIndexDepth = isIndexDepth)
  
    __obj.asInstanceOf[UtilKeyParser]
  }
}


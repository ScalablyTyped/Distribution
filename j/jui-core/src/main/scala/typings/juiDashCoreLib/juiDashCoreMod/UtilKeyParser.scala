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
    changeIndex: (java.lang.String, java.lang.String, java.lang.String) => java.lang.String,
    getIndexList: java.lang.String => scala.Boolean,
    getNextIndex: java.lang.String => java.lang.String,
    getParentIndex: java.lang.String => java.lang.String,
    isIndexDepth: java.lang.String => scala.Boolean
  ): UtilKeyParser = {
    val __obj = js.Dynamic.literal(changeIndex = js.Any.fromFunction3(changeIndex), getIndexList = js.Any.fromFunction1(getIndexList), getNextIndex = js.Any.fromFunction1(getNextIndex), getParentIndex = js.Any.fromFunction1(getParentIndex), isIndexDepth = js.Any.fromFunction1(isIndexDepth))
  
    __obj.asInstanceOf[UtilKeyParser]
  }
}


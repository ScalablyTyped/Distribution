package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilKeyParser extends js.Object {
  def changeIndex(index: String, targetIndex: String, rootIndex: String): String
  def getIndexList(index: String): Boolean
  def getNextIndex(index: String): String
  def getParentIndex(index: String): String
  def isIndexDepth(index: String): Boolean
}

object UtilKeyParser {
  @scala.inline
  def apply(
    changeIndex: (String, String, String) => String,
    getIndexList: String => Boolean,
    getNextIndex: String => String,
    getParentIndex: String => String,
    isIndexDepth: String => Boolean
  ): UtilKeyParser = {
    val __obj = js.Dynamic.literal(changeIndex = js.Any.fromFunction3(changeIndex), getIndexList = js.Any.fromFunction1(getIndexList), getNextIndex = js.Any.fromFunction1(getNextIndex), getParentIndex = js.Any.fromFunction1(getParentIndex), isIndexDepth = js.Any.fromFunction1(isIndexDepth))
    __obj.asInstanceOf[UtilKeyParser]
  }
}


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


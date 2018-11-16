package typings
package jodataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jo")
@js.native
class jo protected () extends js.Object {
  def this(baseUri: java.lang.String) = this()
  var ExpandSettings: jodataLib.joNs.ExpandSettings = js.native
  var FilterSettings: jodataLib.joNs.InlineCountSettings = js.native
  var FormatSettings: jodataLib.joNs.FormatSettings = js.native
  var InlineCountSettings: jodataLib.joNs.InlineCountSettings = js.native
  var OrderBySettings: jodataLib.joNs.OrderBySettings = js.native
  var SelectSettings: jodataLib.joNs.SelectSettings = js.native
  var SkipSettings: jodataLib.joNs.SkipSettings = js.native
  var TopSettings: jodataLib.joNs.TopSettings = js.native
  var baseUri: java.lang.String = js.native
  var currentHashRoute: java.lang.String = js.native
  def andFilter(filterClause: jodataLib.joNs.FilterClause): jo = js.native
  def andFilter(filterClause: jodataLib.joNs.PrecedenceGroup): jo = js.native
  def asc(): jo = js.native
  def captureFilter(): scala.Unit = js.native
  def defaultAndFilter(filterClause: jodataLib.joNs.FilterClause): jo = js.native
  def defaultFilter(filterClause: jodataLib.joNs.FilterClause): jo = js.native
  def defaultOrFilter(filterClause: jodataLib.joNs.FilterClause): jo = js.native
  def desc(): jo = js.native
  def expand(expand: java.lang.String): jo = js.native
  // Filter
  def filter(filterClause: jodataLib.joNs.FilterClause): jo = js.native
  // Filter
  def filter(filterClause: jodataLib.joNs.PrecedenceGroup): jo = js.native
  // Format
  def format(): jodataLib.joNs.FormatOptions = js.native
  def formatDefault(): jodataLib.joNs.FormatOptions = js.native
  // Inline count
  def inlineCount(): jodataLib.joNs.InlineCountOptions = js.native
  def inlineCountDefault(): jodataLib.joNs.InlineCountOptions = js.native
  def orFilter(filterClause: jodataLib.joNs.FilterClause): jo = js.native
  def orFilter(filterClause: jodataLib.joNs.PrecedenceGroup): jo = js.native
  def orderBy(property: java.lang.String): jo = js.native
  def removeFilter(property: java.lang.String): jo = js.native
  def resetExpand(): jo = js.native
  def resetFilter(): jo = js.native
  def resetFormat(): scala.Unit = js.native
  def resetInlineCount(): scala.Unit = js.native
  def resetOrderBy(): jo = js.native
  def resetSelect(): jo = js.native
  def resetSkip(): jo = js.native
  def resetToCapturedFilter(): jo = js.native
  def resetTop(): jo = js.native
  def saveLocal(): scala.Unit = js.native
  def saveLocal(key: java.lang.String): scala.Unit = js.native
  def select(select: js.Array[java.lang.String]): jo = js.native
  // Expand
  def setExpandDefault(expand: java.lang.String): jo = js.native
  // Order by
  def setOrderByDefault(property: java.lang.String): jo = js.native
  // Order by
  def setOrderByDefault(property: java.lang.String, order: java.lang.String): jo = js.native
  // Select
  def setSelectDefault(select: js.Array[java.lang.String]): jo = js.native
  // Skip
  def setSkipDefault(skip: scala.Double): jo = js.native
  // Top
  def setTopDefault(top: scala.Double): jo = js.native
  def skip(skip: scala.Double): jo = js.native
  def toJson(): java.lang.String = js.native
  def toggleOrderBy(property: java.lang.String): jo = js.native
  def toggleOrderBy(property: java.lang.String, callback: js.Function): jo = js.native
  def top(top: scala.Double): jo = js.native
  def updateHashRoute(hashRoute: java.lang.String): scala.Unit = js.native
}

@JSGlobal("jo")
@js.native
object jo extends js.Object {
  def datetime(stringLiteral: java.lang.String): java.lang.String = js.native
  def decimal(stringLiteral: scala.Double): java.lang.String = js.native
  def double(stringLiteral: scala.Double): java.lang.String = js.native
  def guid(stringLiteral: java.lang.String): java.lang.String = js.native
  // Casts
  def literal(stringLiteral: java.lang.String): java.lang.String = js.native
  def loadLocal(): jodataLib.jo = js.native
  def loadLocal(key: java.lang.String): jodataLib.jo = js.native
  def single(stringLiteral: scala.Double): java.lang.String = js.native
}


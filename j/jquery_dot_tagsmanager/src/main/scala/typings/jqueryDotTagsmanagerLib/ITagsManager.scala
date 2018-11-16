package typings
package jqueryDotTagsmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagsManager extends js.Object {
  var backspace: js.Array[scala.Double] = js.native
  var delimeters: js.Array[scala.Double] = js.native
  var obj: JQuery = js.native
  var objName: java.lang.String = js.native
  var queuedTag: java.lang.String = js.native
  var tagManagerOptions: ITagsManagerOptions = js.native
  var tagToManipulate: java.lang.String = js.native
  def ajaxPolling(query: java.lang.String, process: js.Function): scala.Unit = js.native
  def empty(): scala.Unit = js.native
  def initialize(context: JQuery): scala.Unit = js.native
  def initialize(context: JQuery, options: ITagsManagerOptions): scala.Unit = js.native
  def initialize(context: JQuery, options: ITagsManagerOptions, tagToManipulate: java.lang.String): scala.Unit = js.native
  def onTypeaheadAjaxSuccess(data: js.Any, isSetTypeaheadSource: scala.Boolean): scala.Unit = js.native
  def onTypeaheadAjaxSuccess(data: js.Any, isSetTypeaheadSource: scala.Boolean, process: js.Function): scala.Unit = js.native
  def popTag(): scala.Unit = js.native
  def processCommand(context: JQuery, command: java.lang.String): JQuery = js.native
  def processCommand(context: JQuery, command: java.lang.String, tagToManipulate: java.lang.String): JQuery = js.native
  def processTags(): JQuery = js.native
  def processTags(command: java.lang.String): JQuery = js.native
  def processTags(command: java.lang.String, context: JQuery): JQuery = js.native
  def processTags(command: java.lang.String, context: JQuery, tagToManipulate: java.lang.String): JQuery = js.native
  def pushTag(tag: java.lang.String, objToPush: js.Any, isValid: scala.Boolean): scala.Unit = js.native
  def refreshHiddenTagList(): scala.Unit = js.native
  def setContext(context: JQuery): scala.Unit = js.native
  def setContext(context: JQuery, tagToManipulate: java.lang.String): scala.Unit = js.native
  def setOptions(options: ITagsManagerOptions): scala.Unit = js.native
  def setTypeaheadSource(source: js.Any): scala.Unit = js.native
  def setupTypeahead(): scala.Unit = js.native
  def spliceTag(tagId: scala.Double, eventData: js.Any): scala.Unit = js.native
  def trimTag(tag: java.lang.String): java.lang.String = js.native
}


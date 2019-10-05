package typings.jsnlog.jsnlogMod.JL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface to be used when dependency injecting JSNLog into a class
@js.native
trait JSNLog extends js.Object {
  def apply(): JSNLogLogger = js.native
  def apply(loggerName: String): JSNLogLogger = js.native
  def createAjaxAppender(appenderName: String): JSNLogAjaxAppender = js.native
  def createConsoleAppender(appenderName: String): JSNLogConsoleAppender = js.native
  def getAllLevel(): Double = js.native
  def getDebugLevel(): Double = js.native
  def getErrorLevel(): Double = js.native
  def getFatalLevel(): Double = js.native
  def getInfoLevel(): Double = js.native
  def getOffLevel(): Double = js.native
  def getTraceLevel(): Double = js.native
  def getWarnLevel(): Double = js.native
  def setOptions(options: JSNLogOptions): Unit = js.native
}


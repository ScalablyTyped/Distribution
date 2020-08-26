package typings.log4js.mod

import typings.log4js.log4jsStrings.categoryFilter
import typings.log4js.log4jsStrings.console
import typings.log4js.log4jsStrings.dateFile
import typings.log4js.log4jsStrings.file
import typings.log4js.log4jsStrings.fileSync
import typings.log4js.log4jsStrings.logLevelFilter
import typings.log4js.log4jsStrings.master
import typings.log4js.log4jsStrings.multiFile
import typings.log4js.log4jsStrings.multiprocess
import typings.log4js.log4jsStrings.noLogFilter
import typings.log4js.log4jsStrings.recording
import typings.log4js.log4jsStrings.stderr
import typings.log4js.log4jsStrings.stdout
import typings.log4js.log4jsStrings.worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.log4js.mod.CategoryFilterAppender
  - typings.log4js.mod.ConsoleAppender
  - typings.log4js.mod.FileAppender
  - typings.log4js.mod.SyncfileAppender
  - typings.log4js.mod.DateFileAppender
  - typings.log4js.mod.LogLevelFilterAppender
  - typings.log4js.mod.NoLogFilterAppender
  - typings.log4js.mod.MultiFileAppender
  - typings.log4js.mod.MultiprocessAppender
  - typings.log4js.mod.RecordingAppender
  - typings.log4js.mod.StandardErrorAppender
  - typings.log4js.mod.StandardOutputAppender
  - typings.log4js.mod.CustomAppender
*/
trait Appender extends js.Object

object Appender {
  @scala.inline
  def CustomAppender(`type`: String | AppenderModule): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def LogLevelFilterAppender(appender: String, level: String, `type`: logLevelFilter): Appender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def MultiFileAppender(base: String, extension: String, property: String, `type`: multiFile): Appender = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def SyncfileAppender(filename: String, `type`: fileSync): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def StandardOutputAppender(`type`: stdout): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def DateFileAppender(filename: String, `type`: dateFile): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def ConsoleAppender(`type`: console): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def RecordingAppender(`type`: recording): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def MultiprocessAppender(mode: master | worker, `type`: multiprocess): Appender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def NoLogFilterAppender(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): Appender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def CategoryFilterAppender(`type`: categoryFilter): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def FileAppender(filename: String, `type`: file): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def StandardErrorAppender(`type`: stderr): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
}


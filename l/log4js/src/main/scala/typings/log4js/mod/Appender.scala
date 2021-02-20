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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Appender extends StObject
object Appender {
  
  @scala.inline
  def CategoryFilterAppender(`type`: categoryFilter): typings.log4js.mod.CategoryFilterAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.CategoryFilterAppender]
  }
  
  @scala.inline
  def ConsoleAppender(`type`: console): typings.log4js.mod.ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.ConsoleAppender]
  }
  
  @scala.inline
  def CustomAppender(`type`: String | AppenderModule): typings.log4js.mod.CustomAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.CustomAppender]
  }
  
  @scala.inline
  def DateFileAppender(filename: String, `type`: dateFile): typings.log4js.mod.DateFileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.DateFileAppender]
  }
  
  @scala.inline
  def FileAppender(filename: String, `type`: file): typings.log4js.mod.FileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.FileAppender]
  }
  
  @scala.inline
  def LogLevelFilterAppender(appender: String, level: String, `type`: logLevelFilter): typings.log4js.mod.LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.LogLevelFilterAppender]
  }
  
  @scala.inline
  def MultiFileAppender(base: String, extension: String, property: String, `type`: multiFile): typings.log4js.mod.MultiFileAppender = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.MultiFileAppender]
  }
  
  @scala.inline
  def MultiprocessAppender(mode: master | worker, `type`: multiprocess): typings.log4js.mod.MultiprocessAppender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.MultiprocessAppender]
  }
  
  @scala.inline
  def NoLogFilterAppender(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): typings.log4js.mod.NoLogFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.NoLogFilterAppender]
  }
  
  @scala.inline
  def RecordingAppender(`type`: recording): typings.log4js.mod.RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.RecordingAppender]
  }
  
  @scala.inline
  def StandardErrorAppender(`type`: stderr): typings.log4js.mod.StandardErrorAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.StandardErrorAppender]
  }
  
  @scala.inline
  def StandardOutputAppender(`type`: stdout): typings.log4js.mod.StandardOutputAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.StandardOutputAppender]
  }
  
  @scala.inline
  def SyncfileAppender(filename: String, `type`: fileSync): typings.log4js.mod.SyncfileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.SyncfileAppender]
  }
}

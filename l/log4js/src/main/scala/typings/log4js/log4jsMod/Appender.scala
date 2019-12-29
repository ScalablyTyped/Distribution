package typings.log4js.log4jsMod

import org.scalablytyped.runtime.StringDictionary
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
  - typings.log4js.log4jsMod.CategoryFilterAppender
  - typings.log4js.log4jsMod.ConsoleAppender
  - typings.log4js.log4jsMod.FileAppender
  - typings.log4js.log4jsMod.SyncfileAppender
  - typings.log4js.log4jsMod.DateFileAppender
  - typings.log4js.log4jsMod.LogLevelFilterAppender
  - typings.log4js.log4jsMod.NoLogFilterAppender
  - typings.log4js.log4jsMod.MultiFileAppender
  - typings.log4js.log4jsMod.MultiprocessAppender
  - typings.log4js.log4jsMod.RecordingAppender
  - typings.log4js.log4jsMod.StandardErrorAppender
  - typings.log4js.log4jsMod.StandardOutputAppender
  - typings.log4js.log4jsMod.CustomAppender
*/
trait Appender extends js.Object

object Appender {
  @scala.inline
  def FileAppender(
    filename: String,
    `type`: file,
    backups: Int | Double = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    flags: String = null,
    keepFileExt: js.UndefOr[Boolean] = js.undefined,
    layout: Layout = null,
    maxLogSize: Double | String = null,
    mode: Int | Double = null,
    numBackups: Int | Double = null
  ): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (backups != null) __obj.updateDynamic("backups")(backups.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFileExt)) __obj.updateDynamic("keepFileExt")(keepFileExt.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxLogSize != null) __obj.updateDynamic("maxLogSize")(maxLogSize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (numBackups != null) __obj.updateDynamic("numBackups")(numBackups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def StandardOutputAppender(`type`: stdout, layout: Layout = null): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def MultiprocessAppender(
    mode: master | worker,
    `type`: multiprocess,
    appender: String = null,
    loggerHost: String = null,
    loggerPort: Int | Double = null
  ): Appender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appender != null) __obj.updateDynamic("appender")(appender.asInstanceOf[js.Any])
    if (loggerHost != null) __obj.updateDynamic("loggerHost")(loggerHost.asInstanceOf[js.Any])
    if (loggerPort != null) __obj.updateDynamic("loggerPort")(loggerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def CategoryFilterAppender(`type`: categoryFilter, appender: String = null, exclude: String | js.Array[String] = null): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appender != null) __obj.updateDynamic("appender")(appender.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def RecordingAppender(`type`: recording): Appender = {
    val __obj = js.Dynamic.literal()
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
  def NoLogFilterAppender(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): Appender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def CustomAppender(`type`: String | AppenderModule, StringDictionary: /* key */ StringDictionary[js.Any] = null): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def StandardErrorAppender(`type`: stderr, layout: Layout = null): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def SyncfileAppender(
    filename: String,
    `type`: fileSync,
    backups: Int | Double = null,
    layout: Layout = null,
    maxLogSize: Double | String = null
  ): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (backups != null) __obj.updateDynamic("backups")(backups.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxLogSize != null) __obj.updateDynamic("maxLogSize")(maxLogSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def ConsoleAppender(`type`: console, layout: Layout = null): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def DateFileAppender(
    filename: String,
    `type`: dateFile,
    alwaysIncludePattern: js.UndefOr[Boolean] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    daysToKeep: Int | Double = null,
    encoding: String = null,
    flags: String = null,
    keepFileExt: js.UndefOr[Boolean] = js.undefined,
    layout: Layout = null,
    mode: Int | Double = null,
    pattern: String = null
  ): Appender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIncludePattern)) __obj.updateDynamic("alwaysIncludePattern")(alwaysIncludePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (daysToKeep != null) __obj.updateDynamic("daysToKeep")(daysToKeep.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFileExt)) __obj.updateDynamic("keepFileExt")(keepFileExt.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
  @scala.inline
  def LogLevelFilterAppender(appender: String, level: String, `type`: logLevelFilter, maxLevel: String = null): Appender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (maxLevel != null) __obj.updateDynamic("maxLevel")(maxLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appender]
  }
}


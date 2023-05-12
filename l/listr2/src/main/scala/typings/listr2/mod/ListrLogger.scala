package typings.listr2.mod

import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Booleans.`true`
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Listr2 logger.
  *
  * This logger is used throughout the renderers for consistency.
  *
  * @see {@link https://listr2.kilic.dev/renderer/logger.html}
  */
@JSImport("listr2", "ListrLogger")
@js.native
open class ListrLogger[Levels /* <: String */] () extends StObject {
  def this(options: ListrLoggerOptions[Levels]) = this()
  
  /* protected */ def applyFormat(message: String): String = js.native
  /* protected */ def applyFormat(message: String, options: LoggerFormatOptions): String = js.native
  
  def fields(message: String): String = js.native
  @JSName("fields")
  def fields_true(message: String, options: LoggerFieldOptions[`true`]): String = js.native
  
  /* protected */ def format(level: Levels, message: String): String = js.native
  /* protected */ def format(level: Levels, message: js.Array[Any]): String = js.native
  /* protected */ @JSName("format")
  def format_false(level: Levels, message: String, options: LoggerFieldOptions[`false`]): String = js.native
  /* protected */ @JSName("format")
  def format_false(level: Levels, message: js.Array[Any], options: LoggerFieldOptions[`false`]): String = js.native
  
  def icon(level: Levels): String = js.native
  def icon(level: Levels, icon: String): String = js.native
  @JSName("icon")
  def icon_false(level: Levels, icon: `false`): String = js.native
  
  def log(level: Levels, message: String): Unit = js.native
  def log(level: Levels, message: js.Array[Any]): Unit = js.native
  @JSName("log")
  def log_false(level: Levels, message: String, options: LoggerFieldOptions[`false`]): Unit = js.native
  @JSName("log")
  def log_false(level: Levels, message: js.Array[Any], options: LoggerFieldOptions[`false`]): Unit = js.native
  
  var options: js.UndefOr[ListrLoggerOptions[Levels]] = js.native
  
  def prefix(message: String, prefixes: LoggerField[js.Array[Any]]*): String = js.native
  
  val process: ProcessOutput = js.native
  
  /* protected */ def spacing(): String = js.native
  /* protected */ def spacing(message: String): String = js.native
  
  def splat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof splat> is not an array type */ args: Parameters[js.Function2[/* message */ String, /* repeated */ Any, String]]
  ): ReturnType[js.Function2[/* message */ String, /* repeated */ Any, String]] = js.native
  
  /* protected */ def style(level: Levels, message: String): String = js.native
  
  def suffix(message: String, suffixes: LoggerField[js.Array[Any]]*): String = js.native
  
  def toStderr(message: String): Unit = js.native
  def toStderr(message: String, options: Unit, eol: Boolean): Unit = js.native
  def toStderr(message: js.Array[Any]): Unit = js.native
  def toStderr(message: js.Array[Any], options: Unit, eol: Boolean): Unit = js.native
  @JSName("toStderr")
  def toStderr_false(message: String, options: LoggerFieldOptions[`false`]): Unit = js.native
  @JSName("toStderr")
  def toStderr_false(message: String, options: LoggerFieldOptions[`false`], eol: Boolean): Unit = js.native
  @JSName("toStderr")
  def toStderr_false(message: js.Array[Any], options: LoggerFieldOptions[`false`]): Unit = js.native
  @JSName("toStderr")
  def toStderr_false(message: js.Array[Any], options: LoggerFieldOptions[`false`], eol: Boolean): Unit = js.native
  
  def toStdout(message: String): Unit = js.native
  def toStdout(message: String, options: Unit, eol: Boolean): Unit = js.native
  def toStdout(message: js.Array[Any]): Unit = js.native
  def toStdout(message: js.Array[Any], options: Unit, eol: Boolean): Unit = js.native
  @JSName("toStdout")
  def toStdout_false(message: String, options: LoggerFieldOptions[`false`]): Unit = js.native
  @JSName("toStdout")
  def toStdout_false(message: String, options: LoggerFieldOptions[`false`], eol: Boolean): Unit = js.native
  @JSName("toStdout")
  def toStdout_false(message: js.Array[Any], options: LoggerFieldOptions[`false`]): Unit = js.native
  @JSName("toStdout")
  def toStdout_false(message: js.Array[Any], options: LoggerFieldOptions[`false`], eol: Boolean): Unit = js.native
  
  def wrap(message: String): String = js.native
  def wrap(message: String, options: LoggerFormatOptions): String = js.native
}

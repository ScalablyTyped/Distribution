package typings
package gulpDashMsbuildLib.gulpDashMsbuildMod.gulpMsBuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
    // 4.0
  var architecture: js.UndefOr[java.lang.String] = js.undefined
       // ['Rebuild']
  var configuration: js.UndefOr[java.lang.String] = js.undefined
   // msbuild({ fileLoggerParameters: 'LogFile=Build.log;Append;Verbosity=diagnostic' })
  var consoleLoggerParameters: js.UndefOr[java.lang.String] = js.undefined
   // msbuild({ loggerParameters: 'XMLLogger,./MyLogger.dll;OutputAsHTML' })
  var emitEndEvent: js.UndefOr[scala.Boolean] = js.undefined
         // true
  var errorOnFail: js.UndefOr[scala.Boolean] = js.undefined
         // false -> Show Startup Banner and Copyright Message
  var fileLoggerParameters: js.UndefOr[java.lang.String] = js.undefined
    // false
  var logCommand: js.UndefOr[scala.Boolean] = js.undefined
  var loggerParameters: js.UndefOr[java.lang.String] = js.undefined
       // 'quiet', 'minimal', 'normal', 'detailed', 'diagnostic'
  var maxcpucount: js.UndefOr[scala.Double] = js.undefined
     // Default: 0 = Automatic selection | Possible Values: -1 (MSBuild Default), 0 (Automatic), > 0 (Concrete value)
  var nodeReuse: js.UndefOr[scala.Boolean] = js.undefined
      // true = Nodes remain after the build finishes so that subsequent builds can use them
  var nologo: js.UndefOr[scala.Boolean] = js.undefined
    // 'x86' | 'x64'
  var properties: js.UndefOr[js.Any] = js.undefined
         // false
  var stderr: js.UndefOr[scala.Boolean] = js.undefined
  var stdout: js.UndefOr[scala.Boolean] = js.undefined
     // false
  var targets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // 'Release' | 'Debug'
  var toolsVersion: js.UndefOr[scala.Double] = js.undefined
         // msbuild({ properties: { WarningLevel: 2 } })
  var verbosity: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    architecture: java.lang.String = null,
    configuration: java.lang.String = null,
    consoleLoggerParameters: java.lang.String = null,
    emitEndEvent: js.UndefOr[scala.Boolean] = js.undefined,
    errorOnFail: js.UndefOr[scala.Boolean] = js.undefined,
    fileLoggerParameters: java.lang.String = null,
    logCommand: js.UndefOr[scala.Boolean] = js.undefined,
    loggerParameters: java.lang.String = null,
    maxcpucount: scala.Int | scala.Double = null,
    nodeReuse: js.UndefOr[scala.Boolean] = js.undefined,
    nologo: js.UndefOr[scala.Boolean] = js.undefined,
    properties: js.Any = null,
    stderr: js.UndefOr[scala.Boolean] = js.undefined,
    stdout: js.UndefOr[scala.Boolean] = js.undefined,
    targets: js.Array[java.lang.String] = null,
    toolsVersion: scala.Int | scala.Double = null,
    verbosity: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (consoleLoggerParameters != null) __obj.updateDynamic("consoleLoggerParameters")(consoleLoggerParameters)
    if (!js.isUndefined(emitEndEvent)) __obj.updateDynamic("emitEndEvent")(emitEndEvent)
    if (!js.isUndefined(errorOnFail)) __obj.updateDynamic("errorOnFail")(errorOnFail)
    if (fileLoggerParameters != null) __obj.updateDynamic("fileLoggerParameters")(fileLoggerParameters)
    if (!js.isUndefined(logCommand)) __obj.updateDynamic("logCommand")(logCommand)
    if (loggerParameters != null) __obj.updateDynamic("loggerParameters")(loggerParameters)
    if (maxcpucount != null) __obj.updateDynamic("maxcpucount")(maxcpucount.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeReuse)) __obj.updateDynamic("nodeReuse")(nodeReuse)
    if (!js.isUndefined(nologo)) __obj.updateDynamic("nologo")(nologo)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr)
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (toolsVersion != null) __obj.updateDynamic("toolsVersion")(toolsVersion.asInstanceOf[js.Any])
    if (verbosity != null) __obj.updateDynamic("verbosity")(verbosity)
    __obj.asInstanceOf[Options]
  }
}


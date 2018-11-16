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


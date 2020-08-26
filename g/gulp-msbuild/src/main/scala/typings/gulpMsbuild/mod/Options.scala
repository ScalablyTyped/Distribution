package typings.gulpMsbuild.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
    // 4.0
  var architecture: js.UndefOr[String] = js.native
       // ['Rebuild']
  var configuration: js.UndefOr[String] = js.native
   // msbuild({ fileLoggerParameters: 'LogFile=Build.log;Append;Verbosity=diagnostic' })
  var consoleLoggerParameters: js.UndefOr[String] = js.native
   // msbuild({ loggerParameters: 'XMLLogger,./MyLogger.dll;OutputAsHTML' })
  var emitEndEvent: js.UndefOr[Boolean] = js.native
         // true
  var errorOnFail: js.UndefOr[Boolean] = js.native
         // false -> Show Startup Banner and Copyright Message
  var fileLoggerParameters: js.UndefOr[String] = js.native
    // false
  var logCommand: js.UndefOr[Boolean] = js.native
  var loggerParameters: js.UndefOr[String] = js.native
       // 'quiet', 'minimal', 'normal', 'detailed', 'diagnostic'
  var maxcpucount: js.UndefOr[Double] = js.native
     // Default: 0 = Automatic selection | Possible Values: -1 (MSBuild Default), 0 (Automatic), > 0 (Concrete value)
  var nodeReuse: js.UndefOr[Boolean] = js.native
      // true = Nodes remain after the build finishes so that subsequent builds can use them
  var nologo: js.UndefOr[Boolean] = js.native
    // 'x86' | 'x64'
  var properties: js.UndefOr[js.Any] = js.native
         // false
  var stderr: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean] = js.native
     // false
  var targets: js.UndefOr[js.Array[String]] = js.native
   // 'Release' | 'Debug'
  var toolsVersion: js.UndefOr[Double] = js.native
         // msbuild({ properties: { WarningLevel: 2 } })
  var verbosity: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    @scala.inline
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setConsoleLoggerParameters(value: String): Self = this.set("consoleLoggerParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsoleLoggerParameters: Self = this.set("consoleLoggerParameters", js.undefined)
    @scala.inline
    def setEmitEndEvent(value: Boolean): Self = this.set("emitEndEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitEndEvent: Self = this.set("emitEndEvent", js.undefined)
    @scala.inline
    def setErrorOnFail(value: Boolean): Self = this.set("errorOnFail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorOnFail: Self = this.set("errorOnFail", js.undefined)
    @scala.inline
    def setFileLoggerParameters(value: String): Self = this.set("fileLoggerParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileLoggerParameters: Self = this.set("fileLoggerParameters", js.undefined)
    @scala.inline
    def setLogCommand(value: Boolean): Self = this.set("logCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogCommand: Self = this.set("logCommand", js.undefined)
    @scala.inline
    def setLoggerParameters(value: String): Self = this.set("loggerParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggerParameters: Self = this.set("loggerParameters", js.undefined)
    @scala.inline
    def setMaxcpucount(value: Double): Self = this.set("maxcpucount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxcpucount: Self = this.set("maxcpucount", js.undefined)
    @scala.inline
    def setNodeReuse(value: Boolean): Self = this.set("nodeReuse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeReuse: Self = this.set("nodeReuse", js.undefined)
    @scala.inline
    def setNologo(value: Boolean): Self = this.set("nologo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNologo: Self = this.set("nologo", js.undefined)
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setStderr(value: Boolean): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdout(value: Boolean): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setToolsVersion(value: Double): Self = this.set("toolsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolsVersion: Self = this.set("toolsVersion", js.undefined)
    @scala.inline
    def setVerbosity(value: String): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbosity: Self = this.set("verbosity", js.undefined)
  }
  
}


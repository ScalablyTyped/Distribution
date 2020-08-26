package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CommandDuration contains the various duration metrics tracked when a bot
  * performs a command.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildbotCommandDurations extends js.Object {
  /**
    * The time spent preparing the command to be run in a Docker container
    * (includes pulling the Docker image, if necessary).
    */
  var dockerPrep: js.UndefOr[String] = js.native
  /**
    * The time spent downloading the input files and constructing the working
    * directory.
    */
  var download: js.UndefOr[String] = js.native
  /**
    * The time spent executing the command (i.e., doing useful work).
    */
  var execution: js.UndefOr[String] = js.native
  /**
    * The timestamp when preparation is done and bot starts downloading files.
    */
  var isoPrepDone: js.UndefOr[String] = js.native
  /**
    * The time spent completing the command, in total.
    */
  var overall: js.UndefOr[String] = js.native
  /**
    * The time spent uploading the stdout logs.
    */
  var stdout: js.UndefOr[String] = js.native
  /**
    * The time spent uploading the output files.
    */
  var upload: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildbotCommandDurations {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildbotCommandDurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotCommandDurations]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildbotCommandDurationsOps[Self <: SchemaGoogleDevtoolsRemotebuildbotCommandDurations] (val x: Self) extends AnyVal {
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
    def setDockerPrep(value: String): Self = this.set("dockerPrep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockerPrep: Self = this.set("dockerPrep", js.undefined)
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setExecution(value: String): Self = this.set("execution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecution: Self = this.set("execution", js.undefined)
    @scala.inline
    def setIsoPrepDone(value: String): Self = this.set("isoPrepDone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoPrepDone: Self = this.set("isoPrepDone", js.undefined)
    @scala.inline
    def setOverall(value: String): Self = this.set("overall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverall: Self = this.set("overall", js.undefined)
    @scala.inline
    def setStdout(value: String): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    @scala.inline
    def setUpload(value: String): Self = this.set("upload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
  
}


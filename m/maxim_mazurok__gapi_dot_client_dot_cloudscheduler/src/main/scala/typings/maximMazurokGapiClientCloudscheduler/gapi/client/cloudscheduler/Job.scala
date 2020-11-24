package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
  /** App Engine HTTP target. */
  var appEngineHttpTarget: js.UndefOr[AppEngineHttpTarget] = js.native
  
  /**
    * The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The
    * failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets,
    * between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours.
    */
  var attemptDeadline: js.UndefOr[String] = js.native
  
  /** Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** HTTP target. */
  var httpTarget: js.UndefOr[HttpTarget] = js.native
  
  /** Output only. The time the last job attempt started. */
  var lastAttemptTime: js.UndefOr[String] = js.native
  
  /**
    * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can
    * contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job's location. The list of
    * available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]),
    * numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Pub/Sub target. */
  var pubsubTarget: js.UndefOr[PubsubTarget] = js.native
  
  /** Settings that determine the retry behavior. */
  var retryConfig: js.UndefOr[RetryConfig] = js.native
  
  /**
    * Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: *
    * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution
    * `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the
    * `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed
    * if the previous execution has not ended when its scheduled time occurs. If retry_count > 0 and a job attempt fails, the job will be tried a total of retry_count times, with
    * exponential backoff, until the next scheduled start time.
    */
  var schedule: js.UndefOr[String] = js.native
  
  /** Output only. The next time the job is scheduled. Note that this may be a retry of a previously failed attempt or the next execution time according to the schedule. */
  var scheduleTime: js.UndefOr[String] = js.native
  
  /** Output only. State of the job. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The response from the target for the last attempted execution. */
  var status: js.UndefOr[Status] = js.native
  
  /**
    * Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note
    * that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone
    * is not specified, the default will be in UTC (also known as GMT).
    */
  var timeZone: js.UndefOr[String] = js.native
  
  /** Output only. The creation time of the job. */
  var userUpdateTime: js.UndefOr[String] = js.native
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setAppEngineHttpTarget(value: AppEngineHttpTarget): Self = this.set("appEngineHttpTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineHttpTarget: Self = this.set("appEngineHttpTarget", js.undefined)
    
    @scala.inline
    def setAttemptDeadline(value: String): Self = this.set("attemptDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptDeadline: Self = this.set("attemptDeadline", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHttpTarget(value: HttpTarget): Self = this.set("httpTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpTarget: Self = this.set("httpTarget", js.undefined)
    
    @scala.inline
    def setLastAttemptTime(value: String): Self = this.set("lastAttemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAttemptTime: Self = this.set("lastAttemptTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPubsubTarget(value: PubsubTarget): Self = this.set("pubsubTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubTarget: Self = this.set("pubsubTarget", js.undefined)
    
    @scala.inline
    def setRetryConfig(value: RetryConfig): Self = this.set("retryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryConfig: Self = this.set("retryConfig", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUserUpdateTime(value: String): Self = this.set("userUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserUpdateTime: Self = this.set("userUpdateTime", js.undefined)
  }
}

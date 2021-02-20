package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
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
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineHttpTarget(value: AppEngineHttpTarget): Self = StObject.set(x, "appEngineHttpTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppEngineHttpTargetUndefined: Self = StObject.set(x, "appEngineHttpTarget", js.undefined)
    
    @scala.inline
    def setAttemptDeadline(value: String): Self = StObject.set(x, "attemptDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptDeadlineUndefined: Self = StObject.set(x, "attemptDeadline", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHttpTarget(value: HttpTarget): Self = StObject.set(x, "httpTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpTargetUndefined: Self = StObject.set(x, "httpTarget", js.undefined)
    
    @scala.inline
    def setLastAttemptTime(value: String): Self = StObject.set(x, "lastAttemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAttemptTimeUndefined: Self = StObject.set(x, "lastAttemptTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPubsubTarget(value: PubsubTarget): Self = StObject.set(x, "pubsubTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubTargetUndefined: Self = StObject.set(x, "pubsubTarget", js.undefined)
    
    @scala.inline
    def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setUserUpdateTime(value: String): Self = StObject.set(x, "userUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUpdateTimeUndefined: Self = StObject.set(x, "userUpdateTime", js.undefined)
  }
}

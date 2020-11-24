package typings.ipp.anon

import typings.ipp.mod.JobState
import typings.ipp.mod.JobStateReasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jobid extends js.Object {
  
  var `job-id`: Double = js.native
  
  var `job-state`: JobState = js.native
  
  var `job-state-message`: js.UndefOr[String] = js.native
  
  var `job-state-reasons`: js.Array[JobStateReasons] = js.native
  
  var `job-uri`: String = js.native
  
  var `number-of-intervening-jobs`: js.UndefOr[Double] = js.native
}
object Jobid {
  
  @scala.inline
  def apply(
    `job-id`: Double,
    `job-state`: JobState,
    `job-state-reasons`: js.Array[JobStateReasons],
    `job-uri`: String
  ): Jobid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("job-id")(`job-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-state")(`job-state`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-state-reasons")(`job-state-reasons`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobid]
  }
  
  @scala.inline
  implicit class JobidOps[Self <: Jobid] (val x: Self) extends AnyVal {
    
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
    def `setJob-id`(value: Double): Self = this.set("job-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state`(value: JobState): Self = this.set("job-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-reasonsVarargs`(value: JobStateReasons*): Self = this.set("job-state-reasons", js.Array(value :_*))
    
    @scala.inline
    def `setJob-state-reasons`(value: js.Array[JobStateReasons]): Self = this.set("job-state-reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-uri`(value: String): Self = this.set("job-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-message`(value: String): Self = this.set("job-state-message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJob-state-message`: Self = this.set("job-state-message", js.undefined)
    
    @scala.inline
    def `setNumber-of-intervening-jobs`(value: Double): Self = this.set("number-of-intervening-jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNumber-of-intervening-jobs`: Self = this.set("number-of-intervening-jobs", js.undefined)
  }
}

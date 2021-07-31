package typings.ipp.anon

import typings.ipp.mod.JobState
import typings.ipp.mod.JobStateReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jobid extends StObject {
  
  var `job-id`: Double
  
  var `job-state`: JobState
  
  var `job-state-message`: js.UndefOr[String] = js.undefined
  
  var `job-state-reasons`: js.Array[JobStateReasons]
  
  var `job-uri`: String
  
  var `number-of-intervening-jobs`: js.UndefOr[Double] = js.undefined
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
  implicit class JobidMutableBuilder[Self <: Jobid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state`(value: JobState): Self = StObject.set(x, "job-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-message`(value: String): Self = StObject.set(x, "job-state-message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-messageUndefined`: Self = StObject.set(x, "job-state-message", js.undefined)
    
    @scala.inline
    def `setJob-state-reasons`(value: js.Array[JobStateReasons]): Self = StObject.set(x, "job-state-reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-reasonsVarargs`(value: JobStateReasons*): Self = StObject.set(x, "job-state-reasons", js.Array(value :_*))
    
    @scala.inline
    def `setJob-uri`(value: String): Self = StObject.set(x, "job-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNumber-of-intervening-jobs`(value: Double): Self = StObject.set(x, "number-of-intervening-jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNumber-of-intervening-jobsUndefined`: Self = StObject.set(x, "number-of-intervening-jobs", js.undefined)
  }
}

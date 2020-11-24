package typings.handbrakeJs.mod

import typings.handbrakeJs.handbrakeJsStrings.Encoding
import typings.handbrakeJs.handbrakeJsStrings.Muxing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandbrakeProgress extends js.Object {
  
  val avgFps: Double = js.native
  
  val eta: String = js.native
  
  val fps: Double = js.native
  
  val percentComplete: Double = js.native
  
  val task: Encoding | Muxing = js.native
  
  val taskCount: Double = js.native
  
  val tasknumber: Double = js.native
}
object HandbrakeProgress {
  
  @scala.inline
  def apply(
    avgFps: Double,
    eta: String,
    fps: Double,
    percentComplete: Double,
    task: Encoding | Muxing,
    taskCount: Double,
    tasknumber: Double
  ): HandbrakeProgress = {
    val __obj = js.Dynamic.literal(avgFps = avgFps.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], taskCount = taskCount.asInstanceOf[js.Any], tasknumber = tasknumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandbrakeProgress]
  }
  
  @scala.inline
  implicit class HandbrakeProgressOps[Self <: HandbrakeProgress] (val x: Self) extends AnyVal {
    
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
    def setAvgFps(value: Double): Self = this.set("avgFps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEta(value: String): Self = this.set("eta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: Encoding | Muxing): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskCount(value: Double): Self = this.set("taskCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasknumber(value: Double): Self = this.set("tasknumber", value.asInstanceOf[js.Any])
  }
}

package typings.k6.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectThreshold extends js.Object {
  
  /** Abort test if threshold violated. */
  var abortOnFail: js.UndefOr[Boolean] = js.native
  
  /** Duration to delay evaluation. Enables collecting additional metrics. */
  var delayAbortEval: js.UndefOr[String] = js.native
  
  /** Threshold expression. */
  var threshold: String = js.native
}
object ObjectThreshold {
  
  @scala.inline
  def apply(threshold: String): ObjectThreshold = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectThreshold]
  }
  
  @scala.inline
  implicit class ObjectThresholdOps[Self <: ObjectThreshold] (val x: Self) extends AnyVal {
    
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
    def setThreshold(value: String): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortOnFail(value: Boolean): Self = this.set("abortOnFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortOnFail: Self = this.set("abortOnFail", js.undefined)
    
    @scala.inline
    def setDelayAbortEval(value: String): Self = this.set("delayAbortEval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayAbortEval: Self = this.set("delayAbortEval", js.undefined)
  }
}

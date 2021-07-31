package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressOptions
  extends StObject
     with MessageBoxesOptions
     with ProgressMethods
     with ProgressEvents {
  
  // Show percentage of progress
  var label: js.UndefOr[String] = js.undefined
  
  var progressCompleted: js.UndefOr[js.Any] = js.undefined
  
  // Show progress label
  var progressTpl: js.UndefOr[Boolean] = js.undefined
  
  //Template of progress bar
  //Events
  @JSName("progressUpdated")
  var progressUpdated_ProgressOptions: js.UndefOr[js.Any] = js.undefined
  
  var showProgressLabel: js.UndefOr[Boolean] = js.undefined
}
object ProgressOptions {
  
  @scala.inline
  def apply(): ProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressOptions]
  }
  
  @scala.inline
  implicit class ProgressOptionsMutableBuilder[Self <: ProgressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setProgressCompleted(value: js.Any): Self = StObject.set(x, "progressCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressCompletedUndefined: Self = StObject.set(x, "progressCompleted", js.undefined)
    
    @scala.inline
    def setProgressTpl(value: Boolean): Self = StObject.set(x, "progressTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressTplUndefined: Self = StObject.set(x, "progressTpl", js.undefined)
    
    @scala.inline
    def setProgressUpdated(value: js.Any): Self = StObject.set(x, "progressUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdatedUndefined: Self = StObject.set(x, "progressUpdated", js.undefined)
    
    @scala.inline
    def setShowProgressLabel(value: Boolean): Self = StObject.set(x, "showProgressLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowProgressLabelUndefined: Self = StObject.set(x, "showProgressLabel", js.undefined)
  }
}

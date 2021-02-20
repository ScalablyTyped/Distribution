package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotKeyDetection extends StObject {
  
  /** The age of the hot key measured from when it was first detected. */
  var hotKeyAge: js.UndefOr[String] = js.native
  
  /** System-defined name of the step containing this hot key. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.native
  
  /** User-provided name of the step that contains this hot key. */
  var userStepName: js.UndefOr[String] = js.native
}
object HotKeyDetection {
  
  @scala.inline
  def apply(): HotKeyDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeyDetection]
  }
  
  @scala.inline
  implicit class HotKeyDetectionMutableBuilder[Self <: HotKeyDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHotKeyAge(value: String): Self = StObject.set(x, "hotKeyAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotKeyAgeUndefined: Self = StObject.set(x, "hotKeyAge", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    @scala.inline
    def setUserStepName(value: String): Self = StObject.set(x, "userStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStepNameUndefined: Self = StObject.set(x, "userStepName", js.undefined)
  }
}

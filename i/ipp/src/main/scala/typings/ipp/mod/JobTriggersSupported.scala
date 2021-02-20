package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTriggersSupported extends StObject {
  
  var `preset-name`: js.UndefOr[String] = js.native
}
object JobTriggersSupported {
  
  @scala.inline
  def apply(): JobTriggersSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTriggersSupported]
  }
  
  @scala.inline
  implicit class JobTriggersSupportedMutableBuilder[Self <: JobTriggersSupported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setPreset-name`(value: String): Self = StObject.set(x, "preset-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPreset-nameUndefined`: Self = StObject.set(x, "preset-name", js.undefined)
  }
}

package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaUnmountEvent extends StObject {
  
  /** Mount point. */
  var mountPoint: js.UndefOr[String] = js.undefined
  
  /** Volume label. Redacted to empty string on organization-owned managed profile devices. */
  var volumeLabel: js.UndefOr[String] = js.undefined
}
object MediaUnmountEvent {
  
  inline def apply(): MediaUnmountEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaUnmountEvent]
  }
  
  extension [Self <: MediaUnmountEvent](x: Self) {
    
    inline def setMountPoint(value: String): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
    
    inline def setMountPointUndefined: Self = StObject.set(x, "mountPoint", js.undefined)
    
    inline def setVolumeLabel(value: String): Self = StObject.set(x, "volumeLabel", value.asInstanceOf[js.Any])
    
    inline def setVolumeLabelUndefined: Self = StObject.set(x, "volumeLabel", js.undefined)
  }
}

package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSkippedDetail extends StObject {
  
  /**
    * If the App doesn&#39;t support the specific API level.
    */
  var incompatibleAppVersion: js.UndefOr[Boolean] = js.native
  
  /**
    * If the App doesn&#39;t run on the specific architecture, for example,
    * x86.
    */
  var incompatibleArchitecture: js.UndefOr[Boolean] = js.native
  
  /**
    * If the requested OS version doesn&#39;t run on the specific device model.
    */
  var incompatibleDevice: js.UndefOr[Boolean] = js.native
}
object SchemaSkippedDetail {
  
  @scala.inline
  def apply(): SchemaSkippedDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSkippedDetail]
  }
  
  @scala.inline
  implicit class SchemaSkippedDetailMutableBuilder[Self <: SchemaSkippedDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncompatibleAppVersion(value: Boolean): Self = StObject.set(x, "incompatibleAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompatibleAppVersionUndefined: Self = StObject.set(x, "incompatibleAppVersion", js.undefined)
    
    @scala.inline
    def setIncompatibleArchitecture(value: Boolean): Self = StObject.set(x, "incompatibleArchitecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompatibleArchitectureUndefined: Self = StObject.set(x, "incompatibleArchitecture", js.undefined)
    
    @scala.inline
    def setIncompatibleDevice(value: Boolean): Self = StObject.set(x, "incompatibleDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompatibleDeviceUndefined: Self = StObject.set(x, "incompatibleDevice", js.undefined)
  }
}

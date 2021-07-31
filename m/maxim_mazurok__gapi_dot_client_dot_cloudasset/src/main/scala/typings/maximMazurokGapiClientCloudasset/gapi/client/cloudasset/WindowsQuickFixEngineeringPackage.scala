package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsQuickFixEngineeringPackage extends StObject {
  
  /** A short textual description of the QFE update. */
  var caption: js.UndefOr[String] = js.undefined
  
  /** A textual description of the QFE update. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Unique identifier associated with a particular QFE update. */
  var hotFixId: js.UndefOr[String] = js.undefined
  
  /** Date that the QFE update was installed. Mapped from installed_on field. */
  var installTime: js.UndefOr[String] = js.undefined
}
object WindowsQuickFixEngineeringPackage {
  
  @scala.inline
  def apply(): WindowsQuickFixEngineeringPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsQuickFixEngineeringPackage]
  }
  
  @scala.inline
  implicit class WindowsQuickFixEngineeringPackageMutableBuilder[Self <: WindowsQuickFixEngineeringPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHotFixId(value: String): Self = StObject.set(x, "hotFixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotFixIdUndefined: Self = StObject.set(x, "hotFixId", js.undefined)
    
    @scala.inline
    def setInstallTime(value: String): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallTimeUndefined: Self = StObject.set(x, "installTime", js.undefined)
  }
}

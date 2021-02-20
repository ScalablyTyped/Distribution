package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about an operating system that can be targeted by ads.
  */
@js.native
trait SchemaOperatingSystem extends StObject {
  
  /**
    * DART ID of this operating system. This is the ID used for targeting.
    */
  var dartId: js.UndefOr[String] = js.native
  
  /**
    * Whether this operating system is for desktop.
    */
  var desktop: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystem&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Whether this operating system is for mobile.
    */
  var mobile: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of this operating system.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaOperatingSystem {
  
  @scala.inline
  def apply(): SchemaOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystem]
  }
  
  @scala.inline
  implicit class SchemaOperatingSystemMutableBuilder[Self <: SchemaOperatingSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    @scala.inline
    def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

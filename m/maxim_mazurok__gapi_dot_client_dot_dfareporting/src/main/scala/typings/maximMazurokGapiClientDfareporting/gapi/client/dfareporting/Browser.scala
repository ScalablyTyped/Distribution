package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browser extends StObject {
  
  /** ID referring to this grouping of browser and version numbers. This is the ID used for targeting. */
  var browserVersionId: js.UndefOr[String] = js.undefined
  
  /** DART ID of this browser. This is the ID used when generating reports. */
  var dartId: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#browser". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Major version number (leftmost number) of this browser. For example, for Chrome 5.0.376.86 beta, this field should be set to 5. An asterisk (*) may be used to target any version
    * number, and a question mark (?) may be used to target cases where the version number cannot be identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and
    * so on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad server knows the browser is Firefox but can't tell which version it is.
    */
  var majorVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Minor version number (number after first dot on left) of this browser. For example, for Chrome 5.0.375.86 beta, this field should be set to 0. An asterisk (*) may be used to target
    * any version number, and a question mark (?) may be used to target cases where the version number cannot be identified. For example, Chrome *.* targets any version of Chrome: 1.2,
    * 2.5, 3.5, and so on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad server knows the browser is Firefox but can't tell which version it is.
    */
  var minorVersion: js.UndefOr[String] = js.undefined
  
  /** Name of this browser. */
  var name: js.UndefOr[String] = js.undefined
}
object Browser {
  
  inline def apply(): Browser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Browser]
  }
  
  extension [Self <: Browser](x: Self) {
    
    inline def setBrowserVersionId(value: String): Self = StObject.set(x, "browserVersionId", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionIdUndefined: Self = StObject.set(x, "browserVersionId", js.undefined)
    
    inline def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    inline def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMinorVersion(value: String): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersionUndefined: Self = StObject.set(x, "minorVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBrowser extends StObject {
  
  /**
    * ID referring to this grouping of browser and version numbers. This is the ID used for targeting.
    */
  var browserVersionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DART ID of this browser. This is the ID used when generating reports.
    */
  var dartId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#browser".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Major version number (leftmost number) of this browser. For example, for Chrome 5.0.376.86 beta, this field should be set to 5. An asterisk (*) may be used to target any version number, and a question mark (?) may be used to target cases where the version number cannot be identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad server knows the browser is Firefox but can't tell which version it is.
    */
  var majorVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minor version number (number after first dot on left) of this browser. For example, for Chrome 5.0.375.86 beta, this field should be set to 0. An asterisk (*) may be used to target any version number, and a question mark (?) may be used to target cases where the version number cannot be identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad server knows the browser is Firefox but can't tell which version it is.
    */
  var minorVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this browser.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaBrowser {
  
  inline def apply(): SchemaBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowser]
  }
  
  extension [Self <: SchemaBrowser](x: Self) {
    
    inline def setBrowserVersionId(value: String): Self = StObject.set(x, "browserVersionId", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionIdNull: Self = StObject.set(x, "browserVersionId", null)
    
    inline def setBrowserVersionIdUndefined: Self = StObject.set(x, "browserVersionId", js.undefined)
    
    inline def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    inline def setDartIdNull: Self = StObject.set(x, "dartId", null)
    
    inline def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionNull: Self = StObject.set(x, "majorVersion", null)
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMinorVersion(value: String): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersionNull: Self = StObject.set(x, "minorVersion", null)
    
    inline def setMinorVersionUndefined: Self = StObject.set(x, "minorVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

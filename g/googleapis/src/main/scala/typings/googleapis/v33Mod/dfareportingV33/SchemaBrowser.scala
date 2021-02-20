package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a browser that can be targeted by ads.
  */
@js.native
trait SchemaBrowser extends StObject {
  
  /**
    * ID referring to this grouping of browser and version numbers. This is the
    * ID used for targeting.
    */
  var browserVersionId: js.UndefOr[String] = js.native
  
  /**
    * DART ID of this browser. This is the ID used when generating reports.
    */
  var dartId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browser&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Major version number (leftmost number) of this browser. For example, for
    * Chrome 5.0.376.86 beta, this field should be set to 5. An asterisk (*)
    * may be used to target any version number, and a question mark (?) may be
    * used to target cases where the version number cannot be identified. For
    * example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so
    * on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets
    * cases where the ad server knows the browser is Firefox but can&#39;t tell
    * which version it is.
    */
  var majorVersion: js.UndefOr[String] = js.native
  
  /**
    * Minor version number (number after first dot on left) of this browser.
    * For example, for Chrome 5.0.375.86 beta, this field should be set to 0.
    * An asterisk (*) may be used to target any version number, and a question
    * mark (?) may be used to target cases where the version number cannot be
    * identified. For example, Chrome *.* targets any version of Chrome:
    * 1.2, 2.5, 3.5, and so on. Chrome 3.* targets Chrome 3.1, 3.5, but
    * not 4.0. Firefox ?.? targets cases where the ad server knows the browser
    * is Firefox but can&#39;t tell which version it is.
    */
  var minorVersion: js.UndefOr[String] = js.native
  
  /**
    * Name of this browser.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaBrowser {
  
  @scala.inline
  def apply(): SchemaBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowser]
  }
  
  @scala.inline
  implicit class SchemaBrowserMutableBuilder[Self <: SchemaBrowser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserVersionId(value: String): Self = StObject.set(x, "browserVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserVersionIdUndefined: Self = StObject.set(x, "browserVersionId", js.undefined)
    
    @scala.inline
    def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    @scala.inline
    def setMinorVersion(value: String): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersionUndefined: Self = StObject.set(x, "minorVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

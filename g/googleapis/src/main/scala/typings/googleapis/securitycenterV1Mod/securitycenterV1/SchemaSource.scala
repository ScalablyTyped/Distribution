package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
  * source is an entity or a mechanism that can produce a finding. A source is
  * like a container of findings that come from the same scanner, logger,
  * monitor, etc.
  */
trait SchemaSource extends StObject {
  
  /**
    * The description of the source (max of 1024 characters). Example:
    * &quot;Cloud Security Scanner is a web security scanner for common
    * vulnerabilities in App Engine applications. It can automatically scan and
    * detect four common vulnerabilities, including cross-site-scripting (XSS),
    * Flash injection, mixed content (HTTP in HTTPS), and outdated/insecure
    * libraries.&quot;
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The source’s display name. A source’s display name must be unique amongst
    * its siblings, for example, two sources with the same parent can&#39;t
    * share the same display name. The display name must start and end with a
    * letter or digit, may contain letters, digits, spaces, hyphens, and
    * underscores, and can be no longer than 32 characters. This is captured by
    * the regular expression: [\p{L}\p{N}]({\p{L}\p{N}_- ]{0,30}[\p{L}\p{N}])?.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of this source. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/sources/456&quot;
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaSource {
  
  inline def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  extension [Self <: SchemaSource](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

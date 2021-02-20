package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A path-matching rule for a URL. If matched, will use the specified
  * BackendService to handle the traffic arriving at this URL.
  */
@js.native
trait SchemaPathRule extends StObject {
  
  /**
    * The list of path patterns to match. Each must start with / and the only
    * place a * is allowed is at the end following a /. The string fed to the
    * path matcher does not include any text after the first ? or #, and those
    * chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The full or partial URL of the backend service resource to which traffic
    * is directed if this rule is matched. If routeAction is additionally
    * specified, advanced routing actions like URL Rewrites, etc. take effect
    * prior to sending the request to the backend. However, if service is
    * specified, routeAction cannot contain any weightedBackendService s.
    * Conversely, if routeAction specifies any  weightedBackendServices,
    * service must not be specified. Only one of urlRedirect, service or
    * routeAction.weightedBackendService must be set.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaPathRule {
  
  @scala.inline
  def apply(): SchemaPathRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathRule]
  }
  
  @scala.inline
  implicit class SchemaPathRuleMutableBuilder[Self <: SchemaPathRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}

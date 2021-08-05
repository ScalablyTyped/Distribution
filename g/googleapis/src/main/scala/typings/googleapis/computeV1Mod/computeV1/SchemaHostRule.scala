package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UrlMaps A host-matching rule for a URL. If matched, will use the named
  * PathMatcher to select the BackendService.
  */
trait SchemaHostRule extends StObject {
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The list of host patterns to match. They must be valid hostnames, except
    * * will match any string of ([a-z0-9-.]*). In that case, * must be the
    * first character and must be followed in the pattern by either - or ..
    */
  var hosts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the PathMatcher to use to match the path portion of the URL
    * if the hostRule matches the URL&#39;s host portion.
    */
  var pathMatcher: js.UndefOr[String] = js.undefined
}
object SchemaHostRule {
  
  inline def apply(): SchemaHostRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHostRule]
  }
  
  extension [Self <: SchemaHostRule](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
    
    inline def setPathMatcher(value: String): Self = StObject.set(x, "pathMatcher", value.asInstanceOf[js.Any])
    
    inline def setPathMatcherUndefined: Self = StObject.set(x, "pathMatcher", js.undefined)
  }
}

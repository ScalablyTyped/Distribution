package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template to list Domains in Directory API.
  */
trait SchemaDomains2 extends StObject {
  
  /**
    * List of domain objects.
    */
  var domains: js.UndefOr[js.Array[SchemaDomains]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDomains2 {
  
  @scala.inline
  def apply(): SchemaDomains2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomains2]
  }
  
  @scala.inline
  implicit class SchemaDomains2MutableBuilder[Self <: SchemaDomains2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: js.Array[SchemaDomains]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: SchemaDomains*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

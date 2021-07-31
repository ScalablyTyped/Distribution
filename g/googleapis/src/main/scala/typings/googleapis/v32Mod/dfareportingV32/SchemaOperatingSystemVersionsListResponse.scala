package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Operating System Version List Response
  */
trait SchemaOperatingSystemVersionsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemVersionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Operating system version collection.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[SchemaOperatingSystemVersion]] = js.undefined
}
object SchemaOperatingSystemVersionsListResponse {
  
  @scala.inline
  def apply(): SchemaOperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemVersionsListResponse]
  }
  
  @scala.inline
  implicit class SchemaOperatingSystemVersionsListResponseMutableBuilder[Self <: SchemaOperatingSystemVersionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersions(value: js.Array[SchemaOperatingSystemVersion]): Self = StObject.set(x, "operatingSystemVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemVersionsUndefined: Self = StObject.set(x, "operatingSystemVersions", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersionsVarargs(value: SchemaOperatingSystemVersion*): Self = StObject.set(x, "operatingSystemVersions", js.Array(value :_*))
  }
}

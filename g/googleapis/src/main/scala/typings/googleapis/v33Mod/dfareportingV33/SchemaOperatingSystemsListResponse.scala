package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Operating System List Response
  */
trait SchemaOperatingSystemsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Operating system collection.
    */
  var operatingSystems: js.UndefOr[js.Array[SchemaOperatingSystem]] = js.undefined
}
object SchemaOperatingSystemsListResponse {
  
  @scala.inline
  def apply(): SchemaOperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemsListResponse]
  }
  
  @scala.inline
  implicit class SchemaOperatingSystemsListResponseMutableBuilder[Self <: SchemaOperatingSystemsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOperatingSystems(value: js.Array[SchemaOperatingSystem]): Self = StObject.set(x, "operatingSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemsUndefined: Self = StObject.set(x, "operatingSystems", js.undefined)
    
    @scala.inline
    def setOperatingSystemsVarargs(value: SchemaOperatingSystem*): Self = StObject.set(x, "operatingSystems", js.Array(value :_*))
  }
}

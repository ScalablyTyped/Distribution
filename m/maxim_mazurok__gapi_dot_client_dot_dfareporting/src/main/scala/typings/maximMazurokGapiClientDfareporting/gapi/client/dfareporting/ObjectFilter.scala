package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectFilter extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#objectFilter". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Applicable when status is ASSIGNED. The user has access to objects with these object IDs. */
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Status of the filter. NONE means the user has access to none of the objects. ALL means the user has access to all objects. ASSIGNED means the user has access to the objects with IDs
    * in the objectIds list.
    */
  var status: js.UndefOr[String] = js.undefined
}
object ObjectFilter {
  
  @scala.inline
  def apply(): ObjectFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectFilter]
  }
  
  @scala.inline
  implicit class ObjectFilterMutableBuilder[Self <: ObjectFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

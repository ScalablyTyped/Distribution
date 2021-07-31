package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metro List Response
  */
trait SchemaMetrosListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#metrosListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metro collection.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.undefined
}
object SchemaMetrosListResponse {
  
  @scala.inline
  def apply(): SchemaMetrosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrosListResponse]
  }
  
  @scala.inline
  implicit class SchemaMetrosListResponseMutableBuilder[Self <: SchemaMetrosListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetros(value: js.Array[SchemaMetro]): Self = StObject.set(x, "metros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrosUndefined: Self = StObject.set(x, "metros", js.undefined)
    
    @scala.inline
    def setMetrosVarargs(value: SchemaMetro*): Self = StObject.set(x, "metros", js.Array(value :_*))
  }
}

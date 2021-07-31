package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Browser List Response
  */
trait SchemaBrowsersListResponse extends StObject {
  
  /**
    * Browser collection.
    */
  var browsers: js.UndefOr[js.Array[SchemaBrowser]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBrowsersListResponse {
  
  @scala.inline
  def apply(): SchemaBrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowsersListResponse]
  }
  
  @scala.inline
  implicit class SchemaBrowsersListResponseMutableBuilder[Self <: SchemaBrowsersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowsers(value: js.Array[SchemaBrowser]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    @scala.inline
    def setBrowsersVarargs(value: SchemaBrowser*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

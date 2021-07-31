package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedsFetchNowResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeedsFetchNowResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDatafeedsFetchNowResponse {
  
  @scala.inline
  def apply(): SchemaDatafeedsFetchNowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsFetchNowResponse]
  }
  
  @scala.inline
  implicit class SchemaDatafeedsFetchNowResponseMutableBuilder[Self <: SchemaDatafeedsFetchNowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

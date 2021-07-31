package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsRequestGmbAccessResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsRequestGmbAccessResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaLiasettingsRequestGmbAccessResponse {
  
  @scala.inline
  def apply(): SchemaLiasettingsRequestGmbAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsRequestGmbAccessResponse]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsRequestGmbAccessResponseMutableBuilder[Self <: SchemaLiasettingsRequestGmbAccessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

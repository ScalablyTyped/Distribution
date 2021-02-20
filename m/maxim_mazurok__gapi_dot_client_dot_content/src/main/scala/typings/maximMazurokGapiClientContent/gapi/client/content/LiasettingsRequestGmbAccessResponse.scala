package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsRequestGmbAccessResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#liasettingsRequestGmbAccessResponse". */
  var kind: js.UndefOr[String] = js.native
}
object LiasettingsRequestGmbAccessResponse {
  
  @scala.inline
  def apply(): LiasettingsRequestGmbAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsRequestGmbAccessResponse]
  }
  
  @scala.inline
  implicit class LiasettingsRequestGmbAccessResponseMutableBuilder[Self <: LiasettingsRequestGmbAccessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

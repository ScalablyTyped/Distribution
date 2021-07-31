package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlChannel extends StObject {
  
  /**
    * Unique identifier of this URL channel. This should be considered an
    * opaque identifier; it is not safe to rely on it being in any particular
    * format.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsensehost#urlChannel.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * URL Pattern of this URL channel. Does not include &quot;http://&quot; or
    * &quot;https://&quot;. Example: www.example.com/home
    */
  var urlPattern: js.UndefOr[String] = js.undefined
}
object SchemaUrlChannel {
  
  @scala.inline
  def apply(): SchemaUrlChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlChannel]
  }
  
  @scala.inline
  implicit class SchemaUrlChannelMutableBuilder[Self <: SchemaUrlChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}

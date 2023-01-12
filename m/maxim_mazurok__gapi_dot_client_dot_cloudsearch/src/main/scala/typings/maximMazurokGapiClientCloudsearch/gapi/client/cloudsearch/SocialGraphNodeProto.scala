package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialGraphNodeProto extends StObject {
  
  /** The fields from ccc/socialgraph/socialgraphnode.proto:SgnNode that uniquely identify a social graph node. The 'ident' field is not included here because its value can be changed. */
  var sgnDomain: js.UndefOr[String] = js.undefined
  
  var sgnPk: js.UndefOr[String] = js.undefined
}
object SocialGraphNodeProto {
  
  inline def apply(): SocialGraphNodeProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialGraphNodeProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocialGraphNodeProto] (val x: Self) extends AnyVal {
    
    inline def setSgnDomain(value: String): Self = StObject.set(x, "sgnDomain", value.asInstanceOf[js.Any])
    
    inline def setSgnDomainUndefined: Self = StObject.set(x, "sgnDomain", js.undefined)
    
    inline def setSgnPk(value: String): Self = StObject.set(x, "sgnPk", value.asInstanceOf[js.Any])
    
    inline def setSgnPkUndefined: Self = StObject.set(x, "sgnPk", js.undefined)
  }
}

package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSocialGraphNodeProto extends StObject {
  
  /**
    * The fields from ccc/socialgraph/socialgraphnode.proto:SgnNode that uniquely identify a social graph node. The 'ident' field is not included here because its value can be changed.
    */
  var sgnDomain: js.UndefOr[String | Null] = js.undefined
  
  var sgnPk: js.UndefOr[String | Null] = js.undefined
}
object SchemaSocialGraphNodeProto {
  
  inline def apply(): SchemaSocialGraphNodeProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSocialGraphNodeProto]
  }
  
  extension [Self <: SchemaSocialGraphNodeProto](x: Self) {
    
    inline def setSgnDomain(value: String): Self = StObject.set(x, "sgnDomain", value.asInstanceOf[js.Any])
    
    inline def setSgnDomainNull: Self = StObject.set(x, "sgnDomain", null)
    
    inline def setSgnDomainUndefined: Self = StObject.set(x, "sgnDomain", js.undefined)
    
    inline def setSgnPk(value: String): Self = StObject.set(x, "sgnPk", value.asInstanceOf[js.Any])
    
    inline def setSgnPkNull: Self = StObject.set(x, "sgnPk", null)
    
    inline def setSgnPkUndefined: Self = StObject.set(x, "sgnPk", js.undefined)
  }
}

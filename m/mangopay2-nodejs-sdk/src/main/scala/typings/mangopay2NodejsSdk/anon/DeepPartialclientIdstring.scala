package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typingsTypesMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.DeepPartial<{  clientId :string,   apiVersion :string,  readonly id :string}> */
trait DeepPartialclientIdstring extends StObject {
  
  var apiVersion: js.UndefOr[DeepPartial[String]] = js.undefined
  
  var clientId: js.UndefOr[DeepPartial[String]] = js.undefined
  
  var id: js.UndefOr[DeepPartial[String]] = js.undefined
}
object DeepPartialclientIdstring {
  
  inline def apply(): DeepPartialclientIdstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialclientIdstring]
  }
  
  extension [Self <: DeepPartialclientIdstring](x: Self) {
    
    inline def setApiVersion(value: DeepPartial[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setClientId(value: DeepPartial[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setId(value: DeepPartial[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}

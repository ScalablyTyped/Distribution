package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typesMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<{  clientId :string,   apiVersion :string,  readonly id :string}> */
trait DeepPartialclientIdstring extends StObject {
  
  var apiVersion: js.UndefOr[DeepPartial[String]] = js.undefined
  
  var clientId: js.UndefOr[DeepPartial[String]] = js.undefined
  
  var id: js.UndefOr[DeepPartial[String]] = js.undefined
}
object DeepPartialclientIdstring {
  
  @scala.inline
  def apply(): DeepPartialclientIdstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialclientIdstring]
  }
  
  @scala.inline
  implicit class DeepPartialclientIdstringMutableBuilder[Self <: DeepPartialclientIdstring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: DeepPartial[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setClientId(value: DeepPartial[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setId(value: DeepPartial[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}

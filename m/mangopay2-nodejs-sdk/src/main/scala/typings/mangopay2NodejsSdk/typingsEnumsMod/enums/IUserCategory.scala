package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserCategory extends StObject {
  
  var Owner: OWNER
  
  var Payer: PAYER
}
object IUserCategory {
  
  inline def apply(): IUserCategory = {
    val __obj = js.Dynamic.literal(Owner = "OWNER", Payer = "PAYER")
    __obj.asInstanceOf[IUserCategory]
  }
  
  extension [Self <: IUserCategory](x: Self) {
    
    inline def setOwner(value: OWNER): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setPayer(value: PAYER): Self = StObject.set(x, "Payer", value.asInstanceOf[js.Any])
  }
}

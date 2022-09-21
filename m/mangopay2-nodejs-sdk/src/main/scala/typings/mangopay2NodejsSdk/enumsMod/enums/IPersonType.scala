package typings.mangopay2NodejsSdk.enumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonType extends StObject {
  
  var Legal: LEGAL
  
  var Natural: NATURAL
  
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
}
object IPersonType {
  
  inline def apply(): IPersonType = {
    val __obj = js.Dynamic.literal(Legal = "LEGAL", Natural = "NATURAL", NotSpecified = "NotSpecified")
    __obj.asInstanceOf[IPersonType]
  }
  
  extension [Self <: IPersonType](x: Self) {
    
    inline def setLegal(value: LEGAL): Self = StObject.set(x, "Legal", value.asInstanceOf[js.Any])
    
    inline def setNatural(value: NATURAL): Self = StObject.set(x, "Natural", value.asInstanceOf[js.Any])
    
    inline def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
  }
}

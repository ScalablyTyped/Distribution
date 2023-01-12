package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPayInExecutionType extends StObject {
  
  var Direct: DIRECT
  
  var Web: WEB
}
object IPayInExecutionType {
  
  inline def apply(): IPayInExecutionType = {
    val __obj = js.Dynamic.literal(Direct = "DIRECT", Web = "WEB")
    __obj.asInstanceOf[IPayInExecutionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPayInExecutionType] (val x: Self) extends AnyVal {
    
    inline def setDirect(value: DIRECT): Self = StObject.set(x, "Direct", value.asInstanceOf[js.Any])
    
    inline def setWeb(value: WEB): Self = StObject.set(x, "Web", value.asInstanceOf[js.Any])
  }
}

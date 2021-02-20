package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPayInExecutionType extends StObject {
  
  var Direct: DIRECT = js.native
  
  var Web: WEB = js.native
}
object IPayInExecutionType {
  
  @scala.inline
  def apply(Direct: DIRECT, Web: WEB): IPayInExecutionType = {
    val __obj = js.Dynamic.literal(Direct = Direct.asInstanceOf[js.Any], Web = Web.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayInExecutionType]
  }
  
  @scala.inline
  implicit class IPayInExecutionTypeMutableBuilder[Self <: IPayInExecutionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirect(value: DIRECT): Self = StObject.set(x, "Direct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb(value: WEB): Self = StObject.set(x, "Web", value.asInstanceOf[js.Any])
  }
}

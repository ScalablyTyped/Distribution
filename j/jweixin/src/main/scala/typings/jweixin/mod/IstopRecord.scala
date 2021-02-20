package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IstopRecord extends BaseParams {
  
  @JSName("success")
  def success_MIstopRecord(res: Resouce): Unit = js.native
}
object IstopRecord {
  
  @scala.inline
  def apply(success: Resouce => Unit): IstopRecord = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IstopRecord]
  }
  
  @scala.inline
  implicit class IstopRecordMutableBuilder[Self <: IstopRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Resouce => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

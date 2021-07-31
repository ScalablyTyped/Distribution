package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxData extends StObject {
  
  var ctx: IpfsAny
  
  var data: js.Any
  
  var timeout: js.Any
  
  var topic: js.Any
}
object CtxData {
  
  @scala.inline
  def apply(ctx: IpfsAny, data: js.Any, timeout: js.Any, topic: js.Any): CtxData = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxData]
  }
  
  @scala.inline
  implicit class CtxDataMutableBuilder[Self <: CtxData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: js.Any): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}

package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  var ctx: Print
  
  var timeout: js.Any
  
  var topic: js.Any
}
object Topic {
  
  @scala.inline
  def apply(ctx: Print, timeout: js.Any, topic: js.Any): Topic = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  @scala.inline
  implicit class TopicMutableBuilder[Self <: Topic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: js.Any): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}

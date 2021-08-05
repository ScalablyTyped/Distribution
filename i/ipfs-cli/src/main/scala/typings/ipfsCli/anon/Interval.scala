package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  var ctx: Print
  
  var interval: js.Any
  
  var peer: js.Any
  
  var poll: js.Any
  
  var proto: js.Any
  
  var timeout: js.Any
}
object Interval {
  
  inline def apply(ctx: Print, interval: js.Any, peer: js.Any, poll: js.Any, proto: js.Any, timeout: js.Any): Interval = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], poll = poll.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  extension [Self <: Interval](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: js.Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: js.Any): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setPoll(value: js.Any): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    inline def setProto(value: js.Any): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

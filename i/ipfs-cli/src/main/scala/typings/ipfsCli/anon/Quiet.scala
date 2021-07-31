package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quiet extends StObject {
  
  var cidBase: js.Any
  
  var ctx: Print
  
  var ipfsPath: js.Any
  
  var quiet: js.Any
  
  var stream: js.Any
  
  var timeout: js.Any
  
  var `type`: js.Any
}
object Quiet {
  
  @scala.inline
  def apply(
    cidBase: js.Any,
    ctx: Print,
    ipfsPath: js.Any,
    quiet: js.Any,
    stream: js.Any,
    timeout: js.Any,
    `type`: js.Any
  ): Quiet = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quiet]
  }
  
  @scala.inline
  implicit class QuietMutableBuilder[Self <: Quiet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpfsPath(value: js.Any): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiet(value: js.Any): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

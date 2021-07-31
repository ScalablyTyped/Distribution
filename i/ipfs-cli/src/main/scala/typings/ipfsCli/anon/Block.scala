package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  var block: js.Any
  
  var cidBase: js.Any
  
  var ctx: Ipfs
  
  var format: js.Any
  
  var mhlen: js.Any
  
  var mhtype: js.Any
  
  var pin: js.Any
  
  var timeout: js.Any
  
  var version: js.Any
}
object Block {
  
  @scala.inline
  def apply(
    block: js.Any,
    cidBase: js.Any,
    ctx: Ipfs,
    format: js.Any,
    mhlen: js.Any,
    mhtype: js.Any,
    pin: js.Any,
    timeout: js.Any,
    version: js.Any
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], mhlen = mhlen.asInstanceOf[js.Any], mhtype = mhtype.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: js.Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Ipfs): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMhlen(value: js.Any): Self = StObject.set(x, "mhlen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMhtype(value: js.Any): Self = StObject.set(x, "mhtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: js.Any): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

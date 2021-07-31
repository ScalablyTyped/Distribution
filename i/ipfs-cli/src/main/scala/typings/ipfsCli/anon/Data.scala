package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var cidBase: js.Any
  
  var ctx: Ipfs
  
  var data: js.Any
  
  var root: js.Any
  
  var timeout: js.Any
}
object Data {
  
  @scala.inline
  def apply(cidBase: js.Any, ctx: Ipfs, data: js.Any, root: js.Any, timeout: js.Any): Data = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Ipfs): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

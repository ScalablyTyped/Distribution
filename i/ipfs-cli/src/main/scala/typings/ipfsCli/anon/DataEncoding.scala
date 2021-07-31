package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEncoding extends StObject {
  
  var cidBase: js.Any
  
  var ctx: Print
  
  var dataEncoding: js.Any
  
  var key: js.Any
  
  var timeout: js.Any
}
object DataEncoding {
  
  @scala.inline
  def apply(cidBase: js.Any, ctx: Print, dataEncoding: js.Any, key: js.Any, timeout: js.Any): DataEncoding = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dataEncoding = dataEncoding.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEncoding]
  }
  
  @scala.inline
  implicit class DataEncodingMutableBuilder[Self <: DataEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncoding(value: js.Any): Self = StObject.set(x, "dataEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

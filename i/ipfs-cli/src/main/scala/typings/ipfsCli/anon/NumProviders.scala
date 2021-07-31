package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumProviders extends StObject {
  
  var ctx: Print
  
  var key: js.Any
  
  var numProviders: js.Any
  
  var timeout: js.Any
}
object NumProviders {
  
  @scala.inline
  def apply(ctx: Print, key: js.Any, numProviders: js.Any, timeout: js.Any): NumProviders = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], numProviders = numProviders.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumProviders]
  }
  
  @scala.inline
  implicit class NumProvidersMutableBuilder[Self <: NumProviders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumProviders(value: js.Any): Self = StObject.set(x, "numProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

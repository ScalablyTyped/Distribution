package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var ctx: js.Any
  
  var name: js.Any
  
  var output: js.Any
  
  var passout: js.Any
  
  var timeout: js.Any
}
object Name {
  
  @scala.inline
  def apply(ctx: js.Any, name: js.Any, output: js.Any, passout: js.Any, timeout: js.Any): Name = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], passout = passout.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassout(value: js.Any): Self = StObject.set(x, "passout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

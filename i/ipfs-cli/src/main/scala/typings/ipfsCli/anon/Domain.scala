package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var ctx: Print
  
  var domain: js.Any
  
  var format: js.Any
  
  var recursive: js.Any
  
  var timeout: js.Any
}
object Domain {
  
  @scala.inline
  def apply(ctx: Print, domain: js.Any, format: js.Any, recursive: js.Any, timeout: js.Any): Domain = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: js.Any): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Force extends StObject {
  
  var ctx: js.Any
  
  var force: js.Any
  
  var hash: js.Any
  
  var quiet: js.Any
  
  var timeout: js.Any
}
object Force {
  
  @scala.inline
  def apply(ctx: js.Any, force: js.Any, hash: js.Any, quiet: js.Any, timeout: js.Any): Force = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  
  @scala.inline
  implicit class ForceMutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: js.Any): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiet(value: js.Any): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

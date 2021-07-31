package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRun extends StObject {
  
  var ctx: js.Any
  
  var dryRun: js.Any
  
  var profile: js.Any
  
  var timeout: js.Any
}
object DryRun {
  
  @scala.inline
  def apply(ctx: js.Any, dryRun: js.Any, profile: js.Any, timeout: js.Any): DryRun = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], dryRun = dryRun.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryRun]
  }
  
  @scala.inline
  implicit class DryRunMutableBuilder[Self <: DryRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: js.Any): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: js.Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}

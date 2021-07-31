package typings.loopback.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var params: js.UndefOr[js.Array[js.Any] | js.Any] = js.undefined
  
  var paths: js.UndefOr[js.Array[js.Any] | String | RegExp] = js.undefined
  
  var phase: String
}
object Enabled {
  
  @scala.inline
  def apply(phase: String): Enabled = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setParams(value: js.Array[js.Any] | js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[js.Any] | String | RegExp): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: js.Any*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}

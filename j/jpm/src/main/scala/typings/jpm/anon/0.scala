package typings.jpm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var script: js.UndefOr[Boolean] = js.undefined
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScript(value: Boolean): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}

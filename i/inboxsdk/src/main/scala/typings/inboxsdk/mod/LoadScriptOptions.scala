package typings.inboxsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadScriptOptions extends StObject {
  
  var nowrap: js.UndefOr[Boolean] = js.native
}
object LoadScriptOptions {
  
  @scala.inline
  def apply(): LoadScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadScriptOptions]
  }
  
  @scala.inline
  implicit class LoadScriptOptionsMutableBuilder[Self <: LoadScriptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
  }
}

package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLauncher extends StObject {
  
  var base: String = js.native
  
  var browserName: js.UndefOr[String] = js.native
  
  var flags: js.UndefOr[js.Array[String]] = js.native
  
  var platform: js.UndefOr[String] = js.native
}
object CustomLauncher {
  
  @scala.inline
  def apply(base: String): CustomLauncher = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLauncher]
  }
  
  @scala.inline
  implicit class CustomLauncherMutableBuilder[Self <: CustomLauncher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    @scala.inline
    def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}

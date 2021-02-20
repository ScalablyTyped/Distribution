package typings.hapi.anon

import typings.hapi.mod.ServerAuthConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends StObject {
  
  var default: ServerAuthConfig = js.native
}
object Default {
  
  @scala.inline
  def apply(default: ServerAuthConfig): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: ServerAuthConfig): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}

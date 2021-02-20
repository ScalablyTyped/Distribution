package typings.googleapis.v12Mod.adexchangebuyerV12

import typings.googleapis.googleapisStrings.v1_2
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends GlobalOptions {
  
  var version: v1_2 = js.native
}
object Options {
  
  @scala.inline
  def apply(version: v1_2): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: v1_2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

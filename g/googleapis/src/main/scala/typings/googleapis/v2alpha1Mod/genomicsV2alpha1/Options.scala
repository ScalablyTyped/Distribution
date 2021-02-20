package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import typings.googleapis.googleapisStrings.v2alpha1
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends GlobalOptions {
  
  var version: v2alpha1 = js.native
}
object Options {
  
  @scala.inline
  def apply(version: v2alpha1): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: v2alpha1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

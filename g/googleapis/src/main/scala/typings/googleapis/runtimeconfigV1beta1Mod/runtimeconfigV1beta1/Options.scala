package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v1beta1
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v1beta1")
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: v1beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

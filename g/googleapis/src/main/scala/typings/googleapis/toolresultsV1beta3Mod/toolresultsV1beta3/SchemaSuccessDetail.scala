package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSuccessDetail extends StObject {
  
  /**
    * If a native process other than the app crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
}
object SchemaSuccessDetail {
  
  @scala.inline
  def apply(): SchemaSuccessDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuccessDetail]
  }
  
  @scala.inline
  implicit class SchemaSuccessDetailMutableBuilder[Self <: SchemaSuccessDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtherNativeCrash(value: Boolean): Self = StObject.set(x, "otherNativeCrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherNativeCrashUndefined: Self = StObject.set(x, "otherNativeCrash", js.undefined)
  }
}

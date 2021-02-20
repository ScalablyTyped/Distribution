package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how de-identification of image pixel should be handled.
  */
@js.native
trait SchemaImageConfig extends StObject {
  
  /**
    * Determines how to redact text from image.
    */
  var textRedactionMode: js.UndefOr[String] = js.native
}
object SchemaImageConfig {
  
  @scala.inline
  def apply(): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfig]
  }
  
  @scala.inline
  implicit class SchemaImageConfigMutableBuilder[Self <: SchemaImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextRedactionMode(value: String): Self = StObject.set(x, "textRedactionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRedactionModeUndefined: Self = StObject.set(x, "textRedactionMode", js.undefined)
  }
}

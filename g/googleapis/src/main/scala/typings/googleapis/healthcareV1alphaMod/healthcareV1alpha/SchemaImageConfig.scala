package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

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
    * If true, all text found in the image is redacted.
    */
  var redactAllText: js.UndefOr[Boolean] = js.native
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
    def setRedactAllText(value: Boolean): Self = StObject.set(x, "redactAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactAllTextUndefined: Self = StObject.set(x, "redactAllText", js.undefined)
  }
}

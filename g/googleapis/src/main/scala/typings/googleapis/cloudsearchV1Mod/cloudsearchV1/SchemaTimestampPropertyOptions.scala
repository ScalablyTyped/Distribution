package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for timestamp properties.
  */
@js.native
trait SchemaTimestampPropertyOptions extends StObject {
  
  /**
    * If set, describes how the timestamp should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaTimestampOperatorOptions] = js.native
}
object SchemaTimestampPropertyOptions {
  
  @scala.inline
  def apply(): SchemaTimestampPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampPropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaTimestampPropertyOptionsMutableBuilder[Self <: SchemaTimestampPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: SchemaTimestampOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}

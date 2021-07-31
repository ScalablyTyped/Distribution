package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhenSchemaOptions extends StObject {
  
  /**
    * the alternative schema type if the condition is false. Required if then is missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}
object WhenSchemaOptions {
  
  @scala.inline
  def apply(): WhenSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenSchemaOptions]
  }
  
  @scala.inline
  implicit class WhenSchemaOptionsMutableBuilder[Self <: WhenSchemaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtherwise(value: SchemaLike): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherwiseNull: Self = StObject.set(x, "otherwise", null)
    
    @scala.inline
    def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    @scala.inline
    def setThen(value: SchemaLike): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThenNull: Self = StObject.set(x, "then", null)
    
    @scala.inline
    def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}

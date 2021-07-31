package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanPropertyOptions extends StObject {
  
  /** If set, describes how the boolean should be used as a search operator. */
  var operatorOptions: js.UndefOr[BooleanOperatorOptions] = js.undefined
}
object BooleanPropertyOptions {
  
  @scala.inline
  def apply(): BooleanPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanPropertyOptions]
  }
  
  @scala.inline
  implicit class BooleanPropertyOptionsMutableBuilder[Self <: BooleanPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: BooleanOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}

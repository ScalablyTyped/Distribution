package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key-value pair of detailed information about the client which invoked the
  * test. Examples: {&#39;Version&#39;, &#39;1.0&#39;}, {&#39;Release
  * Track&#39;, &#39;BETA&#39;}.
  */
trait SchemaClientInfoDetail extends StObject {
  
  /**
    * Required. The key of detailed client information.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The value of detailed client information.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaClientInfoDetail {
  
  @scala.inline
  def apply(): SchemaClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfoDetail]
  }
  
  @scala.inline
  implicit class SchemaClientInfoDetailMutableBuilder[Self <: SchemaClientInfoDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

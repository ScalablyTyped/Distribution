package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Admin API warning message.
  */
trait SchemaApiWarning extends StObject {
  
  /**
    * Code to uniquely identify the warning type.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The warning message.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaApiWarning {
  
  @scala.inline
  def apply(): SchemaApiWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiWarning]
  }
  
  @scala.inline
  implicit class SchemaApiWarningMutableBuilder[Self <: SchemaApiWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}

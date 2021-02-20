package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arg matchers for the mock function.
  */
@js.native
trait SchemaArg extends StObject {
  
  /**
    * Argument matches any value provided.
    */
  var anyValue: js.UndefOr[SchemaEmpty] = js.native
  
  /**
    * Argument exactly matches value provided.
    */
  var exactValue: js.UndefOr[js.Any] = js.native
}
object SchemaArg {
  
  @scala.inline
  def apply(): SchemaArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArg]
  }
  
  @scala.inline
  implicit class SchemaArgMutableBuilder[Self <: SchemaArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyValue(value: SchemaEmpty): Self = StObject.set(x, "anyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyValueUndefined: Self = StObject.set(x, "anyValue", js.undefined)
    
    @scala.inline
    def setExactValue(value: js.Any): Self = StObject.set(x, "exactValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactValueUndefined: Self = StObject.set(x, "exactValue", js.undefined)
  }
}

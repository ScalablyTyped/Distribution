package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A key-value pair passed as an environment variable to the test.
  */
@js.native
trait SchemaEnvironmentVariable extends StObject {
  
  /**
    * Key for the environment variable.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Value for the environment variable.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaEnvironmentVariable {
  
  @scala.inline
  def apply(): SchemaEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentVariable]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentVariableMutableBuilder[Self <: SchemaEnvironmentVariable] (val x: Self) extends AnyVal {
    
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

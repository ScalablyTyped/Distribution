package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An environment variable to set for an action.
  */
@js.native
trait SchemaEnvVariable extends StObject {
  
  /**
    * Deprecated, do not use.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the environment variable.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The value of the variable.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaEnvVariable {
  
  @scala.inline
  def apply(): SchemaEnvVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvVariable]
  }
  
  @scala.inline
  implicit class SchemaEnvVariableMutableBuilder[Self <: SchemaEnvVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

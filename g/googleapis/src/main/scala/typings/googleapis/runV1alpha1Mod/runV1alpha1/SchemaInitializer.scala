package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initializer is information about an initializer that has not yet completed.
  */
@js.native
trait SchemaInitializer extends StObject {
  
  /**
    * name of the process that is responsible for initializing this object.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaInitializer {
  
  @scala.inline
  def apply(): SchemaInitializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitializer]
  }
  
  @scala.inline
  implicit class SchemaInitializerMutableBuilder[Self <: SchemaInitializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

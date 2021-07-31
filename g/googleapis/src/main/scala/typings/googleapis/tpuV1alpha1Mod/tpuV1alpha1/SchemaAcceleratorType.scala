package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A accelerator type that a Node can be configured with.
  */
trait SchemaAcceleratorType extends StObject {
  
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * the accelerator type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaAcceleratorType {
  
  @scala.inline
  def apply(): SchemaAcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorType]
  }
  
  @scala.inline
  implicit class SchemaAcceleratorTypeMutableBuilder[Self <: SchemaAcceleratorType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

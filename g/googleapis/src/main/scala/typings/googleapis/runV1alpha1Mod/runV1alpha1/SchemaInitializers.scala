package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initializers tracks the progress of initialization.
  */
trait SchemaInitializers extends StObject {
  
  /**
    * Pending is a list of initializers that must execute in order before this
    * object is visible. When the last pending initializer is removed, and no
    * failing result is set, the initializers struct will be set to nil and the
    * object is considered as initialized and visible to all clients.
    * +patchMergeKey=name +patchStrategy=merge
    */
  var pending: js.UndefOr[js.Array[SchemaInitializer]] = js.undefined
}
object SchemaInitializers {
  
  @scala.inline
  def apply(): SchemaInitializers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitializers]
  }
  
  @scala.inline
  implicit class SchemaInitializersMutableBuilder[Self <: SchemaInitializers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPending(value: js.Array[SchemaInitializer]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    @scala.inline
    def setPendingVarargs(value: SchemaInitializer*): Self = StObject.set(x, "pending", js.Array(value :_*))
  }
}

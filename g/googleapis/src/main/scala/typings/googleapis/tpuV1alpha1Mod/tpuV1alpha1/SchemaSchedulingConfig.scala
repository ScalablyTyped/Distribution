package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedulingConfig extends StObject {
  
  var preemptible: js.UndefOr[Boolean] = js.undefined
}
object SchemaSchedulingConfig {
  
  @scala.inline
  def apply(): SchemaSchedulingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingConfig]
  }
  
  @scala.inline
  implicit class SchemaSchedulingConfigMutableBuilder[Self <: SchemaSchedulingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
  }
}

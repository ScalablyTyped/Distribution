package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The view model of a single quantity, e.g. &quot;800 MiB&quot;. Corresponds
  * to
  * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/generated.proto
  */
@js.native
trait SchemaQuantity extends StObject {
  
  /**
    * Stringified version of the quantity, e.g., &quot;800 MiB&quot;.
    */
  var string: js.UndefOr[String] = js.native
}
object SchemaQuantity {
  
  @scala.inline
  def apply(): SchemaQuantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuantity]
  }
  
  @scala.inline
  implicit class SchemaQuantityMutableBuilder[Self <: SchemaQuantity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}

package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSharedTargeting extends StObject {
  
  /**
    * The list of values to exclude from targeting. Each value is AND&#39;d
    * together.
    */
  var exclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.native
  
  /**
    * The list of value to include as part of the targeting. Each value is
    * OR&#39;d together.
    */
  var inclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.native
  
  /**
    * The key representing the shared targeting criterion.
    */
  var key: js.UndefOr[String] = js.native
}
object SchemaSharedTargeting {
  
  @scala.inline
  def apply(): SchemaSharedTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedTargeting]
  }
  
  @scala.inline
  implicit class SchemaSharedTargetingMutableBuilder[Self <: SchemaSharedTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusions(value: js.Array[SchemaTargetingValue]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: SchemaTargetingValue*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    @scala.inline
    def setInclusions(value: js.Array[SchemaTargetingValue]): Self = StObject.set(x, "inclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionsUndefined: Self = StObject.set(x, "inclusions", js.undefined)
    
    @scala.inline
    def setInclusionsVarargs(value: SchemaTargetingValue*): Self = StObject.set(x, "inclusions", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}

package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly Shows any corrections that were applied to this creative.
  */
@js.native
trait SchemaCorrection extends StObject {
  
  /**
    * The contexts for the correction.
    */
  var contexts: js.UndefOr[js.Array[SchemaServingContext]] = js.native
  
  /**
    * Additional details about what was corrected.
    */
  var details: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The type of correction that was applied to the creative.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaCorrection {
  
  @scala.inline
  def apply(): SchemaCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorrection]
  }
  
  @scala.inline
  implicit class SchemaCorrectionMutableBuilder[Self <: SchemaCorrection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[SchemaServingContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: SchemaServingContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

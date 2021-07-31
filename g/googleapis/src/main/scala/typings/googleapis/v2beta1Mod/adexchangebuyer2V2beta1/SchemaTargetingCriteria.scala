package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advertisers can target different attributes of an ad slot. For example,
  * they can choose to show ads only if the user is in the U.S. Such targeting
  * criteria can be specified as part of Shared Targeting.
  */
trait SchemaTargetingCriteria extends StObject {
  
  /**
    * The list of values to exclude from targeting. Each value is AND&#39;d
    * together.
    */
  var exclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.undefined
  
  /**
    * The list of value to include as part of the targeting. Each value is
    * OR&#39;d together.
    */
  var inclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.undefined
  
  /**
    * The key representing the shared targeting criterion. Targeting criteria
    * defined by Google ad servers will begin with GOOG_. Third parties may
    * define their own keys. A list of permissible keys along with the
    * acceptable values will be provided as part of the external documentation.
    */
  var key: js.UndefOr[String] = js.undefined
}
object SchemaTargetingCriteria {
  
  @scala.inline
  def apply(): SchemaTargetingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingCriteria]
  }
  
  @scala.inline
  implicit class SchemaTargetingCriteriaMutableBuilder[Self <: SchemaTargetingCriteria] (val x: Self) extends AnyVal {
    
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

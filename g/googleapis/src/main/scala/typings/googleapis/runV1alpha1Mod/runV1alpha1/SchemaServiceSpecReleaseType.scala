package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpecReleaseType contains the options for slowly releasing revisions.
  * See ServiceSpec for more details.  Not currently supported by Cloud Run.
  */
trait SchemaServiceSpecReleaseType extends StObject {
  
  /**
    * The configuration for this service. All revisions from this service must
    * come from a single configuration.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.undefined
  
  /**
    * Revisions is an ordered list of 1 or 2 revisions. The first is the
    * current revision, and the second is the candidate revision. If a single
    * revision is provided, traffic will be pinned at that revision.
    * &quot;@latest&quot; is a shortcut for usage that refers to the latest
    * created revision by the configuration.
    */
  var revisions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * RolloutPercent is the percent of traffic that should be sent to the
    * candidate revision, i.e. the 2nd revision in the revisions list. Valid
    * values are between 0 and 99 inclusive.
    */
  var rolloutPercent: js.UndefOr[Double] = js.undefined
}
object SchemaServiceSpecReleaseType {
  
  inline def apply(): SchemaServiceSpecReleaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpecReleaseType]
  }
  
  extension [Self <: SchemaServiceSpecReleaseType](x: Self) {
    
    inline def setConfiguration(value: SchemaConfigurationSpec): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setRevisions(value: js.Array[String]): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: String*): Self = StObject.set(x, "revisions", js.Array(value :_*))
    
    inline def setRolloutPercent(value: Double): Self = StObject.set(x, "rolloutPercent", value.asInstanceOf[js.Any])
    
    inline def setRolloutPercentUndefined: Self = StObject.set(x, "rolloutPercent", js.undefined)
  }
}

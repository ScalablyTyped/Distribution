package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A note that indicates a type of analysis a provider would perform. This
  * note exists in a provider&#39;s project. A `Discovery` occurrence is
  * created in a consumer&#39;s project at the start of analysis.
  */
@js.native
trait SchemaDiscovery extends StObject {
  
  /**
    * Required. Immutable. The kind of analysis that is handled by this
    * discovery.
    */
  var analysisKind: js.UndefOr[String] = js.native
}
object SchemaDiscovery {
  
  @scala.inline
  def apply(): SchemaDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovery]
  }
  
  @scala.inline
  implicit class SchemaDiscoveryMutableBuilder[Self <: SchemaDiscovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisKind(value: String): Self = StObject.set(x, "analysisKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisKindUndefined: Self = StObject.set(x, "analysisKind", js.undefined)
  }
}

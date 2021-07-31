package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of occurrences created for a specific severity.
  */
trait SchemaSeverityCount extends StObject {
  
  /**
    * The number of occurrences with the severity.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * The severity of the occurrences.
    */
  var severity: js.UndefOr[String] = js.undefined
}
object SchemaSeverityCount {
  
  @scala.inline
  def apply(): SchemaSeverityCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeverityCount]
  }
  
  @scala.inline
  implicit class SchemaSeverityCountMutableBuilder[Self <: SchemaSeverityCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}

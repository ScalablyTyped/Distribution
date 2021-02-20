package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Header for the metrics.
  */
@js.native
trait SchemaMetricHeaderEntry extends StObject {
  
  /**
    * The name of the header.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of the metric, for example `INTEGER`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaMetricHeaderEntry {
  
  @scala.inline
  def apply(): SchemaMetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricHeaderEntry]
  }
  
  @scala.inline
  implicit class SchemaMetricHeaderEntryMutableBuilder[Self <: SchemaMetricHeaderEntry] (val x: Self) extends AnyVal {
    
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

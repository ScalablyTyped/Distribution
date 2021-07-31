package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedReport extends StObject {
  
  /**
    * Unique identifier of this saved report.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#savedReport.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * This saved report&#39;s name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaSavedReport {
  
  @scala.inline
  def apply(): SchemaSavedReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedReport]
  }
  
  @scala.inline
  implicit class SchemaSavedReportMutableBuilder[Self <: SchemaSavedReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

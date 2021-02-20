package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleapis.anon.ArcStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The external deal ids associated with a creative.
  */
@js.native
trait SchemaCreativeDealIds extends StObject {
  
  /**
    * A list of external deal ids and ARC approval status.
    */
  var dealStatuses: js.UndefOr[js.Array[ArcStatus]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCreativeDealIds {
  
  @scala.inline
  def apply(): SchemaCreativeDealIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDealIds]
  }
  
  @scala.inline
  implicit class SchemaCreativeDealIdsMutableBuilder[Self <: SchemaCreativeDealIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDealStatuses(value: js.Array[ArcStatus]): Self = StObject.set(x, "dealStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealStatusesUndefined: Self = StObject.set(x, "dealStatuses", js.undefined)
    
    @scala.inline
    def setDealStatusesVarargs(value: ArcStatus*): Self = StObject.set(x, "dealStatuses", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

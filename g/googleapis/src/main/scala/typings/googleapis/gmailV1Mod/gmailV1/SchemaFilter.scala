package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource definition for Gmail filters. Filters apply to specific messages
  * instead of an entire email thread.
  */
trait SchemaFilter extends StObject {
  
  /**
    * Action that the filter performs.
    */
  var action: js.UndefOr[SchemaFilterAction] = js.undefined
  
  /**
    * Matching criteria for the filter.
    */
  var criteria: js.UndefOr[SchemaFilterCriteria] = js.undefined
  
  /**
    * The server assigned ID of the filter.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaFilter {
  
  inline def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  extension [Self <: SchemaFilter](x: Self) {
    
    inline def setAction(value: SchemaFilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCriteria(value: SchemaFilterCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}

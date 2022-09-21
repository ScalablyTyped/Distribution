package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentity extends StObject {
  
  /**
    * The revision number of the update.
    */
  var revision: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The revision independent identifier of the update.
    */
  var updateId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentity {
  
  inline def apply(): SchemaIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentity]
  }
  
  extension [Self <: SchemaIdentity](x: Self) {
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setUpdateId(value: String): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    inline def setUpdateIdNull: Self = StObject.set(x, "updateId", null)
    
    inline def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
  }
}

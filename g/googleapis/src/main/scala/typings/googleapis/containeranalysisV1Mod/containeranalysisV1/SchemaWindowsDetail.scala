package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWindowsDetail extends StObject {
  
  /**
    * Required. The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
    */
  var cpeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of this vulnerability.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
    */
  var fixingKbs: js.UndefOr[js.Array[SchemaKnowledgeBase]] = js.undefined
  
  /**
    * Required. The name of this vulnerability.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaWindowsDetail {
  
  inline def apply(): SchemaWindowsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsDetail]
  }
  
  extension [Self <: SchemaWindowsDetail](x: Self) {
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriNull: Self = StObject.set(x, "cpeUri", null)
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFixingKbs(value: js.Array[SchemaKnowledgeBase]): Self = StObject.set(x, "fixingKbs", value.asInstanceOf[js.Any])
    
    inline def setFixingKbsUndefined: Self = StObject.set(x, "fixingKbs", js.undefined)
    
    inline def setFixingKbsVarargs(value: SchemaKnowledgeBase*): Self = StObject.set(x, "fixingKbs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsDetail extends StObject {
  
  /** Required. The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects. */
  var cpeUri: js.UndefOr[String] = js.undefined
  
  /** The description of this vulnerability. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given
    * vulnerability. Currently any listed KBs presence is considered a fix.
    */
  var fixingKbs: js.UndefOr[js.Array[KnowledgeBase]] = js.undefined
  
  /** Required. The name of this vulnerability. */
  var name: js.UndefOr[String] = js.undefined
}
object WindowsDetail {
  
  inline def apply(): WindowsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsDetail] (val x: Self) extends AnyVal {
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFixingKbs(value: js.Array[KnowledgeBase]): Self = StObject.set(x, "fixingKbs", value.asInstanceOf[js.Any])
    
    inline def setFixingKbsUndefined: Self = StObject.set(x, "fixingKbs", js.undefined)
    
    inline def setFixingKbsVarargs(value: KnowledgeBase*): Self = StObject.set(x, "fixingKbs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

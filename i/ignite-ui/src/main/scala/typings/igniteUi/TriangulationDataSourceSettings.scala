package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriangulationDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Callback function to call when data binding is complete
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Object on which to invoke the callback function
    */
  var callee: js.UndefOr[Any] = js.undefined
  
  /**
    * The unique identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A Uri specifying the location of the Itf file.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The TriangulationSource which is typically created after importing the Itf from the Source Uri.
    */
  var triangulationSource: js.UndefOr[String] = js.undefined
}
object TriangulationDataSourceSettings {
  
  inline def apply(): TriangulationDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangulationDataSourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriangulationDataSourceSettings] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCallee(value: Any): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTriangulationSource(value: String): Self = StObject.set(x, "triangulationSource", value.asInstanceOf[js.Any])
    
    inline def setTriangulationSourceUndefined: Self = StObject.set(x, "triangulationSource", js.undefined)
  }
}

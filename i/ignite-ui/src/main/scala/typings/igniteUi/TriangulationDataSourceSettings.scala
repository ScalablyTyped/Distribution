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
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Callback function to call when data binding is complete
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Object on which to invoke the callback function
    */
  var callee: js.UndefOr[js.Any] = js.undefined
  
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
  
  @scala.inline
  def apply(): TriangulationDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangulationDataSourceSettings]
  }
  
  @scala.inline
  implicit class TriangulationDataSourceSettingsMutableBuilder[Self <: TriangulationDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCallee(value: js.Any): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTriangulationSource(value: String): Self = StObject.set(x, "triangulationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangulationSourceUndefined: Self = StObject.set(x, "triangulationSource", js.undefined)
  }
}

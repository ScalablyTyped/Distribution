package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriangulationDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Callback function to call when data binding is complete
    */
  var callback: js.UndefOr[js.Function] = js.native
  
  /**
    * Object on which to invoke the callback function
    */
  var callee: js.UndefOr[js.Any] = js.native
  
  /**
    * The unique identifier.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A Uri specifying the location of the Itf file.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * The TriangulationSource which is typically created after importing the Itf from the Source Uri.
    */
  var triangulationSource: js.UndefOr[String] = js.native
}
object TriangulationDataSourceSettings {
  
  @scala.inline
  def apply(): TriangulationDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangulationDataSourceSettings]
  }
  
  @scala.inline
  implicit class TriangulationDataSourceSettingsOps[Self <: TriangulationDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCallee(value: js.Any): Self = this.set("callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallee: Self = this.set("callee", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTriangulationSource(value: String): Self = this.set("triangulationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangulationSource: Self = this.set("triangulationSource", js.undefined)
  }
}

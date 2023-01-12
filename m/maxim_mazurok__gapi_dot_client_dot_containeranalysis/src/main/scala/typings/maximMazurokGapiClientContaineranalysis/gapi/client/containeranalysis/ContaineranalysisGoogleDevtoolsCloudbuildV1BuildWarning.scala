package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning extends StObject {
  
  /** The priority for this warning. */
  var priority: js.UndefOr[String] = js.undefined
  
  /** Explanation of the warning generated. */
  var text: js.UndefOr[String] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1BuildWarning] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

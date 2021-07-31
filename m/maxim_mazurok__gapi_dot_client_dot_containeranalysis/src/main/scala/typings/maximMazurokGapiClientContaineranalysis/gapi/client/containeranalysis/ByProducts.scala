package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByProducts extends StObject {
  
  var customValues: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.ByProducts & TopLevel[js.Any]
  ] = js.undefined
}
object ByProducts {
  
  @scala.inline
  def apply(): ByProducts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByProducts]
  }
  
  @scala.inline
  implicit class ByProductsMutableBuilder[Self <: ByProducts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomValues(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.ByProducts & TopLevel[js.Any]
    ): Self = StObject.set(x, "customValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomValuesUndefined: Self = StObject.set(x, "customValues", js.undefined)
  }
}

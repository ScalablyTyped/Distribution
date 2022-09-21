package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DisplayVideo360AdvertiserLinkProposal to get. Example format: properties/1234/displayVideo360AdvertiserLinkProposals/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet {
  
  inline def apply(): ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet]
  }
  
  extension [Self <: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMediaDownload
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the attachment to be downloaded.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceMediaDownload {
  
  inline def apply(): ParamsResourceMediaDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMediaDownload]
  }
  
  extension [Self <: ParamsResourceMediaDownload](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

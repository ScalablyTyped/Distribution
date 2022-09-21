package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMessageProps extends StObject {
  
  var babelProps: js.UndefOr[AppsDynamiteBabelMessageProps] = js.undefined
}
object AppsDynamiteMessageProps {
  
  inline def apply(): AppsDynamiteMessageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMessageProps]
  }
  
  extension [Self <: AppsDynamiteMessageProps](x: Self) {
    
    inline def setBabelProps(value: AppsDynamiteBabelMessageProps): Self = StObject.set(x, "babelProps", value.asInstanceOf[js.Any])
    
    inline def setBabelPropsUndefined: Self = StObject.set(x, "babelProps", js.undefined)
  }
}

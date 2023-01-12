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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteMessageProps] (val x: Self) extends AnyVal {
    
    inline def setBabelProps(value: AppsDynamiteBabelMessageProps): Self = StObject.set(x, "babelProps", value.asInstanceOf[js.Any])
    
    inline def setBabelPropsUndefined: Self = StObject.set(x, "babelProps", js.undefined)
  }
}

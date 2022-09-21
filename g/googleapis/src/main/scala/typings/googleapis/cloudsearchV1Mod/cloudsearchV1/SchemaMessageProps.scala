package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageProps extends StObject {
  
  var babelProps: js.UndefOr[SchemaBabelMessageProps] = js.undefined
}
object SchemaMessageProps {
  
  inline def apply(): SchemaMessageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageProps]
  }
  
  extension [Self <: SchemaMessageProps](x: Self) {
    
    inline def setBabelProps(value: SchemaBabelMessageProps): Self = StObject.set(x, "babelProps", value.asInstanceOf[js.Any])
    
    inline def setBabelPropsUndefined: Self = StObject.set(x, "babelProps", js.undefined)
  }
}

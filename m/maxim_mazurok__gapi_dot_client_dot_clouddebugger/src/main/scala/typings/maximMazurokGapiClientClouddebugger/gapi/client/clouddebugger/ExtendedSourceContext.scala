package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedSourceContext extends StObject {
  
  /** Any source context. */
  var context: js.UndefOr[SourceContext] = js.undefined
  
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.ExtendedSourceContext & TopLevel[Any]
  ] = js.undefined
}
object ExtendedSourceContext {
  
  inline def apply(): ExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedSourceContext]
  }
  
  extension [Self <: ExtendedSourceContext](x: Self) {
    
    inline def setContext(value: SourceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.ExtendedSourceContext & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}

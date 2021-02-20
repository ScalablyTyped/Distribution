package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedSourceContext extends StObject {
  
  /** Any source context. */
  var context: js.UndefOr[SourceContext] = js.native
  
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.ExtendedSourceContext with TopLevel[js.Any]
  ] = js.native
}
object ExtendedSourceContext {
  
  @scala.inline
  def apply(): ExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedSourceContext]
  }
  
  @scala.inline
  implicit class ExtendedSourceContextMutableBuilder[Self <: ExtendedSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: SourceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.ExtendedSourceContext with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}

package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `SourceContext` represents information about the source of a protobuf
  * element, like the file in which it is defined.
  */
trait SchemaSourceContext extends StObject {
  
  /**
    * The path-qualified name of the .proto file that contained the associated
    * protobuf element.  For example:
    * `&quot;google/protobuf/source_context.proto&quot;`.
    */
  var fileName: js.UndefOr[String] = js.undefined
}
object SchemaSourceContext {
  
  inline def apply(): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceContext]
  }
  
  extension [Self <: SchemaSourceContext](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}

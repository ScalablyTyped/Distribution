package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `SourceContext` represents information about the source of a protobuf
  * element, like the file in which it is defined.
  */
@js.native
trait SchemaSourceContext extends StObject {
  
  /**
    * The path-qualified name of the .proto file that contained the associated
    * protobuf element.  For example:
    * `&quot;google/protobuf/source_context.proto&quot;`.
    */
  var fileName: js.UndefOr[String] = js.native
}
object SchemaSourceContext {
  
  @scala.inline
  def apply(): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceContext]
  }
  
  @scala.inline
  implicit class SchemaSourceContextMutableBuilder[Self <: SchemaSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}

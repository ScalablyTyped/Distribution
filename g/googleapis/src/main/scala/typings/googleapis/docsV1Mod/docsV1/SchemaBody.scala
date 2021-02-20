package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document body.  The body typically contains the full document contents
  * except for headers, footers and footnotes.
  */
@js.native
trait SchemaBody extends StObject {
  
  /**
    * The contents of the body.  The indexes for the body&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
}
object SchemaBody {
  
  @scala.inline
  def apply(): SchemaBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBody]
  }
  
  @scala.inline
  implicit class SchemaBodyMutableBuilder[Self <: SchemaBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value :_*))
  }
}

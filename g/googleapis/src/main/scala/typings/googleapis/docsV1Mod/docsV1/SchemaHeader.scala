package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document header.
  */
trait SchemaHeader extends StObject {
  
  /**
    * The contents of the header.  The indexes for a header&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.undefined
  
  /**
    * The ID of the header.
    */
  var headerId: js.UndefOr[String] = js.undefined
}
object SchemaHeader {
  
  @scala.inline
  def apply(): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeader]
  }
  
  @scala.inline
  implicit class SchemaHeaderMutableBuilder[Self <: SchemaHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}

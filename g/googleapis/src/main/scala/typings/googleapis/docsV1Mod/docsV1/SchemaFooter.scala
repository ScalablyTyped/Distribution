package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document footer.
  */
@js.native
trait SchemaFooter extends StObject {
  
  /**
    * The contents of the footer.  The indexes for a footer&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  
  /**
    * The ID of the footer.
    */
  var footerId: js.UndefOr[String] = js.native
}
object SchemaFooter {
  
  @scala.inline
  def apply(): SchemaFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFooter]
  }
  
  @scala.inline
  implicit class SchemaFooterMutableBuilder[Self <: SchemaFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
  }
}

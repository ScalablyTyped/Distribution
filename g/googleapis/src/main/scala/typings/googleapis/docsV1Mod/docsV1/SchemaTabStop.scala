package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tab stop within a paragraph.
  */
@js.native
trait SchemaTabStop extends StObject {
  
  /**
    * The alignment of this tab stop. If unset, the value defaults to START.
    */
  var alignment: js.UndefOr[String] = js.native
  
  /**
    * The offset between this tab stop and the start margin.
    */
  var offset: js.UndefOr[SchemaDimension] = js.native
}
object SchemaTabStop {
  
  @scala.inline
  def apply(): SchemaTabStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTabStop]
  }
  
  @scala.inline
  implicit class SchemaTabStopMutableBuilder[Self <: SchemaTabStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setOffset(value: SchemaDimension): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}

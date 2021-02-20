package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Position settings for text.
  */
@js.native
trait SchemaTextPosition extends StObject {
  
  /**
    * Horizontal alignment setting for the piece of text.
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
}
object SchemaTextPosition {
  
  @scala.inline
  def apply(): SchemaTextPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextPosition]
  }
  
  @scala.inline
  implicit class SchemaTextPositionMutableBuilder[Self <: SchemaTextPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}

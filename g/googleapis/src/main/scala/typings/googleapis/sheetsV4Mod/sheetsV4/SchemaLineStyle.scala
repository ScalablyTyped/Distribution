package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties that describe the style of a line.
  */
@js.native
trait SchemaLineStyle extends StObject {
  
  /**
    * The dash type of the line.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The thickness of the line, in px.
    */
  var width: js.UndefOr[Double] = js.native
}
object SchemaLineStyle {
  
  @scala.inline
  def apply(): SchemaLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineStyle]
  }
  
  @scala.inline
  implicit class SchemaLineStyleMutableBuilder[Self <: SchemaLineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

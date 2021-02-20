package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The shading of a paragraph.
  */
@js.native
trait SchemaShading extends StObject {
  
  /**
    * The background color of this paragraph shading.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.native
}
object SchemaShading {
  
  @scala.inline
  def apply(): SchemaShading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShading]
  }
  
  @scala.inline
  implicit class SchemaShadingMutableBuilder[Self <: SchemaShading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: SchemaOptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}

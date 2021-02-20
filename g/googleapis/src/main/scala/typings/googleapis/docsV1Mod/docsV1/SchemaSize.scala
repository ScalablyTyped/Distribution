package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A width and height.
  */
@js.native
trait SchemaSize extends StObject {
  
  /**
    * The height of the object.
    */
  var height: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The width of the object.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}
object SchemaSize {
  
  @scala.inline
  def apply(): SchemaSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSize]
  }
  
  @scala.inline
  implicit class SchemaSizeMutableBuilder[Self <: SchemaSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: SchemaDimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A color that can either be fully opaque or fully transparent.
  */
@js.native
trait SchemaOptionalColor extends StObject {
  
  /**
    * If set, this will be used as an opaque color. If unset, this represents a
    * transparent color.
    */
  var opaqueColor: js.UndefOr[SchemaOpaqueColor] = js.native
}
object SchemaOptionalColor {
  
  @scala.inline
  def apply(): SchemaOptionalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptionalColor]
  }
  
  @scala.inline
  implicit class SchemaOptionalColorMutableBuilder[Self <: SchemaOptionalColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpaqueColor(value: SchemaOpaqueColor): Self = StObject.set(x, "opaqueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaqueColorUndefined: Self = StObject.set(x, "opaqueColor", js.undefined)
  }
}

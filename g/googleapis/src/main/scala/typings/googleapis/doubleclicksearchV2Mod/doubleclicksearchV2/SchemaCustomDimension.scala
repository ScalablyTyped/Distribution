package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message containing the custome dimension.
  */
@js.native
trait SchemaCustomDimension extends StObject {
  
  /**
    * Custom dimension name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Custom dimension value.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaCustomDimension {
  
  @scala.inline
  def apply(): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDimension]
  }
  
  @scala.inline
  implicit class SchemaCustomDimensionMutableBuilder[Self <: SchemaCustomDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

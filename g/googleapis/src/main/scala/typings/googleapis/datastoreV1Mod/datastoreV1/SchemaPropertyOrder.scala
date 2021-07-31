package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired order for a specific property.
  */
trait SchemaPropertyOrder extends StObject {
  
  /**
    * The direction to order by. Defaults to `ASCENDING`.
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * The property to order by.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.undefined
}
object SchemaPropertyOrder {
  
  @scala.inline
  def apply(): SchemaPropertyOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyOrder]
  }
  
  @scala.inline
  implicit class SchemaPropertyOrderMutableBuilder[Self <: SchemaPropertyOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaPropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}

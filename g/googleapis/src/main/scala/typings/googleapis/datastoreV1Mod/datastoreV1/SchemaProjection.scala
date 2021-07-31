package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a property in a projection.
  */
trait SchemaProjection extends StObject {
  
  /**
    * The property to project.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.undefined
}
object SchemaProjection {
  
  @scala.inline
  def apply(): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjection]
  }
  
  @scala.inline
  implicit class SchemaProjectionMutableBuilder[Self <: SchemaProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperty(value: SchemaPropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}

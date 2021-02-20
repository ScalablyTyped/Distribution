package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a property relative to the kind expressions.
  */
@js.native
trait SchemaPropertyReference extends StObject {
  
  /**
    * The name of the property. If name includes &quot;.&quot;s, it may be
    * interpreted as a property name path.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaPropertyReference {
  
  @scala.inline
  def apply(): SchemaPropertyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyReference]
  }
  
  @scala.inline
  implicit class SchemaPropertyReferenceMutableBuilder[Self <: SchemaPropertyReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

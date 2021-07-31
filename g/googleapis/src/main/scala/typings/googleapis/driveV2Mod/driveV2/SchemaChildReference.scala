package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a folder&#39;s child.
  */
trait SchemaChildReference extends StObject {
  
  /**
    * A link to the child.
    */
  var childLink: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the child.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#childReference.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaChildReference {
  
  @scala.inline
  def apply(): SchemaChildReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChildReference]
  }
  
  @scala.inline
  implicit class SchemaChildReferenceMutableBuilder[Self <: SchemaChildReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildLink(value: String): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}

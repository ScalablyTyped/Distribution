package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a file&#39;s parent.
  */
@js.native
trait SchemaParentReference extends StObject {
  
  /**
    * The ID of the parent.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the parent is the root folder.
    */
  var isRoot: js.UndefOr[Boolean] = js.native
  
  /**
    * This is always drive#parentReference.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A link to the parent.
    */
  var parentLink: js.UndefOr[String] = js.native
  
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaParentReference {
  
  @scala.inline
  def apply(): SchemaParentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParentReference]
  }
  
  @scala.inline
  implicit class SchemaParentReferenceMutableBuilder[Self <: SchemaParentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setParentLink(value: String): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}

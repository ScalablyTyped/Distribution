package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleapis.anon.Generation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compose request.
  */
@js.native
trait SchemaComposeRequest extends StObject {
  
  /**
    * Properties of the resulting object
    */
  var destination: js.UndefOr[SchemaObject] = js.native
  
  /**
    * The kind of item this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The list of source objects that will be concatenated into a single
    * object.
    */
  var sourceObjects: js.UndefOr[js.Array[Generation]] = js.native
}
object SchemaComposeRequest {
  
  @scala.inline
  def apply(): SchemaComposeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComposeRequest]
  }
  
  @scala.inline
  implicit class SchemaComposeRequestMutableBuilder[Self <: SchemaComposeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: SchemaObject): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSourceObjects(value: js.Array[Generation]): Self = StObject.set(x, "sourceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceObjectsUndefined: Self = StObject.set(x, "sourceObjects", js.undefined)
    
    @scala.inline
    def setSourceObjectsVarargs(value: Generation*): Self = StObject.set(x, "sourceObjects", js.Array(value :_*))
  }
}

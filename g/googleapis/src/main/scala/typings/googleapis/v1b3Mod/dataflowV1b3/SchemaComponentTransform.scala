package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of a transform executed as part of an execution stage.
  */
@js.native
trait SchemaComponentTransform extends StObject {
  
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User name for the original user transform with which this transform is
    * most closely associated.
    */
  var originalTransform: js.UndefOr[String] = js.native
  
  /**
    * Human-readable name for this transform; may be user or system generated.
    */
  var userName: js.UndefOr[String] = js.native
}
object SchemaComponentTransform {
  
  @scala.inline
  def apply(): SchemaComponentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComponentTransform]
  }
  
  @scala.inline
  implicit class SchemaComponentTransformMutableBuilder[Self <: SchemaComponentTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalTransform(value: String): Self = StObject.set(x, "originalTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTransformUndefined: Self = StObject.set(x, "originalTransform", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}

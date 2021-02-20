package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of an interstitial value between transforms in an execution
  * stage.
  */
@js.native
trait SchemaComponentSource extends StObject {
  
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User name for the original user transform or collection with which this
    * source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[String] = js.native
  
  /**
    * Human-readable name for this transform; may be user or system generated.
    */
  var userName: js.UndefOr[String] = js.native
}
object SchemaComponentSource {
  
  @scala.inline
  def apply(): SchemaComponentSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComponentSource]
  }
  
  @scala.inline
  implicit class SchemaComponentSourceMutableBuilder[Self <: SchemaComponentSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalTransformOrCollection(value: String): Self = StObject.set(x, "originalTransformOrCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTransformOrCollectionUndefined: Self = StObject.set(x, "originalTransformOrCollection", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}

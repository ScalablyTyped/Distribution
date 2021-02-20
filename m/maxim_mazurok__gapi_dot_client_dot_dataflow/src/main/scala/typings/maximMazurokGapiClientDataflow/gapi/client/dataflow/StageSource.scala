package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageSource extends StObject {
  
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[String] = js.native
  
  /** User name for the original user transform or collection with which this source is most closely associated. */
  var originalTransformOrCollection: js.UndefOr[String] = js.native
  
  /** Size of the source, if measurable. */
  var sizeBytes: js.UndefOr[String] = js.native
  
  /** Human-readable name for this source; may be user or system generated. */
  var userName: js.UndefOr[String] = js.native
}
object StageSource {
  
  @scala.inline
  def apply(): StageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageSource]
  }
  
  @scala.inline
  implicit class StageSourceMutableBuilder[Self <: StageSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalTransformOrCollection(value: String): Self = StObject.set(x, "originalTransformOrCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTransformOrCollectionUndefined: Self = StObject.set(x, "originalTransformOrCollection", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}

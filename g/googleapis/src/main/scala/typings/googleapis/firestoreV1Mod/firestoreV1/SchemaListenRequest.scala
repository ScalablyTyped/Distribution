package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for Firestore.Listen
  */
@js.native
trait SchemaListenRequest extends StObject {
  
  /**
    * A target to add to this stream.
    */
  var addTarget: js.UndefOr[SchemaTarget] = js.native
  
  /**
    * Labels associated with this target change.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The ID of a target to remove from this stream.
    */
  var removeTarget: js.UndefOr[Double] = js.native
}
object SchemaListenRequest {
  
  @scala.inline
  def apply(): SchemaListenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListenRequest]
  }
  
  @scala.inline
  implicit class SchemaListenRequestMutableBuilder[Self <: SchemaListenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTarget(value: SchemaTarget): Self = StObject.set(x, "addTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTargetUndefined: Self = StObject.set(x, "addTarget", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setRemoveTarget(value: Double): Self = StObject.set(x, "removeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTargetUndefined: Self = StObject.set(x, "removeTarget", js.undefined)
  }
}

package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for Firestore.Listen
  */
@js.native
trait SchemaListenRequest extends js.Object {
  
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
  implicit class SchemaListenRequestOps[Self <: SchemaListenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddTarget(value: SchemaTarget): Self = this.set("addTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddTarget: Self = this.set("addTarget", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setRemoveTarget(value: Double): Self = this.set("removeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTarget: Self = this.set("removeTarget", js.undefined)
  }
}

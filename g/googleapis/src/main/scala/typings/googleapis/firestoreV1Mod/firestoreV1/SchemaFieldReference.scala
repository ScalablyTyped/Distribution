package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a field, such as `max(messages.time) as max_time`.
  */
@js.native
trait SchemaFieldReference extends js.Object {
  
  var fieldPath: js.UndefOr[String] = js.native
}
object SchemaFieldReference {
  
  @scala.inline
  def apply(): SchemaFieldReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldReference]
  }
  
  @scala.inline
  implicit class SchemaFieldReferenceOps[Self <: SchemaFieldReference] (val x: Self) extends AnyVal {
    
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
    def setFieldPath(value: String): Self = this.set("fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldPath: Self = this.set("fieldPath", js.undefined)
  }
}

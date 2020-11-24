package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Property` consists of a user-supplied name/value pair.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1Property extends js.Object {
  
  /**
    * Name of the property.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Value of numeric properties.
    */
  var uint64Value: js.UndefOr[String] = js.native
  
  /**
    * Value of the property.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1Property {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Property]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1PropertyOps[Self <: SchemaGoogleCloudVisionV1p1beta1Property] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUint64Value(value: String): Self = this.set("uint64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUint64Value: Self = this.set("uint64Value", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

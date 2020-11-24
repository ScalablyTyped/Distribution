package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new shape.
  */
@js.native
trait SchemaCreateShapeRequest extends js.Object {
  
  /**
    * The element properties for the shape.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50. If empty, a unique identifier
    * will be generated.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The shape type.
    */
  var shapeType: js.UndefOr[String] = js.native
}
object SchemaCreateShapeRequest {
  
  @scala.inline
  def apply(): SchemaCreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShapeRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateShapeRequestOps[Self <: SchemaCreateShapeRequest] (val x: Self) extends AnyVal {
    
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
    def setElementProperties(value: SchemaPageElementProperties): Self = this.set("elementProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementProperties: Self = this.set("elementProperties", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setShapeType(value: String): Self = this.set("shapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeType: Self = this.set("shapeType", js.undefined)
  }
}

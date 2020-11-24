package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a property relative to the kind expressions.
  */
@js.native
trait SchemaPropertyReference extends js.Object {
  
  /**
    * The name of the property. If name includes &quot;.&quot;s, it may be
    * interpreted as a property name path.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaPropertyReference {
  
  @scala.inline
  def apply(): SchemaPropertyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyReference]
  }
  
  @scala.inline
  implicit class SchemaPropertyReferenceOps[Self <: SchemaPropertyReference] (val x: Self) extends AnyVal {
    
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
  }
}

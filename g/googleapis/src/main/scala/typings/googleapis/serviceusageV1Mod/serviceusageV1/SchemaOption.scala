package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A protocol buffer option, which can be attached to a message, field,
  * enumeration, etc.
  */
@js.native
trait SchemaOption extends js.Object {
  
  /**
    * The option&#39;s name. For protobuf built-in options (options defined in
    * descriptor.proto), this is the short name. For example,
    * `&quot;map_entry&quot;`. For custom options, it should be the
    * fully-qualified name. For example, `&quot;google.api.http&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The option&#39;s value packed in an Any message. If the value is a
    * primitive, the corresponding wrapper type defined in
    * google/protobuf/wrappers.proto should be used. If the value is an enum,
    * it should be stored as an int32 value using the
    * google.protobuf.Int32Value type.
    */
  var value: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaOption {
  
  @scala.inline
  def apply(): SchemaOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOption]
  }
  
  @scala.inline
  implicit class SchemaOptionOps[Self <: SchemaOption] (val x: Self) extends AnyVal {
    
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
    def setValue(value: StringDictionary[js.Any]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

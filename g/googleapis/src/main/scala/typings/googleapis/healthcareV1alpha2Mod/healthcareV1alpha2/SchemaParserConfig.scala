package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration for the parser. It determines how the server parses the
  * messages.
  */
@js.native
trait SchemaParserConfig extends js.Object {
  
  /**
    * Determines whether messages with no header are allowed.
    */
  var allowNullHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Byte(s) to be used as the segment terminator. If this is unset,
    * &#39;\r&#39; will be used as segment terminator.
    */
  var segmentTerminator: js.UndefOr[String] = js.native
}
object SchemaParserConfig {
  
  @scala.inline
  def apply(): SchemaParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParserConfig]
  }
  
  @scala.inline
  implicit class SchemaParserConfigOps[Self <: SchemaParserConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowNullHeader(value: Boolean): Self = this.set("allowNullHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNullHeader: Self = this.set("allowNullHeader", js.undefined)
    
    @scala.inline
    def setSegmentTerminator(value: String): Self = this.set("segmentTerminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentTerminator: Self = this.set("segmentTerminator", js.undefined)
  }
}

package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadOptions extends js.Object {
  
  /** string to be used as a file path in error/warning messages. */
  var filename: js.UndefOr[String] = js.native
  
  /** compatibility with JSON.parse behaviour. */
  var json: js.UndefOr[Boolean] = js.native
  
  /** listener for parse events */
  var listener: js.UndefOr[
    js.ThisFunction2[/* this */ State, /* eventType */ EventType, /* state */ State, Unit]
  ] = js.native
  
  /** function to call on warning messages. */
  var onWarning: js.UndefOr[js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit]] = js.native
  
  /** specifies a schema to use. */
  var schema: js.UndefOr[SchemaDefinition] = js.native
}
object LoadOptions {
  
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setListener(value: js.ThisFunction2[/* this */ State, /* eventType */ EventType, /* state */ State, Unit]): Self = this.set("listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListener: Self = this.set("listener", js.undefined)
    
    @scala.inline
    def setOnWarning(value: js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit]): Self = this.set("onWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWarning: Self = this.set("onWarning", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaDefinition): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}

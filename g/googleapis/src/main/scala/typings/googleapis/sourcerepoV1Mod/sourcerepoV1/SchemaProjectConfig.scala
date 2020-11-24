package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Source Repositories configuration of a project.
  */
@js.native
trait SchemaProjectConfig extends js.Object {
  
  /**
    * Reject a Git push that contains a private key.
    */
  var enablePrivateKeyCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the project. Values are of the form
    * `projects/&lt;project&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * How this project publishes a change in the repositories through Cloud
    * Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[SchemaPubsubConfig]] = js.native
}
object SchemaProjectConfig {
  
  @scala.inline
  def apply(): SchemaProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectConfig]
  }
  
  @scala.inline
  implicit class SchemaProjectConfigOps[Self <: SchemaProjectConfig] (val x: Self) extends AnyVal {
    
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
    def setEnablePrivateKeyCheck(value: Boolean): Self = this.set("enablePrivateKeyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePrivateKeyCheck: Self = this.set("enablePrivateKeyCheck", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPubsubConfigs(value: StringDictionary[SchemaPubsubConfig]): Self = this.set("pubsubConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubConfigs: Self = this.set("pubsubConfigs", js.undefined)
  }
}

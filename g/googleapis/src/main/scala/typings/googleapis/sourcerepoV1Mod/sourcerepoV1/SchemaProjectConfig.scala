package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Source Repositories configuration of a project.
  */
@js.native
trait SchemaProjectConfig extends StObject {
  
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
  implicit class SchemaProjectConfigMutableBuilder[Self <: SchemaProjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablePrivateKeyCheck(value: Boolean): Self = StObject.set(x, "enablePrivateKeyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePrivateKeyCheckUndefined: Self = StObject.set(x, "enablePrivateKeyCheck", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPubsubConfigs(value: StringDictionary[SchemaPubsubConfig]): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
  }
}

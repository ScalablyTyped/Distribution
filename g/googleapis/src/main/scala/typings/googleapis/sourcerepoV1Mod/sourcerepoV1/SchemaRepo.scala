package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A repository (or repo) is a Git repository storing versioned source
  * content.
  */
@js.native
trait SchemaRepo extends StObject {
  
  /**
    * How this repository mirrors a repository managed by another service.
    * Read-only field.
    */
  var mirrorConfig: js.UndefOr[SchemaMirrorConfig] = js.native
  
  /**
    * Resource name of the repository, of the form
    * `projects/&lt;project&gt;/repos/&lt;repo&gt;`.  The repo name may contain
    * slashes. eg, `projects/myproject/repos/name/with/slash`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * How this repository publishes a change in the repository through Cloud
    * Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[SchemaPubsubConfig]] = js.native
  
  /**
    * The disk usage of the repo, in bytes. Read-only field. Size is only
    * returned by GetRepo.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * URL to clone the repository from Google Cloud Source Repositories.
    * Read-only field.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaRepo {
  
  @scala.inline
  def apply(): SchemaRepo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepo]
  }
  
  @scala.inline
  implicit class SchemaRepoMutableBuilder[Self <: SchemaRepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMirrorConfig(value: SchemaMirrorConfig): Self = StObject.set(x, "mirrorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorConfigUndefined: Self = StObject.set(x, "mirrorConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPubsubConfigs(value: StringDictionary[SchemaPubsubConfig]): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

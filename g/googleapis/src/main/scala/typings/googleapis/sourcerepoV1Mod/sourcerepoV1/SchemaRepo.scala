package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A repository (or repo) is a Git repository storing versioned source
  * content.
  */
@js.native
trait SchemaRepo extends js.Object {
  
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
  implicit class SchemaRepoOps[Self <: SchemaRepo] (val x: Self) extends AnyVal {
    
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
    def setMirrorConfig(value: SchemaMirrorConfig): Self = this.set("mirrorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirrorConfig: Self = this.set("mirrorConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPubsubConfigs(value: StringDictionary[SchemaPubsubConfig]): Self = this.set("pubsubConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubConfigs: Self = this.set("pubsubConfigs", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

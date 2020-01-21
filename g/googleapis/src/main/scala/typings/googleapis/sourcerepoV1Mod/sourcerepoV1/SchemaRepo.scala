package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    mirrorConfig: SchemaMirrorConfig = null,
    name: String = null,
    pubsubConfigs: StringDictionary[SchemaPubsubConfig] = null,
    size: String = null,
    url: String = null
  ): SchemaRepo = {
    val __obj = js.Dynamic.literal()
    if (mirrorConfig != null) __obj.updateDynamic("mirrorConfig")(mirrorConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pubsubConfigs != null) __obj.updateDynamic("pubsubConfigs")(pubsubConfigs.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRepo]
  }
}


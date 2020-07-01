package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputFile` is similar to a FileNode, but it is tailored for output as
  * part of an `ActionResult`. It allows a full file path rather than only a
  * name, and allows the server to include content inline.  `OutputFile` is
  * binary-compatible with `FileNode`.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile extends js.Object {
  /**
    * The raw content of the file.  This field may be used by the server to
    * provide the content of a file inline in an ActionResult and avoid
    * requiring that the client make a separate call to
    * [ContentAddressableStorage.GetBlob] to retrieve it.  The client SHOULD
    * NOT assume that it will get raw content with any request, and always be
    * prepared to retrieve it via `digest`.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The full path of the file relative to the input root, including the
    * filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile {
  @scala.inline
  def apply(
    content: String = null,
    digest: SchemaGoogleDevtoolsRemoteexecutionV1testDigest = null,
    isExecutable: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(isExecutable)) __obj.updateDynamic("isExecutable")(isExecutable.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile]
  }
}


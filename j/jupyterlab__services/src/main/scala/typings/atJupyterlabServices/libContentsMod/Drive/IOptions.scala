package typings.atJupyterlabServices.libContentsMod.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `Drive`.
  */
trait IOptions extends js.Object {
  /**
    * A REST endpoint for drive requests.
    * If not given, defaults to the Jupyter
    * REST API given by [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/contents).
    */
  var apiEndpoint: js.UndefOr[String] = js.undefined
  /**
    * The name for the `Drive`, which is used in file
    * paths to disambiguate it from other drives.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The server settings for the server.
    */
  var serverSettings: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    name: String = null,
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    __obj.asInstanceOf[IOptions]
  }
}


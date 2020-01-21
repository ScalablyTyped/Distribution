package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that resolves relative URLs.
  */
trait IResolver extends js.Object {
  /**
    * Whether the URL should be handled by the resolver
    * or not.
    *
    * #### Notes
    * This is similar to the `isLocal` check in `URLExt`,
    * but can also perform additional checks on whether the
    * resolver should handle a given URL.
    */
  var isLocal: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.undefined
  /**
    * Get the download url for a given absolute url path.
    *
    * #### Notes
    * This URL may include a query parameter.
    */
  def getDownloadUrl(url: String): js.Promise[String]
  /**
    * Resolve a relative url to an absolute url path.
    */
  def resolveUrl(url: String): js.Promise[String]
}

object IResolver {
  @scala.inline
  def apply(
    getDownloadUrl: String => js.Promise[String],
    resolveUrl: String => js.Promise[String],
    isLocal: /* url */ String => Boolean = null
  ): IResolver = {
    val __obj = js.Dynamic.literal(getDownloadUrl = js.Any.fromFunction1(getDownloadUrl), resolveUrl = js.Any.fromFunction1(resolveUrl))
    if (isLocal != null) __obj.updateDynamic("isLocal")(js.Any.fromFunction1(isLocal))
    __obj.asInstanceOf[IResolver]
  }
}


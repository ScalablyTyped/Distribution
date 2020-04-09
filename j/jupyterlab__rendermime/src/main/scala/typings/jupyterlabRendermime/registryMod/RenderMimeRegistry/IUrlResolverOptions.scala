package typings.jupyterlabRendermime.registryMod.RenderMimeRegistry

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabServices.contentsMod.Contents.IManager
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a UrlResolver.
  */
trait IUrlResolverOptions extends js.Object {
  /**
    * The contents manager used by the resolver.
    */
  var contents: IManager
  /**
    * The path providing context for local urls.
    *
    * #### Notes
    * Either session or path must be given, and path takes precedence.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The session used by the resolver.
    *
    * @deprecated use the `path` option instead and update it as needed.
    *
    * #### Notes
    * For convenience, this can be a session context as well. Either session
    * or path must be given, and path takes precedence.
    *
    * TODO: remove this option and make `path` required.
    */
  var session: js.UndefOr[ISessionContext | ISessionConnection] = js.undefined
}

object IUrlResolverOptions {
  @scala.inline
  def apply(contents: IManager, path: String = null, session: ISessionContext | ISessionConnection = null): IUrlResolverOptions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrlResolverOptions]
  }
}


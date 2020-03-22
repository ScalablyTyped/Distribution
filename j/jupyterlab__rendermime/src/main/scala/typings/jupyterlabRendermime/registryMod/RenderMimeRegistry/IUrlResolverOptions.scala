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
    * The session used by the resolver.
    *
    * #### Notes
    * For convenience, this can be a session context as well.
    */
  var session: ISessionContext | ISessionConnection
}

object IUrlResolverOptions {
  @scala.inline
  def apply(contents: IManager, session: ISessionContext | ISessionConnection): IUrlResolverOptions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUrlResolverOptions]
  }
}


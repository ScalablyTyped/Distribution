package typings.jupyterlabRendermime.registryMod.RenderMimeRegistry

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabServices.contentsMod.Contents.IManager
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a UrlResolver.
  */
@js.native
trait IUrlResolverOptions extends js.Object {
  
  /**
    * The contents manager used by the resolver.
    */
  var contents: IManager = js.native
  
  /**
    * The path providing context for local urls.
    *
    * #### Notes
    * Either session or path must be given, and path takes precedence.
    */
  var path: js.UndefOr[String] = js.native
  
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
  var session: js.UndefOr[ISessionContext | ISessionConnection] = js.native
}
object IUrlResolverOptions {
  
  @scala.inline
  def apply(contents: IManager): IUrlResolverOptions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrlResolverOptions]
  }
  
  @scala.inline
  implicit class IUrlResolverOptionsOps[Self <: IUrlResolverOptions] (val x: Self) extends AnyVal {
    
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
    def setContents(value: IManager): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSession(value: ISessionContext | ISessionConnection): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}

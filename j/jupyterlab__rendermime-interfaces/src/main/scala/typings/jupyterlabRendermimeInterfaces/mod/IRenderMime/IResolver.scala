package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that resolves relative URLs.
  */
@js.native
trait IResolver extends js.Object {
  
  /**
    * Get the download url for a given absolute url path.
    *
    * #### Notes
    * This URL may include a query parameter.
    */
  def getDownloadUrl(url: String): js.Promise[String] = js.native
  
  /**
    * Whether the URL should be handled by the resolver
    * or not.
    *
    * #### Notes
    * This is similar to the `isLocal` check in `URLExt`,
    * but can also perform additional checks on whether the
    * resolver should handle a given URL.
    */
  var isLocal: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.native
  
  /**
    * Resolve a relative url to an absolute url path.
    */
  def resolveUrl(url: String): js.Promise[String] = js.native
}
object IResolver {
  
  @scala.inline
  def apply(getDownloadUrl: String => js.Promise[String], resolveUrl: String => js.Promise[String]): IResolver = {
    val __obj = js.Dynamic.literal(getDownloadUrl = js.Any.fromFunction1(getDownloadUrl), resolveUrl = js.Any.fromFunction1(resolveUrl))
    __obj.asInstanceOf[IResolver]
  }
  
  @scala.inline
  implicit class IResolverOps[Self <: IResolver] (val x: Self) extends AnyVal {
    
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
    def setGetDownloadUrl(value: String => js.Promise[String]): Self = this.set("getDownloadUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveUrl(value: String => js.Promise[String]): Self = this.set("resolveUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLocal(value: /* url */ String => Boolean): Self = this.set("isLocal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsLocal: Self = this.set("isLocal", js.undefined)
  }
}

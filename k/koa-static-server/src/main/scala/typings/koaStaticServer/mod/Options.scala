package typings.koaStaticServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested
    */
  var gzip: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow transfer of hidden files. defaults to false
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  /**
    * don't execute any downstream middleware. defaults to true
    */
  var last: js.UndefOr[Boolean] = js.native
  
  /**
    * request access log to console
    */
  var log: js.UndefOr[Boolean] = js.native
  
  /**
    * Browser cache max-age in milliseconds. defaults to 0
    */
  var maxage: js.UndefOr[Double] = js.native
  
  /**
    * optional default file to serve if requested static is missing
    */
  var notFoundFile: js.UndefOr[String] = js.native
  
  /**
    * directory that is to be served
    */
  var rootDir: js.UndefOr[String] = js.native
  
  /**
    * optional rewrite path
    */
  var rootPath: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMaxage(value: Double): Self = this.set("maxage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxage: Self = this.set("maxage", js.undefined)
    
    @scala.inline
    def setNotFoundFile(value: String): Self = this.set("notFoundFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundFile: Self = this.set("notFoundFile", js.undefined)
    
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    
    @scala.inline
    def setRootPath(value: String): Self = this.set("rootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootPath: Self = this.set("rootPath", js.undefined)
  }
}

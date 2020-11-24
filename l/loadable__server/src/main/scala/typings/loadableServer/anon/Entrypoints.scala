package typings.loadableServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entrypoints extends js.Object {
  
  /**
    * Webpack entrypoints to load (default to `["main"]`)
    */
  var entrypoints: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * File system used to read files (default to fs)
    */
  var inputFileSystem: js.UndefOr[js.Object] = js.native
  
  /**
    * Optional namespace in case of multiple apps on same page
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * Optional output path (only for `requireEntrypoint`)
    */
  var outputPath: js.UndefOr[String] = js.native
  
  /**
    * Optional public path to override stats.publicPath at runtime
    */
  var publicPath: js.UndefOr[String] = js.native
}
object Entrypoints {
  
  @scala.inline
  def apply(): Entrypoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entrypoints]
  }
  
  @scala.inline
  implicit class EntrypointsOps[Self <: Entrypoints] (val x: Self) extends AnyVal {
    
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
    def setEntrypointsVarargs(value: String*): Self = this.set("entrypoints", js.Array(value :_*))
    
    @scala.inline
    def setEntrypoints(value: String | js.Array[String]): Self = this.set("entrypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrypoints: Self = this.set("entrypoints", js.undefined)
    
    @scala.inline
    def setInputFileSystem(value: js.Object): Self = this.set("inputFileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFileSystem: Self = this.set("inputFileSystem", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
  }
}

package typings.lessMiddleware.anon

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheFile extends js.Object {
  
  /**
    * Path to a JSON file that will be used to cache less data across server restarts.
    * This can greatly speed up initial load time after a server restart - if the less
    * files haven't changed and the css files still exist, specifying this option will
    * mean that the less files don't need to be recompiled after a server restart.
    */
  var cacheFile: js.UndefOr[String] = js.native
  
  /**
    * Show more verbose logging?
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Destination directory to output the compiled .css files.
    */
  var dest: js.UndefOr[String] = js.native
  
  /**
    * Always re-compile less files on each request.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * Only recompile once after each server restart.
    * Useful for reducing disk i/o on production.
    */
  var once: js.UndefOr[Boolean] = js.native
  
  /**
    * Common root of the source and destination.
    * It is prepended to both the source and destination before being used.
    */
  var pathRoot: js.UndefOr[String] = js.native
  
  /**
    * Object containing functions relevant to preprocessing data.
    */
  var postprocess: js.UndefOr[Css] = js.native
  
  /**
    * Object containing functions relevant to preprocessing data.
    */
  var preprocess: js.UndefOr[ImportPaths] = js.native
  
  /**
    * Options for the less render.
    */
  var render: js.UndefOr[Compress] = js.native
  
  /**
    * Function that is in charge of storing the css in the filesystem.
    */
  var storeCss: js.UndefOr[
    js.Function4[
      /* pathname */ String, 
      /* css */ String, 
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* next */ js.Function, 
      Unit
    ]
  ] = js.native
}
object CacheFile {
  
  @scala.inline
  def apply(): CacheFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheFile]
  }
  
  @scala.inline
  implicit class CacheFileOps[Self <: CacheFile] (val x: Self) extends AnyVal {
    
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
    def setCacheFile(value: String): Self = this.set("cacheFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheFile: Self = this.set("cacheFile", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setPathRoot(value: String): Self = this.set("pathRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathRoot: Self = this.set("pathRoot", js.undefined)
    
    @scala.inline
    def setPostprocess(value: Css): Self = this.set("postprocess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostprocess: Self = this.set("postprocess", js.undefined)
    
    @scala.inline
    def setPreprocess(value: ImportPaths): Self = this.set("preprocess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
    
    @scala.inline
    def setRender(value: Compress): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setStoreCss(
      value: (/* pathname */ String, /* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], /* next */ js.Function) => Unit
    ): Self = this.set("storeCss", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteStoreCss: Self = this.set("storeCss", js.undefined)
  }
}

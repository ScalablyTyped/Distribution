package typings.gulpCache.mod.gc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICacheOptions extends js.Object {
  
  /**
    * Specifies the name of the directory where the cache
    * is to be stored.
    */
  var cacheDirName: String = js.native
}
object ICacheOptions {
  
  @scala.inline
  def apply(cacheDirName: String): ICacheOptions = {
    val __obj = js.Dynamic.literal(cacheDirName = cacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheOptions]
  }
  
  @scala.inline
  implicit class ICacheOptionsOps[Self <: ICacheOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheDirName(value: String): Self = this.set("cacheDirName", value.asInstanceOf[js.Any])
  }
}

package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderContext extends js.Object {
  
  /**
    * fragment object
    */
  var frag: Fragment = js.native
  
  /**
    * level id
    */
  var level: Double = js.native
  
  /**
    * true if onProgress should report partial chunk of loaded content
    */
  var progressData: js.UndefOr[Boolean] = js.native
  
  /**
    * end byte range offset
    */
  var rangeEnd: js.UndefOr[Double] = js.native
  
  /**
    * start byte range offset
    */
  var rangeStart: js.UndefOr[Double] = js.native
  
  /**
    * loader response type (arraybuffer or default response type for playlist)
    */
  var responseType: String = js.native
  
  /**
    * request type
    * - level, manifest
    */
  var `type`: String = js.native
  
  /**
    * target URL
    */
  var url: String = js.native
}
object LoaderContext {
  
  @scala.inline
  def apply(frag: Fragment, level: Double, responseType: String, `type`: String, url: String): LoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderContext]
  }
  
  @scala.inline
  implicit class LoaderContextOps[Self <: LoaderContext] (val x: Self) extends AnyVal {
    
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
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressData(value: Boolean): Self = this.set("progressData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressData: Self = this.set("progressData", js.undefined)
    
    @scala.inline
    def setRangeEnd(value: Double): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeEnd: Self = this.set("rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: Double): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeStart: Self = this.set("rangeStart", js.undefined)
  }
}

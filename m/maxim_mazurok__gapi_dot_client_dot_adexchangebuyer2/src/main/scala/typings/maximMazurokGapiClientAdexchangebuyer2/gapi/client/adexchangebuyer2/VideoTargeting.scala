package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoTargeting extends js.Object {
  
  /** A list of video positions to be excluded. Position types can either be included or excluded (XOR). */
  var excludedPositionTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of video positions to be included. When the included list is present, the excluded list must be empty. When the excluded list is present, the included list must be empty. */
  var targetedPositionTypes: js.UndefOr[js.Array[String]] = js.native
}
object VideoTargeting {
  
  @scala.inline
  def apply(): VideoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoTargeting]
  }
  
  @scala.inline
  implicit class VideoTargetingOps[Self <: VideoTargeting] (val x: Self) extends AnyVal {
    
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
    def setExcludedPositionTypesVarargs(value: String*): Self = this.set("excludedPositionTypes", js.Array(value :_*))
    
    @scala.inline
    def setExcludedPositionTypes(value: js.Array[String]): Self = this.set("excludedPositionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedPositionTypes: Self = this.set("excludedPositionTypes", js.undefined)
    
    @scala.inline
    def setTargetedPositionTypesVarargs(value: String*): Self = this.set("targetedPositionTypes", js.Array(value :_*))
    
    @scala.inline
    def setTargetedPositionTypes(value: js.Array[String]): Self = this.set("targetedPositionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedPositionTypes: Self = this.set("targetedPositionTypes", js.undefined)
  }
}

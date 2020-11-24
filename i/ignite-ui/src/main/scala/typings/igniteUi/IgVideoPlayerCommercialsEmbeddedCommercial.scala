package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgVideoPlayerCommercialsEmbeddedCommercial
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets the end second of the embedded commercial.
    *
    */
  var endTime: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the sponsored link of the embedded commercial.
    *
    */
  var link: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the start second of the embedded commercial.
    *
    */
  var startTime: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the tooltip for the bookmark of the embedded commercial.
    *
    */
  var title: js.UndefOr[String] = js.native
}
object IgVideoPlayerCommercialsEmbeddedCommercial {
  
  @scala.inline
  def apply(): IgVideoPlayerCommercialsEmbeddedCommercial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercialsEmbeddedCommercial]
  }
  
  @scala.inline
  implicit class IgVideoPlayerCommercialsEmbeddedCommercialOps[Self <: IgVideoPlayerCommercialsEmbeddedCommercial] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

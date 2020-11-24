package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for any related URL information
  */
@js.native
trait SchemaRelatedUrl extends js.Object {
  
  /**
    * Label to describe usage of the URL
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Specific URL to associate with the note
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaRelatedUrl {
  
  @scala.inline
  def apply(): SchemaRelatedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelatedUrl]
  }
  
  @scala.inline
  implicit class SchemaRelatedUrlOps[Self <: SchemaRelatedUrl] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

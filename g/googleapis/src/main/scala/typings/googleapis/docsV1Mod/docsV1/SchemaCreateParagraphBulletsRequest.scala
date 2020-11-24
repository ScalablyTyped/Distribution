package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates bullets for all of the paragraphs that overlap with the given
  * range.  The nesting level of each paragraph will be determined by counting
  * leading tabs in front of each paragraph. To avoid excess space between the
  * bullet and the corresponding paragraph, these leading tabs are removed by
  * this request. This may change the indices of parts of the text.  If the
  * paragraph immediately before paragraphs being updated is in a list with a
  * matching preset, the paragraphs being updated are added to that preceding
  * list.
  */
@js.native
trait SchemaCreateParagraphBulletsRequest extends js.Object {
  
  /**
    * The kinds of bullet glyphs to be used.
    */
  var bulletPreset: js.UndefOr[String] = js.native
  
  /**
    * The range to apply the bullet preset to.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}
object SchemaCreateParagraphBulletsRequest {
  
  @scala.inline
  def apply(): SchemaCreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateParagraphBulletsRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateParagraphBulletsRequestOps[Self <: SchemaCreateParagraphBulletsRequest] (val x: Self) extends AnyVal {
    
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
    def setBulletPreset(value: String): Self = this.set("bulletPreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletPreset: Self = this.set("bulletPreset", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}

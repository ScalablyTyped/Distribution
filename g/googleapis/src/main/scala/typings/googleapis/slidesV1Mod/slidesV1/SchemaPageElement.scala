package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A visual element rendered on a page.
  */
@js.native
trait SchemaPageElement extends js.Object {
  
  /**
    * The description of the page element. Combined with title to display alt
    * text.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A collection of page elements joined as a single unit.
    */
  var elementGroup: js.UndefOr[SchemaGroup] = js.native
  
  /**
    * An image page element.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  
  /**
    * A line page element.
    */
  var line: js.UndefOr[SchemaLine] = js.native
  
  /**
    * The object ID for this page element. Object IDs used by
    * google.apps.slides.v1.Page and google.apps.slides.v1.PageElement share
    * the same namespace.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * A generic shape.
    */
  var shape: js.UndefOr[SchemaShape] = js.native
  
  /**
    * A linked chart embedded from Google Sheets. Unlinked charts are
    * represented as images.
    */
  var sheetsChart: js.UndefOr[SchemaSheetsChart] = js.native
  
  /**
    * The size of the page element.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  
  /**
    * A table page element.
    */
  var table: js.UndefOr[SchemaTable] = js.native
  
  /**
    * The title of the page element. Combined with description to display alt
    * text.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The transform of the page element.  The visual appearance of the page
    * element is determined by its absolute transform. To compute the absolute
    * transform, preconcatenate a page element&#39;s transform with the
    * transforms of all of its parent groups. If the page element is not in a
    * group, its absolute transform is the same as the value in this field. The
    * initial transform for the newly created Group is always the identity
    * transform.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
  
  /**
    * A video page element.
    */
  var video: js.UndefOr[SchemaVideo] = js.native
  
  /**
    * A word art page element.
    */
  var wordArt: js.UndefOr[SchemaWordArt] = js.native
}
object SchemaPageElement {
  
  @scala.inline
  def apply(): SchemaPageElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageElement]
  }
  
  @scala.inline
  implicit class SchemaPageElementOps[Self <: SchemaPageElement] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setElementGroup(value: SchemaGroup): Self = this.set("elementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementGroup: Self = this.set("elementGroup", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLine(value: SchemaLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setShape(value: SchemaShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSheetsChart(value: SchemaSheetsChart): Self = this.set("sheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsChart: Self = this.set("sheetsChart", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaTable): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransform(value: SchemaAffineTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setVideo(value: SchemaVideo): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setWordArt(value: SchemaWordArt): Self = this.set("wordArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordArt: Self = this.set("wordArt", js.undefined)
  }
}

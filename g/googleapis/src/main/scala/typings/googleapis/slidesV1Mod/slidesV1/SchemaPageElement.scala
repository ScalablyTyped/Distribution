package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A visual element rendered on a page.
  */
@js.native
trait SchemaPageElement extends StObject {
  
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
  implicit class SchemaPageElementMutableBuilder[Self <: SchemaPageElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setElementGroup(value: SchemaGroup): Self = StObject.set(x, "elementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementGroupUndefined: Self = StObject.set(x, "elementGroup", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLine(value: SchemaLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setShape(value: SchemaShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSheetsChart(value: SchemaSheetsChart): Self = StObject.set(x, "sheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChartUndefined: Self = StObject.set(x, "sheetsChart", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransform(value: SchemaAffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setVideo(value: SchemaVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setWordArt(value: SchemaWordArt): Self = StObject.set(x, "wordArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordArtUndefined: Self = StObject.set(x, "wordArt", js.undefined)
  }
}

package typings.handsontable

import typings.handsontable.anon.Height
import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsCommentsCommentsMod {
  
  @JSImport("handsontable/plugins/comments/comments", "Comments")
  @js.native
  open class Comments protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def clearRange(): Unit = js.native
    
    def getComment(): String = js.native
    
    def getCommentAtCell(row: Double, column: Double): String = js.native
    
    def getCommentMeta(row: Double, column: Double, property: String): Any = js.native
    
    def hide(): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    var range: CommentsRangeObject = js.native
    
    def refreshEditor(): Unit = js.native
    def refreshEditor(force: Boolean): Unit = js.native
    
    def removeComment(): Unit = js.native
    def removeComment(forceRender: Boolean): Unit = js.native
    
    def removeCommentAtCell(row: Double, column: Double): Unit = js.native
    def removeCommentAtCell(row: Double, column: Double, forceRender: Boolean): Unit = js.native
    
    def setComment(value: String): Unit = js.native
    
    def setCommentAtCell(row: Double, column: Double, value: String): Unit = js.native
    
    def setRange(range: CommentsRangeObject): Unit = js.native
    
    def show(): Boolean = js.native
    
    def showAtCell(row: Double, column: Double): Boolean = js.native
    
    def updateCommentMeta(row: Double, column: Double, metaObject: js.Object): Unit = js.native
  }
  
  trait CommentConfig extends StObject {
    
    var col: Double
    
    var comment: CommentObject
    
    var row: Double
  }
  object CommentConfig {
    
    inline def apply(col: Double, comment: CommentObject, row: Double): CommentConfig = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentConfig] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setComment(value: CommentObject): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommentObject extends StObject {
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Height] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object CommentObject {
    
    inline def apply(): CommentObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentObject] (val x: Self) extends AnyVal {
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStyle(value: Height): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CommentsRangeObject extends StObject {
    
    var from: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    
    var to: js.UndefOr[typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default] = js.undefined
  }
  object CommentsRangeObject {
    
    inline def apply(from: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CommentsRangeObject = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentsRangeObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentsRangeObject] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait DetailedSettings extends StObject {
    
    var displayDelay: js.UndefOr[Double] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetailedSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayDelay(value: Double): Self = StObject.set(x, "displayDelay", value.asInstanceOf[js.Any])
      
      inline def setDisplayDelayUndefined: Self = StObject.set(x, "displayDelay", js.undefined)
    }
  }
  
  type Settings = Boolean | DetailedSettings
}

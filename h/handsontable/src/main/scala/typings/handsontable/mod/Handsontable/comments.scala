package typings.handsontable.mod.Handsontable

import typings.handsontable.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Plugin options
object comments {
  
  @js.native
  trait CommentConfig extends StObject {
    
    var col: Double = js.native
    
    var comment: CommentObject = js.native
    
    var row: Double = js.native
  }
  object CommentConfig {
    
    @scala.inline
    def apply(col: Double, comment: CommentObject, row: Double): CommentConfig = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentConfig]
    }
    
    @scala.inline
    implicit class CommentConfigMutableBuilder[Self <: CommentConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: CommentObject): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommentObject extends StObject {
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[Height] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object CommentObject {
    
    @scala.inline
    def apply(): CommentObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentObject]
    }
    
    @scala.inline
    implicit class CommentObjectMutableBuilder[Self <: CommentObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStyle(value: Height): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    var displayDelay: js.UndefOr[Double] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayDelay(value: Double): Self = StObject.set(x, "displayDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayDelayUndefined: Self = StObject.set(x, "displayDelay", js.undefined)
    }
  }
}

package typings.jupyterlabStatusbar

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabStatusbar.lineColMod.LineCol.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineColMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/lineCol", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol () extends VDomRenderer[Model] {
    
    /**
      * A click handler for the widget.
      */
    /* private */ var _handleClick: js.Any = js.native
    
    /**
      * Handle submission for the widget.
      */
    /* private */ var _handleSubmit: js.Any = js.native
    
    /* private */ var _popup: js.Any = js.native
  }
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/lineCol", "LineCol.Model")
    @js.native
    class Model () extends VDomModel {
      
      /* private */ var _column: js.Any = js.native
      
      /* private */ var _editor: js.Any = js.native
      
      /* private */ var _getAllState: js.Any = js.native
      
      /* private */ var _line: js.Any = js.native
      
      /**
        * React to a change in the cursors of the current editor.
        */
      /* private */ var _onSelectionChanged: js.Any = js.native
      
      /* private */ var _triggerChange: js.Any = js.native
      
      /**
        * The current column of the model.
        */
      def column: Double = js.native
      
      /**
        * The current editor of the model.
        */
      def editor: IEditor | Null = js.native
      def editor_=(editor: IEditor | Null): Unit = js.native
      
      /**
        * The current line of the model.
        */
      def line: Double = js.native
    }
  }
  
  /**
    * A namespace for LineColComponent.
    */
  object LineColComponent {
    
    /**
      * Props for LineColComponent.
      */
    trait IProps extends StObject {
      
      /**
        * The current column number.
        */
      var column: Double
      
      /**
        * A click handler for the LineColComponent, which
        * we use to launch the LineFormComponent.
        */
      def handleClick(): Unit
      
      /**
        * The current line number.
        */
      var line: Double
    }
    object IProps {
      
      inline def apply(column: Double, handleClick: () => Unit, line: Double): IProps = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handleClick = js.Any.fromFunction0(handleClick), line = line.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      extension [Self <: IProps](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setHandleClick(value: () => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction0(value))
        
        inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      }
    }
  }
}

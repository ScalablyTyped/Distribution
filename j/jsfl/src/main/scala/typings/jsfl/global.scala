package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // ElementSelector
  // http://www.xjsfl.com/support/api/elements/ItemSelector
  inline def $(selector: String): ItemCollection = js.Dynamic.global.applyDynamic("$$")(selector.asInstanceOf[js.Any]).asInstanceOf[ItemCollection]
  
  @JSGlobal("_Context")
  @js.native
  class Context ()
    extends StObject
       with typings.jsfl.Context {
    
    /* CompleteClass */
    var elements: js.Array[FlashElement] = js.native
    
    /* CompleteClass */
    var frame: FlashFrame = js.native
    
    /* CompleteClass */
    override def goto(): js.Any = js.native
    
    /* CompleteClass */
    var keyframes: js.Array[FlashFrame] = js.native
    
    /* CompleteClass */
    var layer: FlashLayer = js.native
    
    /* CompleteClass */
    override def setLayer(index: Double): js.Any = js.native
    
    /* CompleteClass */
    override def update(): js.Any = js.native
  }
  object Context {
    
    @JSGlobal("_Context")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(): typings.jsfl.Context = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jsfl.Context]
    
    /* static member */
    inline def from(frame: FlashFrame): typings.jsfl.Context = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(frame.asInstanceOf[js.Any]).asInstanceOf[typings.jsfl.Context]
  }
  
  @JSGlobal("FLfile")
  @js.native
  def FLfile: FlashFLfile = js.native
  inline def FLfile_=(x: FlashFLfile): Unit = js.Dynamic.global.updateDynamic("FLfile")(x.asInstanceOf[js.Any])
  
  @JSGlobal("_File")
  @js.native
  class File protected ()
    extends StObject
       with typings.jsfl.File {
    def this(path: String) = this()
    
    /* CompleteClass */
    var contents: String = js.native
    
    /* CompleteClass */
    override def copy(path: String): typings.jsfl.File = js.native
    
    /* CompleteClass */
    override def write(data: String): typings.jsfl.File = js.native
  }
  
  @JSGlobal("_Folder")
  @js.native
  class Folder protected ()
    extends StObject
       with typings.jsfl.Folder {
    def this(path: String) = this()
    
    /* CompleteClass */
    var contents: js.Array[typings.jsfl.File] = js.native
  }
  
  @JSGlobal("SpriteSheetExporter")
  @js.native
  class SpriteSheetExporter ()
    extends StObject
       with typings.jsfl.SpriteSheetExporter
  
  @JSGlobal("_URI")
  @js.native
  class _URI protected ()
    extends StObject
       with typings.jsfl._URI {
    def this(path: String) = this()
    
    /* CompleteClass */
    var `extension`: String = js.native
    
    /* CompleteClass */
    var folder: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    override def toURI(string: String): String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var uri: String = js.native
  }
  
  // http://www.xjsfl.com/support/guides/working-with-flash/introduction-to-selectors
  // http://www.xjsfl.com/support/api/elements/ElementSelector
  inline def _empty(selector: String): ElementCollection = js.Dynamic.global.applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[ElementCollection]
  
  inline def alert(alertText: String): Unit = js.Dynamic.global.applyDynamic("alert")(alertText.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clear(): Unit = js.Dynamic.global.applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def confirm(strAlert: String): Boolean = js.Dynamic.global.applyDynamic("confirm")(strAlert.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def debug(item: js.Any): Unit = js.Dynamic.global.applyDynamic("debug")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // Global variables
  @JSGlobal("$dom")
  @js.native
  def dom: FlashDocument = js.native
  
  inline def dom_=(x: FlashDocument): Unit = js.Dynamic.global.updateDynamic("$dom")(x.asInstanceOf[js.Any])
  
  @JSGlobal("fl")
  @js.native
  def fl: FlashFL = js.native
  inline def fl_=(x: FlashFL): Unit = js.Dynamic.global.updateDynamic("fl")(x.asInstanceOf[js.Any])
  
  inline def format(format: String, params: js.Any*): Unit = (js.Dynamic.global.applyDynamic("format")(format.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Library / class loading
  inline def include(className: String): Unit = js.Dynamic.global.applyDynamic("include")(className.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // Inspection and debugging
  inline def inspect(item: js.Any): Unit = js.Dynamic.global.applyDynamic("inspect")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("$library")
  @js.native
  def library: FlashLibrary = js.native
  
  inline def library_=(x: FlashLibrary): Unit = js.Dynamic.global.updateDynamic("$library")(x.asInstanceOf[js.Any])
  
  inline def list(item: js.Any): Unit = js.Dynamic.global.applyDynamic("list")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // File
  inline def load(filePath: String): String = js.Dynamic.global.applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prompt(promptMsg: String): String = js.Dynamic.global.applyDynamic("prompt")(promptMsg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prompt(promptMsg: String, text: String): String = (js.Dynamic.global.applyDynamic("prompt")(promptMsg.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def require(className: String): Unit = js.Dynamic.global.applyDynamic("require")(className.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def save(filePath: String, data: String): Unit = (js.Dynamic.global.applyDynamic("save")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("$selection")
  @js.native
  def selection: js.Array[FlashElement] = js.native
  
  inline def selection_=(x: js.Array[FlashElement]): Unit = js.Dynamic.global.updateDynamic("$selection")(x.asInstanceOf[js.Any])
  
  @JSGlobal("$timeline")
  @js.native
  def timeline: FlashTimeline = js.native
  
  inline def timeline_=(x: FlashTimeline): Unit = js.Dynamic.global.updateDynamic("$timeline")(x.asInstanceOf[js.Any])
  
  // Global functions
  // Output
  inline def trace(args: js.Any*): Unit = js.Dynamic.global.applyDynamic("trace")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("xjsfl")
  @js.native
  def xjsfl: typings.jsfl.xjsfl = js.native
  inline def xjsfl_=(x: xjsfl): Unit = js.Dynamic.global.updateDynamic("xjsfl")(x.asInstanceOf[js.Any])
}

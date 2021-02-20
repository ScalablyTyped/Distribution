package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // ElementSelector
  // http://www.xjsfl.com/support/api/elements/ItemSelector
  @JSGlobal("$$")
  @js.native
  def $(selector: String): ItemCollection = js.native
  
  @JSGlobal("_Context")
  @js.native
  class Context ()
    extends typings.jsfl.Context
  object Context {
    
    /* static member */
    @JSGlobal("_Context.create")
    @js.native
    def create(): typings.jsfl.Context = js.native
    
    /* static member */
    @JSGlobal("_Context.from")
    @js.native
    def from(frame: FlashFrame): typings.jsfl.Context = js.native
  }
  
  @JSGlobal("FLfile")
  @js.native
  def FLfile: FlashFLfile = js.native
  @scala.inline
  def FLfile_=(x: FlashFLfile): Unit = js.Dynamic.global.updateDynamic("FLfile")(x.asInstanceOf[js.Any])
  
  @JSGlobal("_File")
  @js.native
  class File protected ()
    extends typings.jsfl.File {
    def this(path: String) = this()
  }
  
  @JSGlobal("_Folder")
  @js.native
  class Folder protected ()
    extends typings.jsfl.Folder {
    def this(path: String) = this()
  }
  
  @JSGlobal("SpriteSheetExporter")
  @js.native
  class SpriteSheetExporter ()
    extends typings.jsfl.SpriteSheetExporter
  
  @JSGlobal("_URI")
  @js.native
  class _URI protected ()
    extends typings.jsfl._URI {
    def this(path: String) = this()
  }
  
  // http://www.xjsfl.com/support/guides/working-with-flash/introduction-to-selectors
  // http://www.xjsfl.com/support/api/elements/ElementSelector
  @JSGlobal("$")
  @js.native
  def _empty(selector: String): ElementCollection = js.native
  
  @JSGlobal("alert")
  @js.native
  def alert(alertText: String): Unit = js.native
  
  @JSGlobal("clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSGlobal("confirm")
  @js.native
  def confirm(strAlert: String): Boolean = js.native
  
  @JSGlobal("debug")
  @js.native
  def debug(item: js.Any): Unit = js.native
  
  // Global variables
  @JSGlobal("$dom")
  @js.native
  def dom: FlashDocument = js.native
  
  @scala.inline
  def dom_=(x: FlashDocument): Unit = js.Dynamic.global.updateDynamic("$dom")(x.asInstanceOf[js.Any])
  
  @JSGlobal("fl")
  @js.native
  def fl: FlashFL = js.native
  @scala.inline
  def fl_=(x: FlashFL): Unit = js.Dynamic.global.updateDynamic("fl")(x.asInstanceOf[js.Any])
  
  @JSGlobal("format")
  @js.native
  def format(format: String, params: js.Any*): Unit = js.native
  
  // Library / class loading
  @JSGlobal("include")
  @js.native
  def include(className: String): Unit = js.native
  
  // Inspection and debugging
  @JSGlobal("inspect")
  @js.native
  def inspect(item: js.Any): Unit = js.native
  
  @JSGlobal("$library")
  @js.native
  def library: FlashLibrary = js.native
  
  @scala.inline
  def library_=(x: FlashLibrary): Unit = js.Dynamic.global.updateDynamic("$library")(x.asInstanceOf[js.Any])
  
  @JSGlobal("list")
  @js.native
  def list(item: js.Any): Unit = js.native
  
  // File
  @JSGlobal("load")
  @js.native
  def load(filePath: String): String = js.native
  
  @JSGlobal("prompt")
  @js.native
  def prompt(promptMsg: String): String = js.native
  @JSGlobal("prompt")
  @js.native
  def prompt(promptMsg: String, text: String): String = js.native
  
  @JSGlobal("require")
  @js.native
  def require(className: String): Unit = js.native
  
  @JSGlobal("save")
  @js.native
  def save(filePath: String, data: String): Unit = js.native
  
  @JSGlobal("$selection")
  @js.native
  def selection: js.Array[FlashElement] = js.native
  
  @scala.inline
  def selection_=(x: js.Array[FlashElement]): Unit = js.Dynamic.global.updateDynamic("$selection")(x.asInstanceOf[js.Any])
  
  @JSGlobal("$timeline")
  @js.native
  def timeline: FlashTimeline = js.native
  
  @scala.inline
  def timeline_=(x: FlashTimeline): Unit = js.Dynamic.global.updateDynamic("$timeline")(x.asInstanceOf[js.Any])
  
  // Global functions
  // Output
  @JSGlobal("trace")
  @js.native
  def trace(args: js.Any*): Unit = js.native
  
  @JSGlobal("xjsfl")
  @js.native
  def xjsfl: typings.jsfl.xjsfl = js.native
  @scala.inline
  def xjsfl_=(x: xjsfl): Unit = js.Dynamic.global.updateDynamic("xjsfl")(x.asInstanceOf[js.Any])
}

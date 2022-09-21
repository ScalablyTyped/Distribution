package typings.karmaFixture

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object fixture {
    
    @JSGlobal("fixture")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
    
    @JSGlobal("fixture.el")
    @js.native
    def el: HTMLElement = js.native
    inline def el_=(x: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("el")(x.asInstanceOf[js.Any])
    
    @JSGlobal("fixture.json")
    @js.native
    def json: js.Array[Any] = js.native
    inline def json_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    inline def load(file1: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def load(file1: String, append: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String, append: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String, file3: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any], file3.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String, file3: String, append: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any], file3.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String, file3: String, file4: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any], file3.asInstanceOf[js.Any], file4.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String, file3: String, file4: String, append: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any], file3.asInstanceOf[js.Any], file4.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String, file3: String, file4: String, file5: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any], file3.asInstanceOf[js.Any], file4.asInstanceOf[js.Any], file5.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(file1: String, file2: String, file3: String, file4: String, file5: String, append: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(file1.asInstanceOf[js.Any], file2.asInstanceOf[js.Any], file3.asInstanceOf[js.Any], file4.asInstanceOf[js.Any], file5.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def load(files: String*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(files.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def set(htmlStr1: String): HTMLElement | js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, htmlStr2: String): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, htmlStr2: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, htmlStr2: String, htmlStr3: String): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any], htmlStr3.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any], htmlStr3.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, htmlStr4: String): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any], htmlStr3.asInstanceOf[js.Any], htmlStr4.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, htmlStr4: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any], htmlStr3.asInstanceOf[js.Any], htmlStr4.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, htmlStr4: String, htmlStr5: String): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any], htmlStr3.asInstanceOf[js.Any], htmlStr4.asInstanceOf[js.Any], htmlStr5.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(
      htmlStr1: String,
      htmlStr2: String,
      htmlStr3: String,
      htmlStr4: String,
      htmlStr5: String,
      append: Boolean
    ): HTMLElement | js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStr1.asInstanceOf[js.Any], htmlStr2.asInstanceOf[js.Any], htmlStr3.asInstanceOf[js.Any], htmlStr4.asInstanceOf[js.Any], htmlStr5.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    inline def set(htmlStrs: String*): HTMLElement | js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(htmlStrs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[HTMLElement | js.Array[HTMLElement]]
    
    inline def setBase(fixtureBasePath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBase")(fixtureBasePath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

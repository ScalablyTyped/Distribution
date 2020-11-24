package typings.karmaFixture

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object fixture extends js.Object {
    
    def cleanup(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    var json: js.Array[js.Any] = js.native
    
    def load(file1: String): js.Any = js.native
    def load(file1: String, append: Boolean): js.Any = js.native
    def load(file1: String, file2: String): js.Any = js.native
    def load(file1: String, file2: String, append: Boolean): js.Any = js.native
    def load(file1: String, file2: String, file3: String): js.Any = js.native
    def load(file1: String, file2: String, file3: String, append: Boolean): js.Any = js.native
    def load(file1: String, file2: String, file3: String, file4: String): js.Any = js.native
    def load(file1: String, file2: String, file3: String, file4: String, append: Boolean): js.Any = js.native
    def load(file1: String, file2: String, file3: String, file4: String, file5: String): js.Any = js.native
    def load(file1: String, file2: String, file3: String, file4: String, file5: String, append: Boolean): js.Any = js.native
    def load(files: String*): js.Any = js.native
    
    def set(htmlStr1: String): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, htmlStr2: String): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, htmlStr2: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, htmlStr2: String, htmlStr3: String): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, htmlStr4: String): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, htmlStr4: String, append: Boolean): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStr1: String, htmlStr2: String, htmlStr3: String, htmlStr4: String, htmlStr5: String): HTMLElement | js.Array[HTMLElement] = js.native
    def set(
      htmlStr1: String,
      htmlStr2: String,
      htmlStr3: String,
      htmlStr4: String,
      htmlStr5: String,
      append: Boolean
    ): HTMLElement | js.Array[HTMLElement] = js.native
    def set(htmlStrs: String*): HTMLElement | js.Array[HTMLElement] = js.native
    
    def setBase(fixtureBasePath: String): Unit = js.native
  }
}

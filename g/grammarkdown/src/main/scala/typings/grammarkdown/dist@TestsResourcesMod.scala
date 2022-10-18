package typings.grammarkdown

import typings.grammarkdown.distHostsNodeMod.NodeAsyncHost
import typings.grammarkdown.distHostsNodeMod.NodeAsyncHostOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@TestsResourcesMod` {
  
  @JSImport("grammarkdown/dist/@/tests/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grammarkdown/dist/@/tests/resources", "TestFileHost")
  @js.native
  open class TestFileHost protected () extends NodeAsyncHost {
    def this(file: TestFile) = this()
    def this(file: TestFile, options: NodeAsyncHostOptions) = this()
    
    /* private */ var file: Any = js.native
    
    def isTestFile(file: String): Boolean = js.native
  }
  
  inline def getGrammarFiles(): js.Array[TestFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGrammarFiles")().asInstanceOf[js.Array[TestFile]]
  
  trait TestFile extends StObject {
    
    val basename: String
    
    val content: String
    
    val options: Record[String, String]
    
    val path: String
    
    val relative: String
  }
  object TestFile {
    
    inline def apply(basename: String, content: String, options: Record[String, String], path: String, relative: String): TestFile = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestFile]
    }
    
    extension [Self <: TestFile](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Record[String, String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    }
  }
}

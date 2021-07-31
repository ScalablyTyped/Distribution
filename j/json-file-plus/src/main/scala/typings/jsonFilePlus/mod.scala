package typings.jsonFilePlus

import typings.jsonFilePlus.jsonFilePlusStrings.Charactertabulation
import typings.node.Buffer
import typings.std.Error
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(filename: String): js.Promise[JSONFile] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONFile]]
  
  @JSImport("json-file-plus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json-file-plus", "JSONData")
  @js.native
  class JSONData protected () extends StObject {
    def this(raw: String) = this()
    
    var data: js.Any = js.native
    
    var format: Format = js.native
    
    def get(key: PropertyKey): js.Promise[js.Any] = js.native
    
    def remove(key: PropertyKey): js.Promise[Unit] = js.native
    
    def set(data: js.Any): Unit = js.native
    
    def stringify(): Buffer = js.native
  }
  
  @JSImport("json-file-plus", "JSONFile")
  @js.native
  class JSONFile protected () extends JSONData {
    def this(filename: String, raw: String) = this()
    
    var filename: String = js.native
    
    def save(): js.Promise[Unit] = js.native
    def save(cb: js.Function1[/* err */ Error, Unit]): js.Promise[Unit] = js.native
    
    def saveSync(): Unit = js.native
  }
  
  @scala.inline
  def sync(filename: String): JSONFile = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any]).asInstanceOf[JSONFile]
  
  trait Format extends StObject {
    
    val indent: Double | Charactertabulation
    
    val trailing: Boolean
  }
  object Format {
    
    @scala.inline
    def apply(indent: Double | Charactertabulation, trailing: Boolean): Format = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: Double | Charactertabulation): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    }
  }
}

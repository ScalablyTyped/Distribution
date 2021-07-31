package typings.jestSerializer

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("jest-serializer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-serializer", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* buffer */ Buffer, js.Any] = js.native
    @scala.inline
    def deserialize(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def deserialize_=(x: js.Function1[/* buffer */ Buffer, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-serializer", "default.readFileSync")
    @js.native
    def readFileSync: js.Function1[/* filePath */ Path, js.Any] = js.native
    @scala.inline
    def readFileSync(filePath: Path): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def readFileSync_=(x: js.Function1[/* filePath */ Path, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFileSync")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-serializer", "default.serialize")
    @js.native
    def serialize: js.Function1[/* content */ js.Any, Buffer] = js.native
    @scala.inline
    def serialize(content: js.Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(content.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    @scala.inline
    def serialize_=(x: js.Function1[/* content */ js.Any, Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-serializer", "default.writeFileSync")
    @js.native
    def writeFileSync: js.Function2[/* filePath */ Path, /* content */ js.Any, Unit] = js.native
    @scala.inline
    def writeFileSync(filePath: Path, content: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filePath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def writeFileSync_=(x: js.Function2[/* filePath */ Path, /* content */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFileSync")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def deserialize(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def readFileSync(filePath: Path): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def serialize(content: js.Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(content.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def writeFileSync(filePath: Path, content: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filePath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Path = String
}
